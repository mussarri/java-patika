package Learn;

public class Fibonacci2 {
	
	static int fibonacci(int a) {
		if(a == 0) return 0;
		if(a == 1) return 1;
		return fibonacci(a -1) + fibonacci(a-2);
	}
	
	public static void main(String[] args) {
		System.out.print(fibonacci(6));
	}
}
