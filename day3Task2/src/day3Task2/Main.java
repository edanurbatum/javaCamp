package day3Task2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setUserId(1);
		instructor.setName("Engin Demiroð");
		instructor.setPassword("abcs456");
		instructor.setCourseTougthName("Java+React Kursu");
		instructor.setInstructorId(1);
		
		Student student=new Student();
		student.setUserId(2);
		student.setName("Edanur Batum");
        student.setPassword("vjakds445");
        student.setCardInformation("4564512");
        student.setCourseAttendance("devamlý");
        student.setCourseName("Java+React Kursu");
        student.setStudentId(1);
        
        UserManager userManager=new UserManager();
        userManager.signIn(instructor);
        userManager.logOut(student);
        
        InstructorManager instructorManager=new InstructorManager();
        instructorManager.giveHomework(instructor);
        
        StudentManager studentManager=new StudentManager();
        studentManager.doHomework(student);
        
      
	}

}
