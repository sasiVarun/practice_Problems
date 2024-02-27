package com.test;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter the number");
		int input = scanner.nextInt();
		int originalNumber = input;
		int answer = 0;
		
		while(input>0) {
			answer = answer * 10 + input%10;
			input = input/10;
		}
		System.out.println("Reverse of entered number " + originalNumber + " is " + answer);
		scanner.close();
	}

}
