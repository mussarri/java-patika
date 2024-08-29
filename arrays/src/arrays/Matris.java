package arrays;

public class Matris {

	static void transpose(int[][] matris) {
		
		int[][] transposition = new int[matris[0].length][matris.length];

		for (int i = 0; i < matris[0].length; i++) {
			for (int j = 0; j < matris.length; j++) {
				transposition[i][j] = matris[j][i];
			}
		}
		
		for (int[] item : transposition) {
			for (int i : item) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] matris = { { 1, 2, 3 }, { 4, 5, 6 } };

		transpose(matris);

	}
}
