package com.cg.org.exception;

public class ExceptionClass extends Exception
{
	
	private static final long serialVersionUID = 1L;
	int d;
	
	public ExceptionClass(int data)
	{
		d= data;
		System.out.println("Exception occured! Hotel is "+d+"does not exist!");
	}
	public ExceptionClass(String message)
	{
		super(message);
	}

}
