package com.test.patterns;

import java.util.Scanner;

public class TrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row count");
		int rows = sc.nextInt();

		for (int row = 1; row <= rows; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		// Inverted Triangle
		for (int row = rows; row >= 1; row--) {
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		// Inverted Triangle (Another logic)
		for (int row = 1; row <= rows; row++) {
			for (int column = 1; column <= ((rows + 1) - row); column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
