package org.array.test;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mainArray[]= {11,22,55,44};
		Scanner scan=new Scanner(System.in);
		 
	     
	     System.out.println("original Array");
	        System.out.println(Arrays.toString(mainArray));
	        
        int firstElement=mainArray[0];
        
        //System.out.println("last element");
        
        for(int i=0;i<mainArray.length-1;i++) {
        	mainArray[i]=mainArray[i+1];
       
        }
        
		mainArray[0]=firstElement;
        
        System.out.println("After left Rotation Array");
        System.out.println(Arrays.toString(mainArray));
	}

}

	
