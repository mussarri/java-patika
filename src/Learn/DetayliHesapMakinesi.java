package Learn;

import java.util.Scanner;

public class DetayliHesapMakinesi {
	
	static void plus() {
		Scanner input = new Scanner(System.in);
		System.out.print("Kac sayi toplayacaksiniz :");
		int result = 0;
		int count = input.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.print("sayi " +(i+1) +": ");
			int num = input.nextInt();
			if(num == 0) {
				continue;
			}
			result += num;
		}
		System.out.println("\nSonuc: " + result);
		
	}
	
	static void minus() {
		Scanner input = new Scanner(System.in);
		
		int result = 0;
	
		
		System.out.print("Birinci Sayi :");
		int n1 = input.nextInt();
		result = n1;
		System.out.print(n1 + "den kac sayi cikaracaksiniz :");
		int count = input.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.print("sayi " +(i+1) +": ");
			int num = input.nextInt();
			result -= num;
		}
		
		System.out.println("\nSonuc: " + result);
		
	}
	
	
	static void multiple() {
		Scanner input = new Scanner(System.in);
		
		int result = 1;
	
		
		System.out.print("Kac sayi carpacaksiniz :");
		int count = input.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.print("sayi " +(i+1) +": ");
			int num = input.nextInt();
			if(num == 1) {
				continue;
			}
			if(num == 0) {
				result = 0;
				break;
	        }
			result *= num;
		}
		
		System.out.println("\nSonuc: " + result);
		
	}
	
	static void divide() {
		Scanner input = new Scanner(System.in);
		
		double result = 0;
	
		
		System.out.print("Bölünen :");
		int n1 = input.nextInt();
		result = n1;
		System.out.print(n1 + "sayisini kac sayiya boleceksiniz :");
		int count = input.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.print("sayi " +(i+1) +": ");
			int num = input.nextInt();
			if(num == 0) {
				System.out.print("Bölen sayı 0 olamaz");
				
			}
			result /= num;
		}
		
		System.out.println("\nSonuc: " + result);
		
	}
	
	static void power() {
		Scanner input = new Scanner(System.in);
		int a,b,base=1;
        System.out.print("Taban Sayi :");
        a = input.nextInt();
        System.out.print("Us Sayi :");
        b = input.nextInt();

        for(int i = 1; i <= b; i++) {
        	base*=a;
        }
        System.out.print("\nSonuc: "  + base);
        
	}
	
	static void factoriel() {
		Scanner input = new Scanner(System.in);
		System.out.print("Faktorieyl hesaplama, sayiyi giriniz: ");
		int a = input.nextInt();
		int result = 1;
		for (int i = 1; i <= a; i++) {
			
			result *=i;			
		}
		System.out.println("\nSonuc: " + result);
		
	}
	
	static void mod() {
		Scanner input = new Scanner(System.in);
		int n1,n2,result;
		System.out.print("Bölünen: ");
		n1 = input.nextInt();
		System.out.print("Bölüm: ");
		n2 = input.nextInt();
		if(n2 == 0) {
			System.out.println("Bölüm 0 olamaz");
			return;
		}
		result = n1 % n2;
		System.out.println("\n" + n1 + " sayisinin " + n2 + " ile bölümünden kalan: " + result);
		
	}
	
	static void rectangle() {
		int a,b,alan,cevre;
		Scanner input = new Scanner(System.in);
		System.out.print("Uzun kenar: ");
		a = input.nextInt();
		System.out.print("Kısa kenar: ");
		b = input.nextInt();
		if(a<=0 || b<=0) {
			System.out.println("Kenar 0'dan büyük  olmalıdır.");
			return;
		}
		alan = a * b;
		cevre = 2*(a+b);
		System.out.println("Alan: " + alan);
		System.out.println("Çevre: " + cevre);
	}
	
	public static void main(String[] args) {
		 	Scanner input = new Scanner(System.in);
	        int select;
	        String menu = "\n1- Toplama İşlemi\n"
	                + "2- Çıkarma İşlemi\n"
	                + "3- Çarpma İşlemi\n"
	                + "4- Bölme işlemi\n"
	                + "5- Üslü Sayı Hesaplama\n"
	                + "6- Faktoriyel Hesaplama\n"
	                + "7- Mod Alma\n"
	                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
	                + "0- Çıkış Yap";

	        do {
	            System.out.println(menu);
	            System.out.print("\nLütfen bir işlem seçiniz :");
	            select = input.nextInt();
	            switch (select) {
	                case 1:
	                    plus();
	                    break;
	                case 2:
	                    minus();
	                    break;
	                case 3:
	                    multiple();
	                    break;
	                case 4:
	                    divide();
	                    break;
	                case 5:
	                    power();
	                    break;
	                case 6:
	                    factoriel();
	                    break;
	                case 7:
	                    mod();
	                    break;
	                case 8:
	                    rectangle();
	                    break;
	                case 0:
	                    break;
	                default:
	                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
	            }
	        } while (select != 0);
	}

}
