package boxGame;

public class Main {
	public static void main(String[] args) {
		
		Fighter f1 = new Fighter("Ali", 10, 125, 74, 100);
		Fighter f2 = new Fighter("Mehmet", 12, 110, 78, 50);
		Match match = new Match(f1,f2,70,90);
		match.run();
		
	}
}
