
/**
 * Purpose : This program take three input from user i.e day, month, year and print the day of 
 *           week that date.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   28/11/2018          
 */



package com.bridgelabz.typeOfData;
import utility.Util1;
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Take input from user in day, month and year
		System.out.println("Enter the value of day, month and year");
		int d = Util1.m();
		int m = Util1.m();
		int y = Util1.m();
		
		Util1.DayOfWeek(d, m, y);
	}

}
