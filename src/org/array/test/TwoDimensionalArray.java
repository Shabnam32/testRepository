package org.array.test;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
      System.out.println("enter the number of rows");
      int rows=scan.nextInt();
  
      System.out.println("enter the number of column");
      int column=scan.nextInt();
      
      int my2DArray[][]=new int[rows][column];
      
      for(int i=0;i<column;i++) {
    	  
      for(int j=0;j<column;j++) {
    	  
    	  
   
      System.out.println("enter the elemnt");
     my2DArray [i][j]=scan.nextInt();
      }
      
	}}

}
