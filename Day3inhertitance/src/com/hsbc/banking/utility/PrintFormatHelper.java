package com.hsbc.banking.utility;

public class PrintFormatHelper {
	

	public static void Formatter(int num) {
		System.out.printf("%d%n",num);
	}
	public static void Formatter(long num) {
		System.out.printf("%010df%n",num);
	}
	public static void Formatter(double num) {
		System.out.printf("%8.5f%n",num);
	}
	public static void Formatter(float num) {
		System.out.printf("%6.2f%n",num);
	}

	public static void main(String args[]) 
	{ 
		Formatter(8626.255f);
	}

}

