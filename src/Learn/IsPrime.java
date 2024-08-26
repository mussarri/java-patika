package Learn;

public class IsPrime {
	
	static boolean isPrime(int a) {
		if(a==2) return true;
		
		return isPrime(a - 1 );
		 
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(3));
	}

}
