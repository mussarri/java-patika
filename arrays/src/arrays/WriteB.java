package arrays;

import java.util.Iterator;

public class WriteB {
	public static void main(String[] args) {
		String[][] list = new String[5][3];
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if(i == 1 && j == 1) {
					list[i][j] = "   ";
					continue;
				}
				if(i == 3 && j == 1) {
					list[i][j] = "   ";
					continue;
				}
				if((i ==0 && j == 2) || (i==2 && j ==2) || (i==4 && j ==2)) {
					list[i][j] = "*";
							 
					continue;
				}
				list[i][j] = "* ";
			}
		}
		
		
		for(String[] item: list) {
			for(String i: item) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
