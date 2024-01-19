package assignment2.com;

import java.util.Scanner;

public class CurrrencyDenominations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of currencies");
		int size = sc.nextInt();

		int currency[] = new int[size];
		System.out.println("Please enter the note denominations");
		for (int i = 0; i < currency.length; i++) {
			currency[i] = sc.nextInt();
		}
		// For descending sort using bubble sort:
		int temp;
		for (int i = 0; i < currency.length; i++) {
			for (int j = i+1; j < currency.length; j++) {
				if (currency[j] > currency[i]) {
					temp = currency[j];
					currency[j] = currency[i];
					currency[i] = temp;

				}
			}
		}
		// for printing array
		System.out.println("Denominatations");
		System.out.print("[");
		for (int i = 0; i < currency.length; i++) {
			System.out.print(currency[i] + " ");
		}
		System.out.print("]");
		System.out.println();

		// For entering amount
		System.out.println("Enter the amount");
		int amount = sc.nextInt();

		// For calculating number of notes
		int sum = 0;
		int note;
		for (int i = 0; i < currency.length; i++) {
			note = amount / currency[i];
			amount = amount % currency[i];
			sum = sum + note;
			System.out.println("Note " + currency[i] + " X " + note + "= " + (currency[i] * note));
			System.out.println();
			if (amount==0) {
				break;
			}
		}
		System.out.println("Minimum number of notes " + sum);
		System.out.println("Balance remaining "+amount);
		sc.close();

	}

}
