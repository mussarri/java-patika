package boxGame;

public class Fighter {
	String name; 
	int damage;
	int health;
	int weight;
	int block;
	
	Fighter(String name , int damage, int health, int weight, int block){
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		this.block = block;
	}
	
	int hit(Fighter to) { 
		
		if(to.isBlock()) {
			System.out.println(to.name + " gelen hasari blockladi.");
			return to.health;
		}
		
		if(!to.isBlock()) {
			System.out.println(this.name + " => " + to.name + " " + this.damage + " hasar verdi." );
		}
		
		if(to.health - this.damage < 0 ) {
			return 0;
		}
		return to.health - this.damage;
	}
	
	boolean isBlock() {
		double random = Math.random() * 100;
		return random <
				this.block;
	}

	
	
}
