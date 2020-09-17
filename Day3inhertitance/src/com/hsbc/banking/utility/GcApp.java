package com.hsbc.banking.utility;

import java.util.Random;

public class GcApp {
	
	private static void createData()
	{
		int[] dataArray = new int[100000000];
		for(int i=0;i<dataArray.length;i++)
		{
			dataArray[i]=new Random().nextInt();
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime runtime=Runtime.getRuntime();
		System.out.println("free memory "+runtime.freeMemory());
		System.out.println("avl processors "+ runtime.availableProcessors());
		System.out.println("Total memory " + runtime.totalMemory());
		
		createData();
		System.gc();
		System.out.println("After method invocation");
		System.out.println("free memory "+runtime.freeMemory());
		System.out.println("avl processors "+ runtime.availableProcessors());
		System.out.println("Total memory " + runtime.totalMemory());

	}

}
