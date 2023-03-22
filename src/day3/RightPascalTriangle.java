package day3;

import java.util.Scanner;

public class RightPascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		System.out.println("enter the N ");
		int n = sc.nextInt();
		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (i = n - 1; i >= 0; i--) {
			for (j = 0; j <= i - 1; j++) {
               System.out.print("* ");
			}
			System.out.println();
		}

	}
}