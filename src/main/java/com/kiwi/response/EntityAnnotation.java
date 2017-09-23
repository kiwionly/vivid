package com.kiwi.response;

import java.util.List;

public class EntityAnnotation
{
	private String mid;
	private String locale;
	private String description;
	private double score;
	private double confidence;
	private double topicality;
	private BoundingPoly boundingPoly;
	private List<LocationInfo> locations;
	private List<Property> properties;

	public String getMid()
	{
		return mid;
	}

	public void setMid(String mid)
	{
		this.mid = mid;
	}

	public String getLocale()
	{
		return locale;
	}

	public void setLocale(String locale)
	{
		this.locale = locale;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public double getScore()
	{
		return score;
	}

	public void setScore(double score)
	{
		this.score = score;
	}

	public double getConfidence()
	{
		return confidence;
	}

	public void setConfidence(double confidence)
	{
		this.confidence = confidence;
	}

	public double getTopicality()
	{
		return topicality;
	}

	public void setTopicality(double topicality)
	{
		this.topicality = topicality;
	}

	public BoundingPoly getBoundingPoly()
	{
		return boundingPoly;
	}

	public void setBoundingPoly(BoundingPoly boundingPoly)
	{
		this.boundingPoly = boundingPoly;
	}

	public List<LocationInfo> getLocations()
	{
		return locations;
	}

	public void setLocations(List<LocationInfo> locations)
	{
		this.locations = locations;
	}

	public List<Property> getProperties()
	{
		return properties;
	}

	public void setProperties(List<Property> properties)
	{
		this.properties = properties;
	}

	public static class LocationInfo
	{
		private LatLng latLng;

		public LatLng getLatLng()
		{
			return latLng;
		}

		public void setLatLng(LatLng latLng)
		{
			this.latLng = latLng;
		}
	}

	public static class LatLng
	{
		private double latitude;
		private double longitude;

		public double getLatitude()
		{
			return latitude;
		}

		public void setLatitude(double latitude)
		{
			this.latitude = latitude;
		}

		public double getLongitude()
		{
			return longitude;
		}

		public void setLongitude(double longitude)
		{
			this.longitude = longitude;
		}

	}

	public static class Property
	{
		private String name;
		private String value;
		private String uint64Value;

		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public String getValue()
		{
			return value;
		}

		public void setValue(String value)
		{
			this.value = value;
		}

		public String getUint64Value()
		{
			return uint64Value;
		}

		public void setUint64Value(String uint64Value)
		{
			this.uint64Value = uint64Value;
		}

	}

	@Override
	public String toString()
	{
		return "EntityAnnotation [mid=" + mid + ", locale=" + locale + ", description=" + description + ", score="
		        + score + ", confidence=" + confidence + ", topicality=" + topicality + ", boundingPoly=" + boundingPoly
		        + ", LocationInfo=" + locations + ", properties=" + properties + "]";
	}
}
