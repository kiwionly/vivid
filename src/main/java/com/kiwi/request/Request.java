package com.kiwi.request;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class Request
{
	@JSONField(ordinal=0)
	private final Image image = new Image();
	@JSONField(ordinal=1)
	private final List<Feature> features = new ArrayList<>();	
	@JSONField(ordinal=2)
	private ImageContext imageContext;
		
	public Image getImage()
	{
		return image;
	}

	public List<Feature> getFeatures()
	{
		return features;
	}

	public void setImageContext(ImageContext imageContext)
	{
		this.imageContext = imageContext;
	}

	public ImageContext getImageContext()
	{
		return imageContext;
	}
}
