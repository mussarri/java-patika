package MineSweeper;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		MineSweeper mine = new MineSweeper(4, 4, s1);

		mine.create();
		mine.run();

	}
}

