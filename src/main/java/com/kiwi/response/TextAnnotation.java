package com.kiwi.response;

import java.util.List;

public class TextAnnotation
{
	private List<Page> pages;
	private String text;

	public List<Page> getPages()
	{
		return pages;
	}

	public void setPages(List<Page> pages)
	{
		this.pages = pages;
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public static class Page
	{
		private TextProperty property;
		private int width;
		private int height;
		private List<Block> blocks;

		public TextProperty getProperty()
		{
			return property;
		}

		public void setProperty(TextProperty property)
		{
			this.property = property;
		}

		public int getWidth()
		{
			return width;
		}

		public void setWidth(int width)
		{
			this.width = width;
		}

		public int getHeight()
		{
			return height;
		}

		public void setHeight(int height)
		{
			this.height = height;
		}

		public List<Block> getBlocks()
		{
			return blocks;
		}

		public void setBlocks(List<Block> blocks)
		{
			this.blocks = blocks;
		}

	}

	public static class TextProperty
	{
		private List<DetectedLanguage> detectedLanguages;
		private DetectedBreak detectedBreak;

		public List<DetectedLanguage> getDetectedLanguages()
		{
			return detectedLanguages;
		}

		public void setDetectedLanguages(List<DetectedLanguage> detectedLanguages)
		{
			this.detectedLanguages = detectedLanguages;
		}

		public DetectedBreak getDetectedBreak()
		{
			return detectedBreak;
		}

		public void setDetectedBreak(DetectedBreak detectedBreak)
		{
			this.detectedBreak = detectedBreak;
		}

	}

	public static class Block
	{
		private TextProperty property;
		private BoundingPoly boundingBox;
		private List<Paragraph> paragraphs;
		private String blockType;

		public TextProperty getProperty()
		{
			return property;
		}

		public void setProperty(TextProperty property)
		{
			this.property = property;
		}

		public BoundingPoly getBoundingBox()
		{
			return boundingBox;
		}

		public void setBoundingBox(BoundingPoly boundingBox)
		{
			this.boundingBox = boundingBox;
		}

		public List<Paragraph> getParagraphs()
		{
			return paragraphs;
		}

		public void setParagraphs(List<Paragraph> paragraphs)
		{
			this.paragraphs = paragraphs;
		}

		public String getBlockType()
		{
			return blockType;
		}

		public void setBlockType(String blockType)
		{
			this.blockType = blockType;
		}

	}

	public static class Paragraph
	{
		private TextProperty property;
		private BoundingPoly boundingBox;
		private List<Word> words;
		public TextProperty getProperty()
		{
			return property;
		}
		public void setProperty(TextProperty property)
		{
			this.property = property;
		}
		public BoundingPoly getBoundingBox()
		{
			return boundingBox;
		}
		public void setBoundingBox(BoundingPoly boundingBox)
		{
			this.boundingBox = boundingBox;
		}
		public List<Word> getWords()
		{
			return words;
		}
		public void setWords(List<Word> words)
		{
			this.words = words;
		}

	}

	public static class Word
	{
		private TextProperty property;
		private BoundingPoly boundingBox;
		private List<Symbol> symbols;

		public TextProperty getProperty()
		{
			return property;
		}

		public void setProperty(TextProperty property)
		{
			this.property = property;
		}

		public BoundingPoly getBoundingBox()
		{
			return boundingBox;
		}

		public void setBoundingBox(BoundingPoly boundingBox)
		{
			this.boundingBox = boundingBox;
		}

		public List<Symbol> getSymbols()
		{
			return symbols;
		}

		public void setSymbols(List<Symbol> symbols)
		{
			this.symbols = symbols;
		}

	}

	public static class Symbol
	{
		private TextProperty property;
		private BoundingPoly boundingBox;
		private String text;

		public TextProperty getProperty()
		{
			return property;
		}

		public void setProperty(TextProperty property)
		{
			this.property = property;
		}

		public BoundingPoly getBoundingBox()
		{
			return boundingBox;
		}

		public void setBoundingBox(BoundingPoly boundingBox)
		{
			this.boundingBox = boundingBox;
		}

		public String getText()
		{
			return text;
		}

		public void setText(String text)
		{
			this.text = text;
		}
	}

	public static class DetectedLanguage
	{
		private String languageCode;
		private double confidence;

		public String getLanguageCode()
		{
			return languageCode;
		}

		public void setLanguageCode(String languageCode)
		{
			this.languageCode = languageCode;
		}

		public double getConfidence()
		{
			return confidence;
		}

		public void setConfidence(double confidence)
		{
			this.confidence = confidence;
		}

	}

	public static class DetectedBreak
	{
		private String type;
		private boolean isPrefix;

		public String getType()
		{
			return type;
		}

		public void setType(String type)
		{
			this.type = type;
		}

		public boolean isPrefix()
		{
			return isPrefix;
		}

		public void setPrefix(boolean isPrefix)
		{
			this.isPrefix = isPrefix;
		}

	}

}
