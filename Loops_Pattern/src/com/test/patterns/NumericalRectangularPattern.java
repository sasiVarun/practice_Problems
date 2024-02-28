package com.test.patterns;

import java.util.Scanner;

public class NumericalRectangularPattern {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the row count: ");
		int rows = scanner.nextInt();
		
		for(int row=1; row<=rows; row++) {
			for(int column=row; column<=rows; column++) {
				System.out.print(column);
			}
			
			for(int column=1; column<=row-1; column++) {
				System.out.print(column);
			}
			System.out.println();
		}
		scanner.close();
	}

}
