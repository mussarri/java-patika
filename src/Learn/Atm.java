package Learn;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		String username, password; 
		int right = 3;
		Scanner input = new Scanner(System.in);
		int balance = 2000;
        int select;
		
		while(right > 0) {
			System.out.print("Kullanici adiniz: ");
			username = input.nextLine();
			System.out.print("Sifreniz: ");
			password = input.nextLine();
			if(username.equals("ahmet") && password.equals("1234")) {
				System.out.println("Giris basarili");
				do {
				   System.out.println("1-Para yatırma");
				   System.out.println("2-Para Cekme");
				   System.out.println("3-Bakiye ogrenme");
				   System.out.println("4-Cikis yap");
				   System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");	
				   select = input.nextInt();
				   if(select == 1) {
					   System.out.print("Para yatirma islemi, tutar giriniz: ");	
					   int amount = input.nextInt();
					   balance += amount;
					   System.out.println("\nPara yatirma islemi basarili\n");	
				   }else if (select == 2) {
					   System.out.print("Para cekme islemi, tutar giriniz: ");
					   int amount = input.nextInt();
					   if(balance >= amount) {
						   balance -= amount;
						   System.out.println("\nPara cekme islemi basarili.\n");
					   }else {
						   System.out.println("\nYetersiz bakiye.\n");
					   }   
				   }else if (select == 3) {
					   System.out.println("Bakiyeniz:" + balance);
					   
				   }
				} while (select != 4);
				System.out.println("\nCikis yapildi.");
                break;
			}else {
				--right;
				System.out.println("Kullanici adiniz veya sifre yanlis");
				if(right == 0) {
					System.out.println("Hesabiniz bloke olmustur.");
				}else {
					System.out.println("Kalan hakkiniz: " + right);
				}
					
			}
		}
	}

}
