package com.bridgelabz.typeOfData;
import utility.Util1;
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of day, month and year");
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		
		Util1.DayOfWeek(d, m, y);
	}

}
