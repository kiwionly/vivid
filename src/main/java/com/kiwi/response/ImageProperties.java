package com.kiwi.response;

import java.util.List;

public class ImageProperties
{
	private DominantColorsAnnotation dominantColors;

	public DominantColorsAnnotation getDominantColors()
	{
		return dominantColors;
	}

	public void setDominantColors(DominantColorsAnnotation dominantColors)
	{
		this.dominantColors = dominantColors;
	}

	public static class DominantColorsAnnotation
	{
		private List<ColorInfo> colors;

		public List<ColorInfo> getColors()
		{
			return colors;
		}

		public void setColors(List<ColorInfo> colors)
		{
			this.colors = colors;
		}

	}

	public static class ColorInfo
	{
		private Color color;
		private double score;
		private double pixelFraction;

		public Color getColor()
		{
			return color;
		}

		public void setColor(Color color)
		{
			this.color = color;
		}

		public double getScore()
		{
			return score;
		}

		public void setScore(double score)
		{
			this.score = score;
		}

		public double getPixelFraction()
		{
			return pixelFraction;
		}

		public void setPixelFraction(double pixelFraction)
		{
			this.pixelFraction = pixelFraction;
		}

	}

	public static class Color
	{
		private double red;
		private double green;
		private double blue;
		private double alpha;

		public double getRed()
		{
			return red;
		}

		public void setRed(double red)
		{
			this.red = red;
		}

		public double getGreen()
		{
			return green;
		}

		public void setGreen(double green)
		{
			this.green = green;
		}

		public double getBlue()
		{
			return blue;
		}

		public void setBlue(double blue)
		{
			this.blue = blue;
		}

		public double getAlpha()
		{
			return alpha;
		}

		public void setAlpha(double alpha)
		{
			this.alpha = alpha;
		}

	}

}
