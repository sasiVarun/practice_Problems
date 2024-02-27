package com.test.patterns;

import java.util.Scanner;

public class RecatangularPattern {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the row count:");
		int rows = scanner.nextInt();
		System.out.print("Enter the columns count:");
		int columns = scanner.nextInt();
		
		for(int row=1; row<=rows; row++) {
			for(int column=1; column<=columns; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}
