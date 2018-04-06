package com.kiwi.request;

import com.alibaba.fastjson.annotation.JSONField;

public class Image
{
	@JSONField(ordinal=0)
	private String content;
	@JSONField(ordinal=1)
	private ImageSource source;
			
	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}
	
	public void setSource(ImageSource source)
	{
		this.source = source;
	}

	public ImageSource getSource()
	{		
		return source;
	}
	
	static class ImageSource
	{
		private String gcsImageUri;
		private String imageUri;
		
		public String getGcsImageUri()
		{
			return gcsImageUri;
		}
		
		public void setGcsImageUri(String gcsImageUri)
		{
			this.gcsImageUri = gcsImageUri;
		}
		
		public String getImageUri()
		{
			return imageUri;
		}
		
		public void setImageUri(String imageUri)
		{
			this.imageUri = imageUri;
		}		
	}

}
