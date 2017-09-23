package com.kiwi.response;

import java.util.List;

public class WebDetection
{
	private List<WebEntity> webEntities;
	private List<WebImage> fullMatchingImages;
	private List<WebImage> partialMatchingImages;
	private List<WebPage> pagesWithMatchingImages;
	private List<WebImage> visuallySimilarImages;

	public List<WebEntity> getWebEntities()
	{
		return webEntities;
	}

	public void setWebEntities(List<WebEntity> webEntities)
	{
		this.webEntities = webEntities;
	}

	public List<WebImage> getFullMatchingImages()
	{
		return fullMatchingImages;
	}

	public void setFullMatchingImages(List<WebImage> fullMatchingImages)
	{
		this.fullMatchingImages = fullMatchingImages;
	}

	public List<WebImage> getPartialMatchingImages()
	{
		return partialMatchingImages;
	}

	public void setPartialMatchingImages(List<WebImage> partialMatchingImages)
	{
		this.partialMatchingImages = partialMatchingImages;
	}

	public List<WebPage> getPagesWithMatchingImages()
	{
		return pagesWithMatchingImages;
	}

	public void setPagesWithMatchingImages(List<WebPage> pagesWithMatchingImages)
	{
		this.pagesWithMatchingImages = pagesWithMatchingImages;
	}

	public List<WebImage> getVisuallySimilarImages()
	{
		return visuallySimilarImages;
	}

	public void setVisuallySimilarImages(List<WebImage> visuallySimilarImages)
	{
		this.visuallySimilarImages = visuallySimilarImages;
	}

	public static class WebEntity
	{
		private String entityId;
		private double score;
		private String description;

		public String getEntityId()
		{
			return entityId;
		}

		public void setEntityId(String entityId)
		{
			this.entityId = entityId;
		}

		public double getScore()
		{
			return score;
		}

		public void setScore(double score)
		{
			this.score = score;
		}

		public String getDescription()
		{
			return description;
		}

		public void setDescription(String description)
		{
			this.description = description;
		}

	}

	public static class WebImage
	{
		private String url;
		private double score;

		public String getUrl()
		{
			return url;
		}

		public void setUrl(String url)
		{
			this.url = url;
		}

		public double getScore()
		{
			return score;
		}

		public void setScore(double score)
		{
			this.score = score;
		}

	}

	public static class WebPage
	{
		private String url;
		private double score;

		public String getUrl()
		{
			return url;
		}

		public void setUrl(String url)
		{
			this.url = url;
		}

		public double getScore()
		{
			return score;
		}

		public void setScore(double score)
		{
			this.score = score;
		}

	}
}
