package com.test;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Decimal Number: ");
		int decimalNumber = sc.nextInt();
		int originalNumber = decimalNumber;
		int binaryNumber = 0;
		int power = 1; //initially 10^0 is 1
		
		while(decimalNumber>0) {
			int parity = decimalNumber%2;
			binaryNumber = binaryNumber + parity * power;
			power*=10;
			decimalNumber/=2;
		}
		System.out.println("Entered " + originalNumber + " in binary format is: " + binaryNumber);
	}
}
