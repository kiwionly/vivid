package com.kiwi.response;

import java.util.List;

public class Result
{
	private List<Response> responses;
	private Errors errors;

	public List<Response> getResponses()
	{
		return responses;
	}

	public void setResponses(List<Response> responses)
	{
		this.responses = responses;
	}

	public Errors getErrors()
	{
		return errors;
	}

	public void setErrors(Errors errors)
	{
		this.errors = errors;
	}

	@Override
	public String toString()
	{
		return "Result [responses=" + responses + ", errors=" + errors + "]";
	}
}
