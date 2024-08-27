package obs;

public class Main {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Ahmet", "TRH");
		Teacher t2 = new Teacher("Mesut", "MAT");
		Teacher t3 = new Teacher("Mustafa", "BIY");
		Course tarih = new Course("Tarih","101","TRH",t1);
		Course mat = new Course("Matematik","102","MAT",t2);
		Course biyo = new Course("Biyoloju","101","BIY",t3);
		tarih.addTeacher(t1);
		mat.addTeacher(t2);
		biyo.addTeacher(t3);
		
		Student s1 = new Student("Ali", "10805",4,tarih,mat,biyo);
		s1.addExamNote(82, 5, 90);
		s1.printNote();
		s1.isPass();
	}
}
