package Learn;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner input=  new Scanner(System.in);
		int n, max, min;
		System.out.println("Kac tane sayi gireceksiniz ?");
		n = input.nextInt();
		
		System.out.print("Birinci sayiyi giriniz:");
		
		int number = input.nextInt();
		max= number;
		min=max;
		
		
		for (int i = 2; i <= n; i++) {
			System.out.print("Sayi" + i + "=");
			int number2 = input.nextInt();
			if(number2 > max) {
				max = number2;
			}
			if(number2<  min) {
				min = number2;
			}
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
	}
}
