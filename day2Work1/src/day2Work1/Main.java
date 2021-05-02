package day2Work1;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(1,"Java+React Kamp�","Engin Demiro�","Ders Program�, 1.G�n Sonu Kay�t...");
		Course course2=new Course(2,"C# + ANGULAR Kamp�","Engin Demiro�","Ders Program�, 1.G�n Sonu Kay�t,Mini Quiz...");
        Course course3=new Course(3,"Temel Kurs","Engin Demiro�","Programlamaya Giri�, Programlama Mant���...");
		
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
