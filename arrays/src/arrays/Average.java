package arrays;

public class Average {
	public static void main(String [] args) {
		int[] list = {2,33,112,243,63,78,23,23};
		int sum = 0;
		double average= 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		average = (sum)/list.length;
		System.out.print(average);
	}
}
