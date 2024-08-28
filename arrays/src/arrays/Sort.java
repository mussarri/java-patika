package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kac sayi gireceksiniz: ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + ". sayi: ");
			int num = input.nextInt();

			array[i] = num;

		}
		Arrays.sort(array);
		System.out.print(Arrays.toString(array));
	}
}
