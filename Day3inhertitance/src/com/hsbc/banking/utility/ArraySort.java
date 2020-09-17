package com.hsbc.banking.utility;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] regNo=new Integer [10];
		for(int i=0;i<regNo.length;i++)
			regNo[i]= new Random().nextInt(100);
		
		System.out.println("Before sorting");
		for(int i=0;i<regNo.length;i++)
			System.out.println(regNo[i]);
		
		Arrays.sort(regNo,Collections.reverseOrder());
		
		System.out.println("After sorting");
		for(int i=0;i<regNo.length;i++)
			System.out.println(regNo[i]);
	}

}
