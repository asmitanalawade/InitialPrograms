 package utility;

import java.util.Scanner;

public class Util1 {
	static Scanner sc = new Scanner(System.in);
	public static int m() {
		return sc.nextInt();
	}
	
	public static double n() {
		return sc.nextDouble();
	}
	public static String inputString() {
		return sc.next();
	}

	

	 
	 //**********************************************************************************
	 
	 public static void s1() {
		 System.out.println(" Hello ");

	 }
	// public static void s2() {
	//	 System.out.println(" Hi ");
	// }
	 
//********************************************************************************************
	 
	public static int initial(String name) {
		 int n = 9;
		 int count = 5;
		 int flag = 1;
		  if(name.charAt(0) == 'K') {
			  
			  Util1.kPattern(count);
		  }else if(name.charAt(0)== 'D') {
			  
			  Util1.dpattern(n);
		  }else if(name.charAt(0)== 'W') {
			  Util1.wpattern(n);
		  }else
			  flag =0;
			  
		  return flag;
		 
	}
	 
	 
	 
	 
	 
     //**************************************************************** 
	 public static void kPattern(int count) {
	
		
		 
		 //loop for rows
		 for(int i = 0; i < 10; i++) {
			 //loop for column
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
				//Find the middle 
				if(i <= 4) {
					count--;
				}else if(i <= 9) {
					count++;
				}
				System.out.print("\n");
			}
	 }	 
     //********************************************************	 
	public static void dpattern(int n) {	 
		 
	    
			// TODO Auto-generated method stub
	     //loop for rows
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
			 
	}	  	 
    //*******************************************************
	
	public static void wpattern(int n) {
			 // loop for rows
		 for(int i = 0; i < 9; i++) {
			 // loop for column
				for(int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
				//loop for sligthly moving column
				for(int k = 8; k >= i; k--) {
					System.out.print(" ");
				}
				for(int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
				//loop for sligthly moving column
				for (int l = 1; l <= i; l++) {
					System.out.print("  ");
				}
				for(int j = 0; j <=1; j++) {
					System.out.print("*");
				}
				//loop for  column
				for(int k = 8; k >= i; k--) {
					System.out.print(" ");
				}
				for(int j = 0; j <= 1; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}

	 }
//********************************************************************************************
	 
	 
	 public static boolean Leap(int year) {
		boolean status;
			
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
				return status;

	 }
   //********************************************************************************** 
	 
//	 public static void sum(int n) {
//		 int a = 1 + (int)(Math.random()*n);
//		 System.out.println(a);
//			int b = 1 + (int)(Math.random()*n);
//			 System.out.println(b);
//			  int sum = a + b;
//			 System.out.println("Sum of two dice =" + sum);
//	 }
	
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
	 
	 public static boolean day(int d, int m) {
		 // Day d of month m is between march 20 (m = 3, d = 20)
		 //and June 20(m = 6, d = 20) 
		 
		 boolean status = (m == 3 && d >= 20 && d <= 31)||
				          (m == 4 && d >= 1  && d <= 30)||
				          (m == 5 && d >= 1  && d <= 31)||
				          (m == 6 && d >= 1  && d <= 20);
		 return status;
				 
			
			
	 }
	//******************************************************************************** 
	 
	 public static void DayOfWeek(int d, int m, int y) {
		
		 int y0 = y - (14 - m) / 12;
	     int x = y0 + y0/4 - y0/100 + y0/400;
	     int m0 = m + 12 * ((14 - m) / 12) - 2;
	     int d0 = (d + x + (31*m0)/12) % 7;

	       // System.out.println(y0);
	        //System.out.println(x);
	        //System.out.println(m0);
	        //System.out.println(d0);
	        
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
	 
	 public static double Payment(double principal, double rate, double year) {
		 double r = (rate / 100) / 12;   
	        double n = 12 * year;          

	        double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
	        
	        return payment;
	 }
//***********************************************************************************************
	 
	 public static double Triag(double degree) {
		 double radian = Math.toRadians(degree);
			
			double sin = Math.sin(radian);
			double cosine = Math.cos(radian);
			System.out.println("cos("+degree+") = " + cosine);
		    return sin;
			
			
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
	 
	 public static double sqrtNewtonMtd(double c) {
		 //Initialise t=c
		 double t = c;
		 double  epsilon = 1e-15;
		 //Repeat until desired accuracy reached
		 while(Math.abs(t - c/t) > epsilon*t) {
			 t = (c/t + t)/2.0;
		 }
		return t;
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
		if(result % 2 == 1) {
			 status = false;
		 }else {
			 status = true;
		 }
		 if(status) {
			 System.out.println("The resultant number is power of 2");
		 }else {
			 System.out.println("The resultant number is not power of 2");
		 }
	 }


//*****************************************************************************************
	 
	 public static void DecToBin(int n, int i, int j, int bin_num[]) {
		
		 while(n != 0) {
				bin_num[i++] = n % 2;
				n /= 2;
			}
			
			System.out.println("Binary number is: ");
			for(j = i -1; j > 0; j--) {
				System.out.print(bin_num[j]);
			}
			System.out.println("\n");
            
	 }
//********************************************************************************************
	 
	 public static double sinx(double x) {
		// convert x to an angle between -2 PI and 2 PI
	         x = x % (2 * Math.PI);

	        // compute the Taylor series approximation
	        double term = 1.0;      // ith term = x^i / i!
	        double sum  = 0.0;      // sum of first i terms in taylor series

	        for (int i = 1; term != 0.0; i++) {
	            term *= (x / i);
	            if (i % 4 == 1) 
	            	sum += term;
	            if (i % 4 == 3) 
	            	sum -= term;
	        }
	        return sum;
	 }
//********************************************************************************************
	 
	 public static int checkRepeated(int arr[], int size)
		
		{	
			int count = 0, curr_cnt = 1, freq_num = 0, key = 0;
		for(int i = 0; i < size-1; i++)
		{
		     key = arr[i];
		     
		     for(int j =i+1; j < size; j++)
		     {
		    	 //Check repeat number
		         if(key == arr[j] && freq_num != key)
		         {
		             curr_cnt++;
		         }
		     }
		     //check current count greater than count
		     if(count < curr_cnt)
		     {
		         count = curr_cnt;
		         curr_cnt = 1;
		         freq_num = key;
		     }
		}
		return freq_num;
			
	}	
//*******************************************************************************************
	 
	 public static void Repeatnum(int n, int array[]) {
		 for(int i = 0; i < n-1; i++) {
				for(int j = i+1; j < n; j++) {
					//Compare two array
					if(array[i] == array[j])
						System.out.println("Repeat number is: " + array[j]);
				}
			}
		
	 }
//*********************************************************************************************
	 
	 public static int Largest(int n, int array[]) {
		 int largest = array[0];
			int secondLargest = array[0];
			for(int i = 0; i < n; i++) {
				if(array[i] > largest) {
					secondLargest = largest;
					largest = array[i];
				}else if(array[i] > secondLargest) {
					secondLargest = array[i];
					
				}	
			}
			return secondLargest;
	 }
	 public static int Smallest(int n, int array[]) {
			
			int smallest = 0;
			int secondSmallest = 0;
			for(int i = 0; i < n; i++) {
				if(array[i] == smallest) {
					secondSmallest = smallest;
				}else if(array[i] < smallest) {
					secondSmallest = smallest;
					smallest = array[i];
				}else if(array[i] < secondSmallest){
					secondSmallest = array[i];
					
				}
				
			}
			return secondSmallest;
	 }	
//********************************************************************************************
	 
	 
}
