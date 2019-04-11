package com.check;

import java.io.IOException;

import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

public class CheckingThrow extends Thread {

	public int mk(Integer i) throws IOException
	{
		if(i == null)
		{
			throw new IOException();
		}
		return i;
	}
	
	public static void main(String[] args)
	{
                CheckingThrow checkingThrow = new CheckingThrow();	
                checkingThrow.setPriority(22);
	}
}

class Calling
{
	public static void main(String[] args)
	{
		CheckingThrow checkingThrow = new CheckingThrow();
		int mk;
		try {
			mk = checkingThrow.mk(null);
		} catch (IOException e) {
			System.out.println("catching UnknownIdentificationException in the catch block ");
		}
		System.out.println("after catch block");
	}
}