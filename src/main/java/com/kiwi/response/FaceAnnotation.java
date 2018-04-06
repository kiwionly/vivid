package com.kiwi.response;

import java.util.List;

public class FaceAnnotation
{
	private BoundingPoly boundingPoly;
	private BoundingPoly fdBoundingPoly;
	private List<Landmark> landmarks;
	private double rollAngle;
	private double panAngle;
	private double tiltAngle;
	private double detectionConfidence;
	private double landmarkingConfidence;
	private String joyLikelihood;
	private String sorrowLikelihood;
	private String angerLikelihood;
	private String surpriseLikelihood;
	private String underExposedLikelihood;
	private String blurredLikelihood;
	private String headwearLikelihood;

	public BoundingPoly getBoundingPoly()
	{
		return boundingPoly;
	}

	public void setBoundingPoly(BoundingPoly boundingPoly)
	{
		this.boundingPoly = boundingPoly;
	}

	public BoundingPoly getFdBoundingPoly()
	{
		return fdBoundingPoly;
	}

	public void setFdBoundingPoly(BoundingPoly fdBoundingPoly)
	{
		this.fdBoundingPoly = fdBoundingPoly;
	}

	public List<Landmark> getLandmarks()
	{
		return landmarks;
	}

	public void setLandmarks(List<Landmark> landmarks)
	{
		this.landmarks = landmarks;
	}

	public double getRollAngle()
	{
		return rollAngle;
	}

	public void setRollAngle(double rollAngle)
	{
		this.rollAngle = rollAngle;
	}

	public double getPanAngle()
	{
		return panAngle;
	}

	public void setPanAngle(double panAngle)
	{
		this.panAngle = panAngle;
	}

	public double getTiltAngle()
	{
		return tiltAngle;
	}

	public void setTiltAngle(double tiltAngle)
	{
		this.tiltAngle = tiltAngle;
	}

	public double getDetectionConfidence()
	{
		return detectionConfidence;
	}

	public void setDetectionConfidence(double detectionConfidence)
	{
		this.detectionConfidence = detectionConfidence;
	}

	public double getLandmarkingConfidence()
	{
		return landmarkingConfidence;
	}

	public void setLandmarkingConfidence(double landmarkingConfidence)
	{
		this.landmarkingConfidence = landmarkingConfidence;
	}

	public String getJoyLikelihood()
	{
		return joyLikelihood;
	}

	public void setJoyLikelihood(String joyLikelihood)
	{
		this.joyLikelihood = joyLikelihood;
	}

	public String getSorrowLikelihood()
	{
		return sorrowLikelihood;
	}

	public void setSorrowLikelihood(String sorrowLikelihood)
	{
		this.sorrowLikelihood = sorrowLikelihood;
	}

	public String getAngerLikelihood()
	{
		return angerLikelihood;
	}

	public void setAngerLikelihood(String angerLikelihood)
	{
		this.angerLikelihood = angerLikelihood;
	}

	public String getSurpriseLikelihood()
	{
		return surpriseLikelihood;
	}

	public void setSurpriseLikelihood(String surpriseLikelihood)
	{
		this.surpriseLikelihood = surpriseLikelihood;
	}

	public String getUnderExposedLikelihood()
	{
		return underExposedLikelihood;
	}

	public void setUnderExposedLikelihood(String underExposedLikelihood)
	{
		this.underExposedLikelihood = underExposedLikelihood;
	}

	public String getBlurredLikelihood()
	{
		return blurredLikelihood;
	}

	public void setBlurredLikelihood(String blurredLikelihood)
	{
		this.blurredLikelihood = blurredLikelihood;
	}

	public String getHeadwearLikelihood()
	{
		return headwearLikelihood;
	}

	public void setHeadwearLikelihood(String headwearLikelihood)
	{
		this.headwearLikelihood = headwearLikelihood;
	}

	public static class Landmark
	{
		private String type;
		private Position position;

		public String getType()
		{
			return type;
		}

		public void setType(String type)
		{
			this.type = type;
		}

		public Position getPosition()
		{
			return position;
		}

		public void setPosition(Position position)
		{
			this.position = position;
		}
	}

	public static class Position
	{
		private double x;
		private double y;
		private double z;

		public double getX()
		{
			return x;
		}

		public void setX(double x)
		{
			this.x = x;
		}

		public double getY()
		{
			return y;
		}

		public void setY(double y)
		{
			this.y = y;
		}

		public double getZ()
		{
			return z;
		}

		public void setZ(double z)
		{
			this.z = z;
		}

	}

}
