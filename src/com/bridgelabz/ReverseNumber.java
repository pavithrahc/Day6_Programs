/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;
/**
 * @author PAVITHRA C
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number:-");
		int number = scanner.nextInt();

		int reverse = 0;

		while (number != 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("Reversed number is :" + reverse);

	}



}
