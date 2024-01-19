package assignment1.com;

import java.util.Scanner;

public class TransactionTarget {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of days shop was open");
		int noOfDays = sc.nextInt();

		int revenue[] = new int[noOfDays];
		System.out.println("Please enter the collection for each day");
		for (int i = 0; i < revenue.length; i++) {
			revenue[i] = sc.nextInt();
		}

		System.out.println("Enter no. of targets");
		int totalTargets = sc.nextInt();
		int sum;
		int flag = 0;

		for (int i = 1; i <= totalTargets; i++) {
			System.out.println("Enter the value of target " + i);
			int target = sc.nextInt();
			sum = 0;
			flag = 0;
			for (int j = 0; j < revenue.length; j++) {
				sum = sum + revenue[j];
				if (sum >= target) {
					System.out.println("Target achieved on day " + (j + 1));
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Target not achieved");
			}
		}
		sc.close();
	}

}
