package Learn;

import java.util.Scanner;

public class IsPrime {
	
	static void isPrime(int a, int b) {
		
		if(b > a/2) {
			System.out.println("Prime");
			return;
		}
		if(a % b == 0) {
			System.out.println("Not prime");
			return;
		}
		
		isPrime(a, b + 1);
 
	}
	
	static void isPrime(int a) {
		isPrime(a, 2);	 
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Is prime this number: ");
		int num = input.nextInt();
		isPrime(num);
		
	}

}
