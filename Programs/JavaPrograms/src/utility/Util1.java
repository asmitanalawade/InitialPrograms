package utility;

import java.util.Scanner;

public class Util1 {
	static Scanner sc = new Scanner(System.in);
	public static int m() {
		return sc.nextInt();
	}
	
	
	 public static void Operations(int a, int b, int c) {
		 System.out.println(a+(b*c));
			System.out.println((a*b)+c);
			System.out.println(c+(a/b));
			System.out.println((a%b)+c);
	 }
     
	 //********************************************************************************
	 
	 public static void Opt(double a, double b, double c) {
		    System.out.println(a+(b*c));
			System.out.println((a*b)+c);
			System.out.println(c+(a/b));
			System.out.println((a%b)+c);
	 }
	 //*********************************************************************************
	 
	 public static void name(String name, String name1, String name2) {
		 System.out.print(" Hi "+ name2+", "+ name1+" and " +name);
	 }
	 
	 //**********************************************************************************
	 
	 public static void s1() {
		 System.out.println(" Hello ");

	 }
	// public static void s2() {
	//	 System.out.println(" Hi ");
	// }
	 
	 //****************************************************************************
	 
	 public static void D_pattern(int n) {
			// TODO Auto-generated method stub
			 for (int i = 0; i < n; i++){ 
	             
		            // loop for columns 
		            for (int j = 0; j <= n; j++){ 
		                  
		                // Logic to generate stars 
		                // for * 
		                if (j == 1 || ((i == 0 ||  i == n-1) && (j > 1 && j < n-2)) |(j == n-2 && i != 0 &&  i != n-1)) 
		                    System.out.print("**");  
		                      
		                // For the spaces 
		                else
		                    System.out.print("  ");  
		            } 
		              
		        // For changing line 
		        System.out.println(); 
		        } 
			}  
    //*******************************************************************************
	 
	 public static void KDWPattern(int count) {
		 for(int i = 0; i <= 10; i++) {
				for(int j = 0; j < 2; j++) {
					System.out.print("*");
				}
				for(int k = 0; k <= 5; k++) {
					if(k == count) {
						System.out.print("***");
					}else {
						System.out.print("  ");
					}
				}
				if(i <= 4) {
					count--;
				}else if(i <= 9) {
					count++;
				}
				System.out.print("\n");
			}
	 
		  
	      int n = 9;
			// TODO Auto-generated method stub
			 for (int i = 0; i < 9; i++){ 
	             
		            // loop for columns 
		            for (int j = 0; j <= n; j++){ 
		                  
		                // Logic to generate stars 
		                // for * 
		                if (j == 1 || ((i == 0 ||  i == n-1) && (j > 1 && j < n-2)) |(j == n-2 && i != 0 &&  i != n-1)) 
		                    System.out.print("**");  
		                      
		                // For the spaces 
		                else
		                    System.out.print("  ");  
		            } 
		              
		        // For changing line 
		        System.out.println(); 
		        } 
			  	 
			 
		 for(int i = 0; i <= 9; i++) {
				for(int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
				
				for(int k = 8; k >= i; k--) {
					System.out.print(" ");
				}
				for(int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
				for (int l = 1; l <= i; l++) {
					System.out.print("  ");
				}
				for(int j = 0; j <=1; j++) {
					System.out.print("*");
				}

				for(int k = 8; k >= i; k--) {
					System.out.print(" ");
				}
				for(int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}

	 }
   //**********************************************************************************
	 
	 public static void W_pattern() {
		 for(int i = 0; i <= 9; i++) {
				for(int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
				
				for(int k = 8; k >= i; k--) {
					System.out.print(" ");
				}
				for(int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
				for (int l = 1; l <= i; l++) {
					System.out.print("  ");
				}
				for(int j = 0; j <=1; j++) {
					System.out.print("*");
				}

				for(int k = 8; k >= i; k--) {
					System.out.print(" ");
				}
				for(int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}

	 }
   //********************************************************************************
	 
	 public static void Leap(int year) {
		 boolean status = false;
			if(year >= 1582) {
				System.out.println("Year is greater than equal to 1582");
				
				if(year % 4 == 0) {
					
					if(year % 100 == 0) {
						
						if(year % 400 == 0) {
							 
							status = true;
						}else
							
						status = false;
					}else 
						
					status = true;
				}else {
					 
					status = false;
				}
				if(status == true) {
					System.out.println(year + " is a leap year");
				}else {
					System.out.println(year + " is not a leap year");
				}
				
				
			}else {
				System.out.println("Year is not greater than equal to 1582");
			}

	 }
   //********************************************************************************** 
	 
	 public static void sum(int n) {
		 int a =  (int)(Math.random()*n);
			int b =  (int)(Math.random()*n);
			int sum = a + b;
			System.out.println("Sum of two dice is: " + sum);
	 }
  //***********************************************************************************
	 
	 public static void ran(int n) {
		 double a = Math.random();
			System.out.println(a);
			double b = Math.random();
			System.out.println(b);
			double c = Math.random();
			System.out.println(c);
			double d = Math.random();
			System.out.println(d);
			double e = Math.random();
			System.out.println(e);
			
			double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
			double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
			double average = (a + b + c + d + e)/ 5;
			
			System.out.println("Min = " + min);
			System.out.println("Max = " + max);
			System.out.println("Average = " + average);
	 }
   //********************************************************************************
	 
	 public static void day(int d, int m) {
		 boolean status = (m == 3 && d >= 20 && d <= 31)||
				          (m == 4 && d >= 1  && d <= 30)||
				          (m == 5 && d >= 1  && d <= 31)||
				          (m == 6 && d >= 1  && d <= 20);
		 System.out.println(status);
				 
			
			
	 }
	//******************************************************************************** 
	 
	 public static void DayOfWeek(int d, int m, int y) {
		// String week[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		 int y0 = y - (14 - m) / 12;
	     int x = y0 + y0/4 - y0/100 + y0/400;
	     int m0 = m + 12 * ((14 - m) / 12) - 2;
	     int d0 = (d + x + (31*m0)/12) % 7;

	       // System.out.println(y0);
	     //   System.out.println(x);
	      //  System.out.println(m0);
	      //  System.out.println(d0);
	        
	        if(d0 == 0) {
	        	System.out.println("It is Sunday");
	        }else if(d0 == 1) {
	        	System.out.println("It is Monday");
	        }else if(d0 == 2) {
	        	System.out.println("It is Tuesday");
	        }else if(d0 == 3) {
	        	System.out.println("It is Wednesday");
	        }else if(d0 == 4) {
	        	System.out.println("It is Thursday");
	        }else if(d0 == 5) {
	        	System.out.println("It is Friday");
	        }else {
	        	System.out.println("It is Saturday");
	        }
	        
	        

	 }
// *********************************************************************************************
	 
	 public static void Payment(double principal, double rate, double year) {
		 double r = (rate / 100) / 12;   
	        double n = 12 * year;          

	        double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
	        System.out.println("Monthly payment = " + payment);
	 }
//***********************************************************************************************
	 
	 public static void Triag(double degree) {
		 double radian = Math.toRadians(degree);
			
			double sin = Math.sin(radian);
			System.out.println("sin("+ degree +") = " + sin);
			
			double cos = Math.cos(radian);
			System.out.println("cos("+degree+") = " + cos);
	 }
//********************************************************************************************
	 
	 public static void Temp(double T) {
		 System.out.println("1] celcius to fahrenheit  \n  2] fahrenheit to celcius");
		 System.out.println("Enter choice: ");
			int n = sc.nextInt();
			if(n == 1) {
				double fahrenheit = (T * (9/2))+32;
				System.out.println("Temperature in celcius to fahrenheit = " + fahrenheit);
			}else if(n == 2) {
				double celcius = (T - 32) * 5/9;
				System.out.println("Temperature in fahrenheit to celcius = " + celcius);
			}
	 }
	 
//*********************************************************************************************
	 
	 public static void sqrtNewtonMtd(double c) {
		 double t = c;
		 double  epsilon = 1e-15;
		 
		 while(Math.abs(t - c/t) > epsilon*t) {
			 t = (c/t + t)/2.0;
		 }
		 System.out.println(t);

	 }
//*********************************************************************************************
	 
	 public static int binswap(int num)
	  {
		
				System.out.println("Decimal Number:"+num);
				String bin=Integer.toBinaryString(num);
				System.out.println("Binary Number after conversion:"+bin);
				int n=bin.length();
				String  s1 = "0";
				if(n<8) 
				{
					bin = s1.concat(bin);
				}
					
					String nibble1=bin.substring(0, 4);
						System.out.println("Nibble 1:"+nibble1);
						String nibble2=bin.substring(4,8);
						System.out.println("Nibble 2:"+nibble2);
						String swappNibble=nibble2.concat(nibble1);
						System.out.println("After swapping nibbles:"+swappNibble);
						int dec=Integer.parseInt(swappNibble,2);
						
				return dec;
				
					
	  }
	 public static void PowerOfTwo(int result) {
		
		 boolean status;
		if(result % 2 != 0) {
			 status = false;
		 }else {
			 status = true;
		 }
		 if(status = true) {
			 System.out.println("The resultant number is power of 2");
		 }else {
			 System.out.println("The resultant number is not power of 2");
		 }
	 }


	

}
