package day3;

import java.util.Scanner;

public class NaturalNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	System.out.println("enter num ");
	int num = sc.nextInt();
	for(int i=1;i<=num;i++) {
		
		sum+=i;
		
	}
	num++;
	System.out.println(sum);
}
}
