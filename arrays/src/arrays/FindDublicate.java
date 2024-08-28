package arrays;

import java.util.Arrays;

public class FindDublicate {
	
 
	static boolean isInclude(int[] array, int a) {
		for(int item: array) {
			if(item == a) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] list = { 2, 5, 3, 6, 3, 12, 32, 43, 21, 32, 45 };
		int[] dublicate = new int[list.length];
		int index = 0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (i == j) {
					continue;
				}
				if (list[i] == list[j]) {
					if (!isInclude(dublicate, list[i])) {
						dublicate[index] = list[i];
						index++;
					}
					break;

				}
			}
		}
		for (int a: dublicate) {
			if(a != 0) {
				System.out.println(a);
			}
		}
	}

}
