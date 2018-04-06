package com.kiwi.response;

import java.util.List;

public class BoundingPoly
{
	private List<Vertex> list;

	public List<Vertex> getList()
	{
		return list;
	}

	public void setList(List<Vertex> list)
	{
		this.list = list;
	}
	
	public static class Vertex
	{
		private double x;
		private double y;

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
	}

}