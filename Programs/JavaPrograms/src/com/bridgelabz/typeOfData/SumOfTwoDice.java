
/**
 * Purpose : This program take a number input and print the sum of the two dice.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   27/11/2018          
 */

package com.bridgelabz.typeOfData;
import utility.Util1;
public class SumOfTwoDice {
	
	 public static int sum(int n) {
		 int a = 1 + (int)(Math.random()*n);
		 System.out.println(a);
			int b = 1 + (int)(Math.random()*n);
			 System.out.println(b);
			  int sum = a + b;
			 return sum;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
	   
	    int sum = sum(n); 
	    System.out.println("Sum of two dice =" + sum);
		
	}
	

}
