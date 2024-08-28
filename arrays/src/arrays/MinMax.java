package arrays;

public class MinMax {
	public static void main(String[] args) {
		int[] list = { 2, 23, 43, -21, 54, -44, 19, -42, 86, 83, -53, -87, 87 };
		int min = list[0];
		int max = list[0];
		for (int i = 0; i < list.length; i++) {
			if(list[i] > max) {
				max = list[i];
			}
			if(list[i] < min) {
				min = list[i];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}

}
