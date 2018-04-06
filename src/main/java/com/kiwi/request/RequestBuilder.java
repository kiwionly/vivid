package com.kiwi.request;

import java.util.ArrayList;
import java.util.List;

import com.kiwi.request.Image.ImageSource;
import com.kiwi.request.ImageContext.CropHintsParams;
import com.kiwi.request.ImageContext.LatLng;

public class RequestBuilder
{	
	private Request request = new Request();
	
	public RequestBuilder content(String base64)
	{
		request.getImage().setContent(base64);
		
		return this;
	}

	public RequestBuilder gcsImageUri(String gcsImageUri)
	{
		ImageSource source = request.getImage().getSource();
		
		if(source == null)
		{
			source = new ImageSource();
			request.getImage().setSource(source);
		}
		
		source.setGcsImageUri(gcsImageUri);
		
		return this;
	}

	public RequestBuilder imageUri(String imageUri)
	{
		ImageSource source = request.getImage().getSource();
		
		if(source == null)
		{
			source = new ImageSource();
			request.getImage().setSource(source);
		}
		
		source.setImageUri(imageUri);
		
		return this;
	}

	public RequestBuilder addFeature(String type)
	{
		request.getFeatures().add(new Feature(type));
		
		return this;
	}

	public RequestBuilder addFeature(String type, int maxResult)
	{
		request.getFeatures().add(new Feature(type, maxResult));
		
		return this;
	}
	
	public RequestBuilder addLatLng(LatLng minLatLng, LatLng maxLatLng)
	{
		ImageContext imageContext = request.getImageContext();
		
		if(imageContext == null)
		{
			imageContext = new ImageContext();			
			request.setImageContext(imageContext);
		}
		
		imageContext.setLatLongRect(new ImageContext.LatLongRect(minLatLng, maxLatLng));
		
		return this;
	}
	
	public RequestBuilder addLanguagesHint(String lang)
	{
		ImageContext imageContext = request.getImageContext();
		
		if(imageContext == null)
		{
			imageContext = new ImageContext();			
			request.setImageContext(imageContext);
		}
		
		List<String> languageHints = imageContext.getLanguageHints();
		
		if(languageHints == null)
		{
			languageHints = new ArrayList<>();
			imageContext.setLanguageHints(languageHints);
		}
		
		languageHints.add(lang);
		
		return this;
	}
	
	public RequestBuilder addCropHintsParam(float aspectRatio)
	{
		ImageContext imageContext = request.getImageContext();
		
		if(imageContext == null)
		{
			imageContext = new ImageContext();			
			request.setImageContext(imageContext);
		}
		
		CropHintsParams cropHintsParams = imageContext.getCropHintsParams();
		
		if(cropHintsParams == null)
		{
			cropHintsParams = new CropHintsParams();
			imageContext.setCropHintsParams(cropHintsParams);
		}
		
		cropHintsParams.getAspectRatios().add(aspectRatio);
		
		return this;
	}

	public Request build()
	{
		return request;
	}
}
