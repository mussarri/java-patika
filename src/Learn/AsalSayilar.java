package Learn;

public class AsalSayilar {
	public static boolean isPrime(int n) {
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
		
	}
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if(isPrime(i) == true) {
				System.out.println(i);
			}
		}
	}

}
