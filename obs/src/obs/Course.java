package obs;

public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note = 0;
	
	Course(String name, String code, String prefix, Teacher teacher){
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.teacher = teacher;
		
	}
	
	void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
			this.printTeacherInfo();
		}else {
			System.out.println("Dersler uyusmuyor.");
			
		}
	}

	void printTeacherInfo() {
		this.teacher.print();
	}
}
