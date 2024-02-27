package com.test.patterns;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row count: ");
		int rows = sc.nextInt();

		for (int row = 1; row <= rows; row++) {
			for (int column = 1; column <= (rows - row); column++) {
				System.out.print(" ");
			}
			for (int column = 1; column <= (2 * row - 1); column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		// Inverted Pyramid
		for (int row = rows; row >= 1; row--) {
			for (int column = 1; column <= (rows - row); column++) {
				System.out.print(" ");
			}
			for (int column = 1; column <= (2 * row - 1); column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
