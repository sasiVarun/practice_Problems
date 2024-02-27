package com.test;

import java.util.Scanner;

public class CountDigits {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int input = scanner.nextInt();
		int numberCount = 0;
		int originalNumber = input;
		
		while(input>0) {
			input = input/10;
			numberCount++;
		}
		System.out.println("Entered number " + originalNumber + " has " + numberCount + " digits");
		scanner.close();
	}

}
