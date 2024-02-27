package com.test.patterns;

import java.util.Scanner;

public class RecatangleWithSpacePattern {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the row count: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the column count: ");
		int columns = scanner.nextInt();
		
		for(int row=1; row<=rows; row++) {
			for(int column=1; column<=columns; column++) {
				if(row == 1 || row == rows ||column == 1 || column == columns) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
