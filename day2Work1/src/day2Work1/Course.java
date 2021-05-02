package day2Work1;

public class Course {
	
	public Course() {
		System.out.println("Çalýþtým");
	}
	public Course(int id, String name, String educator, String courseProgram) {
		this();
		this.id=id;
		this.name=name;
		this.educator=educator;
		this.courseProgram=courseProgram;
	}
	int id;
	String name;
	String educator;
	String courseProgram;

}
