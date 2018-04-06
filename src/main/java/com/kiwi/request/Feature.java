package com.kiwi.request;

import com.alibaba.fastjson.annotation.JSONField;

public class Feature
{
	@JSONField(ordinal=0)
	private String type;
	@JSONField(ordinal=1)
	private int maxResults;
	
	public Feature(String feature)
	{
		this.type = feature;
	}
		
	public Feature(String type, Integer maxResults)
	{
		this.type = type;
		this.maxResults = maxResults;
	}

	public String getType()
	{
		return type;
	}
	
	public int getMaxResults()
	{
		return maxResults;
	}
}
