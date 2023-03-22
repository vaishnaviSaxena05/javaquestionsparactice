package day3;

import java.util.Scanner;

public class LeftTrianglePascal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		System.out.println("enter the N ");
		int n = sc.nextInt();
		
	    // the Left Pascal triangle pattern
		for (i = 1; i <= n; i++) {
              
			//Prints the whitespaces
			for (j = i; j <= n; j++) {
				System.out.print(" ");
			}
			//Prints the stars of each row
			 for (int k=1; k<=i;k++)
		      {
		        System.out.print("*");
		      }
			  //To move the cursor to new line for next row
			System.out.println();
		}

		for (i=n;  i>=1; i--) {
			
			for (j = i-1; j <= n ; j++) {
               System.out.print(" ");
			}
			for(int k=1; k<i ;k++)
		      {
		        System.out.print("*");
		      }
			System.out.println();
		}

	}
}
