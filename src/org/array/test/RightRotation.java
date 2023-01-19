package org.array.test;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mainArray[]= {11,33,77,88,77,7,44,3};
		Scanner scan=new Scanner(System.in);
		 
	     
	     System.out.println("original Array");
	        System.out.println(Arrays.toString(mainArray));
	        
        int lastElement=mainArray[mainArray.length-1];
        //System.out.println("last element");
        
        for(int i=mainArray.length-1;i>0;i--) {
        	mainArray[i]=mainArray[i-1];
        }
        mainArray[0]=lastElement;
        
        System.out.println("After Rotation Array");
        System.out.println(Arrays.toString(mainArray));
	}

}
