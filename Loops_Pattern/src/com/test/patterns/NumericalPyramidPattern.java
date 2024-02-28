package com.test.patterns;

import java.util.Scanner;

public class NumericalPyramidPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row count: ");
		int rows = sc.nextInt();

		for (int row = 1; row <= rows; row++) {
			for (int column = 1; column <= rows - row; column++) {
				System.out.print(" ");
			}
			// Printing numbers till before revers of numbers starts
			for (int column = 1; column <= row; column++) {
				System.out.print(column);
			}

			for (int column = row - 1; column >= 1; column--) {
				System.out.print(column);
			}
			System.out.println();
		}
	}
}
