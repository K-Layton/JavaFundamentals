package com.simple;

import java.util.Scanner;

public class SimpleAdder {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		int numbers[] = new int[10];

		for (int x = 0; x < 10; x++) {
			System.out.println("Please enter integer #" + (x + 1));
			int input = 0;
			try {
				input = scan.nextInt();
			} catch (java.util.InputMismatchException exception) {
				System.out.println("Please enter only numeric values.");
				scan.next();
				x--; 
				continue;
			}

			if (input < 0) {
				continue;
			}
			if (input == 0) {
				break;
			}
			sum += input;
			numbers[x] = input;
		}
		System.out.println("The numbers you entered were: ");
		for (int i = 0; i < 10; i++) {
			if (numbers[i] != 0) {
				System.out.println(numbers[i]);
			}
		}
		System.out.println("The sum is " + sum);
		scan.close();
	}

}
