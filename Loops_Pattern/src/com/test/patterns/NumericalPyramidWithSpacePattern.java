package com.test.patterns;

import java.util.Scanner;

public class NumericalPyramidWithSpacePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row count: ");
		int rows = sc.nextInt();

		for (int row = 1; row <= rows; row++) {
			for (int column = 1; column <= rows - row; column++) {
				System.out.print(" ");
			}

			for (int column = 1; column <= row; column++) {
				if (column == 1 || row == rows)
					System.out.print(row);
				else
					System.out.print(" ");
			}
			for (int column = row - 1; column >= 1; column--) {
				if (column == 1 || row == rows)
					System.out.print(row);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
