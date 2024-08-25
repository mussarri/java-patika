package Learn;

import java.util.Scanner;

public class Palliindrom {
	
	public static boolean isPallindrome(int a) {
		int number = a, reverseNumber = 0;
		
		while(number != 0) {
			int son_basamak = number % 10;
			reverseNumber = (reverseNumber  * 10) + son_basamak;
			number /= 10;
		}
		
		if(a == reverseNumber) {
			return true;
		}else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Palindrom sayi kontrolu: ");
		int num = input.nextInt();	
		if(isPallindrome(num)) {
			System.out.print(num + " palindrom sayidir.");
		}else {
			System.out.print(num + " Palindrom sayi degildir.");
		}
	}
}
