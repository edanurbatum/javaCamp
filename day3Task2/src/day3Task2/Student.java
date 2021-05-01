package day3Task2;

public class Student extends User {
	
	private int studentId;
	private String cardInformation;
	private String courseName;
    private String courseAttendance;
    
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCardInformation() {
		return cardInformation;
	}
	public void setCardInformation(String cardInformation) {
		this.cardInformation = cardInformation;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseAttendance() {
		return courseAttendance;
	}
	public void setCourseAttendance(String courseAttendance) {
		this.courseAttendance = courseAttendance;
	}

}
