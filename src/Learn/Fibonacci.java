package Learn;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Fibonacci eleman sayisini girin: ");
		int num = input.nextInt();
		int a=0;
		int b=1;
		int c;
		
		for(int i = 1; i <= num; i++) {
			System.out.println(a + b);
			c = b;
			b = a + b;
			a = c;
		}
	}
}
