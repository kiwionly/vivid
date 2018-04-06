package com.kiwi.request;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class ImageContext
{
	@JSONField(ordinal=0)
	private LatLongRect latLongRect;	
	@JSONField(ordinal=1)
	private List<String> languageHints;
	@JSONField(ordinal=2)
	private CropHintsParams cropHintsParams;
	
	public LatLongRect getLatLongRect()
	{
		return latLongRect;
	}

	public void setLatLongRect(LatLongRect latLongRect)
	{
		this.latLongRect = latLongRect;
	}

	public List<String> getLanguageHints()
	{
		return languageHints;
	}

	public void setLanguageHints(List<String> languageHints)
	{
		this.languageHints = languageHints;
	}

	public CropHintsParams getCropHintsParams()
	{
		return cropHintsParams;
	}

	public void setCropHintsParams(CropHintsParams cropHintsParams)
	{
		this.cropHintsParams = cropHintsParams;
	}

	static class LatLongRect
	{
		private LatLng minLatLng;
		private LatLng maxLatLng;

		public LatLongRect(LatLng minLatLng, LatLng maxLatLng)
		{
			this.minLatLng = minLatLng;
			this.maxLatLng = maxLatLng;
		}

		public LatLng getMinLatLng()
		{
			return minLatLng;
		}

		public void setMinLatLng(LatLng minLatLng)
		{
			this.minLatLng = minLatLng;
		}

		public LatLng getMaxLatLng()
		{
			return maxLatLng;
		}

		public void setMaxLatLng(LatLng maxLatLng)
		{
			this.maxLatLng = maxLatLng;
		}
		
	}
	
	static class LatLng
	{
		private double lat;
		private double lng;
		
		public LatLng(double lat, double lng) {
			this.lat = lat;
			this.lng = lng;
		}

		public double getLat()
		{
			return lat;
		}

		public void setLat(double lat)
		{
			this.lat = lat;
		}

		public double getLng()
		{
			return lng;
		}

		public void setLng(double lng)
		{
			this.lng = lng;
		}
	}
	
	static class CropHintsParams {
		
		private final List<Float> aspectRatios = new ArrayList<>();

		public List<Float> getAspectRatios()
		{
			return aspectRatios;
		}	
	}
}
