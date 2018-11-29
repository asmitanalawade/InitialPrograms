package com.bridgelabz.typeOfData;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int n = sc.nextInt();
		int power = 1;
		 while (power <= n/2) {
	            power *= 2;
	        }
	  
	        // check for presence of powers of 2 in n, from largest to smallest
	        while (power > 0) {

	            // power is not present in n 
	            if (n < power) {
	                System.out.print(0);
	            }

	            // power is present in n, so subtract power from n
	            else {
	                System.out.print(1);
	                n -= power;
	            }

	            // next smallest power of 2
	            power /= 2;
	        }

	        System.out.println();

	}

}
