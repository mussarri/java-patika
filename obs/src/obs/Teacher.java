package obs;

public class Teacher {
	String name;
	String branch;

	Teacher(String name, String branch){
		this.name = name;
		this.branch = branch;
	
	}
	
	void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Branch: " + this.branch);
	}
}
