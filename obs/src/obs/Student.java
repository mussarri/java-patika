package obs;

public class Student {
	String name,stuNo;
    int classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;
    
    Student(String name, String stuNo, int classes, Course c1, Course c2, Course c3){
    	this.name = name;
    	this.stuNo= stuNo;
    	this.classes = classes;
    	this.c1 = c1;
    	this.c2 = c2;
    	this.c3 = c3;
    	this.avarage = 0.0;
    	this.isPass = false;
    	
    	
    }
    
    void addExamNote(int not1, int not2, int not3) {
    	if(not1 >= 0 && not1 <= 100) this.c1.note = not1;
    	if(not2 >= 0 && not2 <= 100) this.c2.note = not2;
    	if(not3 >= 0 && not3 <= 100) this.c3.note = not3;
    }
    
    void printNote() {
    	System.out.println(c1.name + " note: " + c1.note);
    	System.out.println(c2.name + " note: " + c2.note);
    	System.out.println(c3.name + " note: " + c3.note);
    }
    
    void isPass() {
    	this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3;
    	System.out.println("Average: " + this.avarage);
    	this.isPass = this.avarage > 60 ? true : false;
    	System.out.println("Is Pass : " + (this.isPass ? "Pass" : "Not Pass"));
    	
    }
    
    
}
