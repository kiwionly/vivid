package com.kiwi.response;

import java.util.List;

public class CropHintsAnnotation
{
	private List<CropHint> cropHints;

	public List<CropHint> getCropHints()
	{
		return cropHints;
	}

	public void setCropHints(List<CropHint> cropHints)
	{
		this.cropHints = cropHints;
	}

	public static class CropHint
	{
		private BoundingPoly boundingPoly;
		private double confidence;
		private double importanceFraction;

		public BoundingPoly getBoundingPoly()
		{
			return boundingPoly;
		}

		public void setBoundingPoly(BoundingPoly boundingPoly)
		{
			this.boundingPoly = boundingPoly;
		}

		public double getConfidence()
		{
			return confidence;
		}

		public void setConfidence(double confidence)
		{
			this.confidence = confidence;
		}

		public double getImportanceFraction()
		{
			return importanceFraction;
		}

		public void setImportanceFraction(double importanceFraction)
		{
			this.importanceFraction = importanceFraction;
		}
	}

}
