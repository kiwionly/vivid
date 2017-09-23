package com.kiwi.response;

public class Errors
{
	private Error error;
		
	public Error getError()
	{
		return error;
	}

	public void setError(Error error)
	{
		this.error = error;
	}

	static class Error {
		
		private int code;
		private String message;
		private String status;
				
		public int getCode()
		{
			return code;
		}

		public void setCode(int code)
		{
			this.code = code;
		}

		public String getMessage()
		{
			return message;
		}

		public void setMessage(String message)
		{
			this.message = message;
		}

		public String getStatus()
		{
			return status;
		}

		public void setStatus(String status)
		{
			this.status = status;
		}

		@Override
		public String toString()
		{
			return "Error [code=" + code + ", message=" + message + ", status=" + status + "]";
		}		
	}

	@Override
	public String toString()
	{
		return "Errors [error=" + error + "]";
	}
}
