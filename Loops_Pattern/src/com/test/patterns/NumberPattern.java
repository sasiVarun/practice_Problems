package com.test.patterns;

import java.util.Scanner;

public class NumberPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row count: ");
		int rows = sc.nextInt();
		System.out.print("Enter the column count: ");
		int columns = sc.nextInt();
		
		for(int row=1; row<=rows;row++) {
			for(int column=1;column<=columns; column++) {
				if((row+column)%2 == 0) {
					System.out.print("1");
				}else {
					System.out.print("2");
				}
			}
			System.out.println();
		}
	}

}
