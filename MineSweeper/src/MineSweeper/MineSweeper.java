package MineSweeper;

import java.util.Scanner;

public class MineSweeper {

	int col;
	int row;
	String[][] array;
	Scanner s1;

	MineSweeper(int col, int row, Scanner s1) {
		this.col = col;
		this.row = row;
		this.s1 = s1;
		this.array = new String[col][row];
	}

	void create() {
		int mine = (col * row) / 4;

		System.out.println("Hosgeldiniz");

		while (mine > 0) {
			int rand1 = (int) (Math.random() * row);
			int rand2 = (int) (Math.random() * col);
			if (this.array[rand1][rand2] != "*") {
				this.array[rand1][rand2] = "*";
			} else {
				continue;
			}

			mine--;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (this.array[i][j] == null) {
					this.array[i][j] = "-";
				}
			}
		}

		this.print();
		this.run();
	}

	boolean hasEmpty() {
		int empty = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (this.array[i][j].equals("-")) {
					empty++;
				}
			}

		}
		if (empty == 0) {
			return false;
		} else {
			return true;
		}

	}

	void run() {
		while (this.hasEmpty()) {
			System.out.print("Satir: ");
			int row = s1.nextInt();
			System.out.print("Sutun: ");
			int col = s1.nextInt();
			if (row >= this.array.length || col >= this.array[0].length) {
				System.out.println("Gecerli koordinat giriniz!");
				continue;
			}
			if (this.array[row][col] == "-") {
				this.array[row][col] = this.findNum(row, col);
				this.print();
			} else if (this.array[row][col] == "*") {
				System.out.println("BOMB!");
				this.showFull();
				this.restart();
				break;

			}
		}
		if (!this.hasEmpty()) {
			System.out.println("Congratulations!");
			this.restart();
		}
	}

	void print() {
		System.out.println("-----------------");
		for (String[] row : this.array) {
			for (String item : row) {
				if (item.equals("*")) {
					System.out.print("- ");
				} else {
					System.out.print(item + " ");
				}
			}
			System.out.println();
		}

	}
	void showFull() {
		System.out.println("-----------------");
		for (String[] row : this.array) {
			for (String item : row) {
				System.out.print(item + " ");
			}
			System.out.println();
		}

	}

	void restart() {
		this.array = new String[col][row];
		this.create();
	}

	String findNum(int r, int c) {
		int row = r;
		int col = c;

		int count = 0;

		for (int i = row - 1; i <= row + 1; i++) {
			if (i < 0)
				i = 0;
			if (i > this.array.length - 1) {
				continue;
			}

			for (int j = col - 1; j <= col + 1; j++) {
				if (j < 0)
					j = 0;
				if (j > this.array[0].length - 1) {
					continue;
				}

				if (this.array[i][j] == "*") {
					count++;
					continue;
				}

			}

		}

		return Integer.toString(count);
	}

}
