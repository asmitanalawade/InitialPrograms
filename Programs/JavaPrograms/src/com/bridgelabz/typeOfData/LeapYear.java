package com.bridgelabz.typeOfData;
import utility.Util1;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the year");
		int year = sc.nextInt();
		Util1.Leap(year);
	}

}
