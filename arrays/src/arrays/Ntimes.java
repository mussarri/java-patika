package arrays;

public class Ntimes {
	public static void main(String[] args) {
		int[] array = { 10, 20, 39, 10, 20, 10, 40, 50 };
		for (int i = 0; i < array.length; i++) {
			int times = 1;
			for (int j = 0; j < array.length; j++) {
				if (i == j) {
					continue;
				}
				if (array[i] == array[j]) {
					times++;
				}
				
			}
			if (times > 1) {
				System.out.println(array[i] + " iterate " + times + " times");
			}
		}
	}

}
