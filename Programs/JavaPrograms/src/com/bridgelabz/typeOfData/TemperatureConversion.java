
/**
 * Purpose : This program take number input from user and outputs the temperature in Celsius or viceversa using the formula
           Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
           Fahrenheit to Celsius: (°F − 32) x 5/9 = °C.
 * @author  Asmita Nalawade
 * @version 1.0
 * @since   27/11/2018          
 */

package com.bridgelabz.typeOfData;
import utility.Util1;


public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of temperature in celcius or fahrenheit");
		double T = Util1.inputDouble();
		
		Util1.Temp(T);

	}

}
