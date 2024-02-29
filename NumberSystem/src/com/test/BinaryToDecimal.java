package com.test;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number in Binary format: ");
		int binaryNumber = sc.nextInt();
		int originalNumber = binaryNumber;
		int decimal = 0;
		int power = 1; //intially 2^0 is 1
		
		while(binaryNumber>0) {
			int unit = binaryNumber%10;
			decimal = decimal + unit * power;
			binaryNumber/=10;
			power*=2;
		}
		System.out.println("Entered " + originalNumber + " in decimal format is: " + decimal);
	}

}
