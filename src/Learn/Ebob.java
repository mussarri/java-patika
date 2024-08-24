package Learn;

import java.util.Scanner;

public class Ebob {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, ekok;
		System.out.println("Birinci sayiyi giriniz: ");
		n1 = input.nextInt();
		System.out.println("Ikinci sayiyi giriniz: ");
		n2 = input.nextInt();
		int lower = n1 > n2 ? n2 : n1;
		int higher = n1 > n2 ? n1 : n2;
		int ebob = lower;
		
 
		while (ebob > 1) {			 
			if(lower%ebob==0 && higher%ebob==0 ) {				
				break;
			}else {
				ebob --;
			}
			System.out.println(ebob);
		}
		
		ekok = (n1 * n2) / ebob;
		
		System.out.println("EKOK: " + ekok);
		System.out.println("EBOB: " + ebob);
		
	}
}
