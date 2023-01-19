package org.array.test;
import java.util.*;
public class ArrayDeclarationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
     int myArray[]= {11,22,44,55,66,77,88};//static initialization
     System.out.println("enter a size");
     int size=scan.nextInt();
     int myArray1[]=new int[10];
     
     for(int i=0;i<myArray.length;i++) {
    	 System.out.println("Enter element");
          myArray[i]=scan.nextInt();
     }
     //dynamic initialization
     for(int i=0;i<myArray.length;i++) {
    	 System.out.println(myArray[i]);
    	 
     }
         
	}

}
