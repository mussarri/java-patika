package Learn;

import java.util.Scanner;

public class RecursivePattern {
	
	static void recursivePattern(int a, int b, int c) {
		
		int num =a;
		if(b == 1) {
			System.out.print(" " + num);
			num -=5 ;
			if(num <= 0) {				
				recursivePattern(num, 2, c);
			}else {
				recursivePattern(num, 1, c);
			}
		}else if(b == 2) {
			System.out.print(" " + num);
			num +=5 ;
			if(num == c) {
				System.out.print(" " + num);
				return;
			}
			recursivePattern(num, 2, c);
			
		}else {
			return;
		}
	
	}
	
	static void recursivePattern(int a) {		 
		recursivePattern(a,1,a);
	}


	public static void main(String[] args) {
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.print("\nSayiyi giriniz: ");
			int number = input.nextInt();
			recursivePattern(number);
		}
	}

}
 