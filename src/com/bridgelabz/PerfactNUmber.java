/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;
/**
 * @author PAVITHRA C
 *
 */
public class PerfactNUmber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number:- ");
		int number = scanner.nextInt();

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println(number + " Number is perfect.");
		} else {
			System.out.println(number + " Number is not perfect.");
		}
	}

}
	

