
/**
 * Purpose : This program take  nonnegative number as input from user and print the square root 
 *           by using the Newton's Method.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   27/11/2018          
 */

package com.bridgelabz.typeOfData;
import utility.Util1;
import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Nonnegative number is taken from user
		System.out.println("Enter the nonnegative number");
		double c = sc.nextDouble();
		double result = Util1.sqrtNewtonMtd(c);
		 System.out.println(result);

		
	}

}
