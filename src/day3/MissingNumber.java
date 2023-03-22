package day3;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		 int[] arr = { 1, 2, 3, 5 };
	        int N = arr.length;
	        System.out.println( MissingNumber(arr, N));
	}

	public static int MissingNumber(int array[], int n) {
		n = array.length;
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++)
			sum -= array[i];
		return sum;

	}
}
