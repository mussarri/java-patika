package Learn;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Ucgen satir sayisi Giriniz :");
		int number = input.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i - 1); j++) {
				System.out.print("*");
			}
		
			System.out.println("");
		}
		
	}

}
