package com.kiwi;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.kiwi.request.Request;
import com.kiwi.response.Errors;
import com.kiwi.response.Result;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Vivid
{
	public static final String URL = "https://vision.googleapis.com/v1/images:annotate?key=";
	private final String key;
	
	public static final MediaType mt = MediaType.parse("application/json; charset=utf-8");
	private OkHttpClient okHttpClient = new OkHttpClient();
	
	private static final Type responseType = new TypeReference<Result>(){}.getType();
	private static final Type errorType = new TypeReference<Errors>(){}.getType();

	public Vivid(String key)
	{
		this.key = key;
	}	

	public void setOkHttpClient(OkHttpClient okHttpClient)
	{
		this.okHttpClient = okHttpClient;
	}

	public Result post(List<Request> requests) throws IOException
	{
		String json = toJSON(requests);

		RequestBody body = RequestBody.create(mt, json);

		okhttp3.Request request = new okhttp3.Request.Builder().url(URL + key)
										.post(body)
										.build();

		Response response = okHttpClient.newCall(request).execute();

		String resultJson = response.body().string();

		if(response.code() != 200)
		{			
			Errors errors = JSON.parseObject(resultJson, errorType);
			
			Result result = new Result();
			result.setErrors(errors);
			
			return result;
		}
		
		Result result = JSON.parseObject(resultJson, responseType);

		return result;
	}

	private String toJSON(List<Request> requests)
	{
		Map<String, Object> map = new HashMap<>();
		map.put("requests", requests);

		String json = JSON.toJSONString(map, SerializerFeature.DisableCircularReferenceDetect,
		        SerializerFeature.PrettyFormat);

		return json;
	}

}
