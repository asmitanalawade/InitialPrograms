package com.bridgelabz.functionsandlibraries;

import java.util.Scanner;

public class MathFunctions {
	
	static Scanner sc = new Scanner(System.in);
	public static int m() {
		return sc.nextInt();
	}
	
	public static double n() {
		return sc.nextDouble();
	}
	public static String inputstr() {
		return sc.next();
	}

//*********************************************************************************************
	public static double harmonics(int n, double sum) {
		 System.out.println("Harmonic series is: ");
	        while(n > 0) {
	        	
	        	sum = sum + (double)1/n;
	        	n--;
	        	System.out.println(" " + sum);
	        }
	       System.out.println(" ");
	      return sum;
	}
	//*****************************************************
	public static void binary(int dec, int i, int j, int bin_num[]) {
	 while(dec != 0) {
			bin_num[i++] = dec % 2;
			dec /= 2;
		}
		
		System.out.println("Binary number is: ");
		for(j = i -1; j > 0; j--) {
			System.out.print(bin_num[j]);
		}
		System.out.println("\n");
	}	
}
