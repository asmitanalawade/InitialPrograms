package com.bridgelabz.typeOfData;
import utility.Util1;
import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nonnegative number");
		double c = sc.nextDouble();
		
		Util1.sqrtNewtonMtd(c);
	}

}
