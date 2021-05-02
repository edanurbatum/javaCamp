package day2Work1;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(1,"Java+React Kampý","Engin Demiroð","Ders Programý, 1.Gün Sonu Kayýt...");
		Course course2=new Course(2,"C# + ANGULAR Kampý","Engin Demiroð","Ders Programý, 1.Gün Sonu Kayýt,Mini Quiz...");
        Course course3=new Course(3,"Temel Kurs","Engin Demiroð","Programlamaya Giriþ, Programlama Mantýðý...");
		
        Course [] courses= {course1,course2,course3};
		
        Category category1=new Category(1,"Programlama",3);
        Category category2=new Category(2,"Kurulumlar",0);
        
        CourseManager courseManager=new CourseManager();
        courseManager.kursaKaydol(course1);
        courseManager.kursaKaydol(course2);
        courseManager.kursaKaydol(course3);
        courseManager.kurstanAyril(course3);
        
	}

}
