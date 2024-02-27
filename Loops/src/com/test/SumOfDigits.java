package com.test;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int input = scanner.nextInt();
		int originalNumber = input;
		int sum = 0;
		
		while(input>0) {
			sum = sum + input%10;
			input = input/10;
		}
		System.out.println("Sum of entered number " + originalNumber + " is " + sum);
		scanner.close();
	}
}
