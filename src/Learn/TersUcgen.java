package Learn;

import java.util.Scanner;

public class TersUcgen {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Basamak sayisini giriniz: ");
		int bas = input.nextInt();
		for (int i = 2*bas -1 ; i >= 1; i-=2) { 
			for (int j = i ; j>=1; j--) {
			   System.out.print("*");	
			 
			}
			 System.out.print("\n");
		}
	}
}
