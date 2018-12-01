
/**
 * Purpose : This program take a value from user and print the maxValue and minValue from 
 *            array.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   1/12/2018          
 */

package com.bridgelabz.functional;

import com.bridgelabz.functionsandlibraries.MathFunctions;

public class MinAndMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of the array");
		int n = MathFunctions.m();
		int [] array = new int[n];
		int maxValue = 0;
		int minValue = 0;
		System.out.println("Enter the elements of the array");
		for(int i = 0 ; i < n; i++) {
			array[i] = MathFunctions.m();
		}
		for(int i = 0; i < n; i++) {
			if(array[i] > n) 
				maxValue = array[i];
			else if(array[i] < n)
				minValue = array[i];
				
		}
		System.out.println("Maximum value is = " + maxValue);
		System.out.println("Minimum value is = " + minValue);

	}

}
