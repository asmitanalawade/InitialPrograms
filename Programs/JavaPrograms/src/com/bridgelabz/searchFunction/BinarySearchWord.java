package com.bridgelabz.searchFunction;

import java.io.*;

public class BinarySearchWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = "/home/bridgelabz/Desktop/Programs/JavaPrograms/src/com/bridgelabz/searchFunction/File.txt";
		File fileName = new File(file);
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = null;
		String [] arr = {};
		int n =arr.length;
		System.out.println( n);
		
		while((line = br.readLine()) != null){
		     //process the line
			
			
		     System.out.println(line);
		}
		
		
	}
	
	

}
