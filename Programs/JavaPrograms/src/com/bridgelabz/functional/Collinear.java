


package com.bridgelabz.functional;

import com.bridgelabz.functionsandlibraries.MathFunctions;

public class Collinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the points");
		int x1 = MathFunctions.m();
		int x2 = MathFunctions.m();
		int x3 = MathFunctions.m();
		int y1 = MathFunctions.m();
		int y2 = MathFunctions.m();
		int y3 = MathFunctions.m();
		
		MathFunctions.slope(x1, x2, x3, y1, y2, y3);
		MathFunctions.area(x1, x2, x3, y1, y2, y3);

	}

}
