package org.array.test;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mainArray[]=new int[10];
		Scanner scan=new Scanner(System.in);
		
		
		 
	     for(int i=0;i<mainArray.length;i++) {
	    	 System.out.println("Enter element");
	          mainArray[i]=scan.nextInt();
	     }
	      int oddArray[]=new int[10];  
	      int evenArray[]=new int[10];
	      int i=0,j=0,k=0;
	      for(i=0;i<mainArray.length;i++)
	      {
	   if(mainArray[i]%2==0) {
		   evenArray[j++]=mainArray[i];
	   }
	   else
	   {
		   oddArray[k++]=mainArray[i];
	   }
	      }
	      System.out.println("original Array");
	      System.out.println(Arrays.toString(mainArray));
	      System.out.println("even Array");
	      for(i=0;i<j;i++)
	       {
	    	  System.out.println(evenArray[i]+"");
	      }
	      System.out.println();
	      
	
	 System.out.println("odd Array");
     for(i=0;i<k;i++)
      {
   	  System.out.println(oddArray[i]+"");
     }
     System.out.println();
     
}
	
	
	}
