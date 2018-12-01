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

//**********************************************************************************************
	
	public static void prinum(int n) {
		for(int i = 0; i < n; i++) {
			boolean status = true;
			for(int j= 2; j < i; j++) {
				while(i % j == 0) {
				  status = false;
				  break;
				}
			}
			if(status) {
				System.out.println(" " + i);
			}
		}
	}

//*********************************************************************************************
	
	public static long factor(int n, long factor) {
         for(int i = 1; i <= n; i++ ) {
			
			factor = factor * i;
			
			System.out.println(" " + i);  
			
		}
		return factor;
	}

	
	
//**********************************************************************************************
	
	public static double futureValue(double C,double r, double T) {
		
		double futureValue = C * (1 + r)*Math.sqrt(T);
		
		return futureValue;
	}
	
//**********************************************************************************************
	
	public static double presentValue(double C,double r, double T) {
		
		double presentValue = C/(1 + r)*Math.sqrt(T);
		
		return presentValue;
	}
//***********************************************************************************************
	
	public static void slope(int x1, int x2, int x3, int y1, int y2, int y3) {
		
		int slopeAB = (y2 - y1)/(x2 - x1);
		int slopeBC = (y3 - y2)/(x3 - x2);
		int slopeAC = (y3 - y1)/(x3 - x1);
		
		if(slopeAB == slopeBC && slopeBC == slopeAC) {
			System.out.println("The points are collinear");
		}else {
			System.out.println("The points are not collinear");
		}
       
	}
     //********************************************************************
	
	
	public static void area(int x1, int x2, int x3, int y1, int y2, int y3) {
		
		int triArea = (int)0.5*((x1 - x2)*(y2 - y3) - (x2 - x3)*(y1 - y2));
		if(triArea == 0) {
			System.out.println("The points are collinear");
		}else {
			System.out.println("The points are not collinear");
		}
	}
//*********************************************************************************************
	
	
}
