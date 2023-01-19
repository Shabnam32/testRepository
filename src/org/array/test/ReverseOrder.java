package org.array.test;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a size");
	     int size=scan.nextInt();
	     int myArray1[]=new int[size];
	     
	     for(int i=0;i<myArray1.length;i++) {
	    	 System.out.println("Enter element");
	          myArray1[i]=scan.nextInt();
	     }
	     //dynamic initialization
	     for(int i=0;i<myArray1.length;i++) {
	    	 System.out.println(myArray1[i]);
	    	 
	     }
	     for(int i=0;i<myArray1.length;i++) {
	    	 System.out.println(myArray1[i]+",");
	     }
	}

}
