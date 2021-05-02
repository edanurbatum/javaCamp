package day2Work1;

public class Category {
	public Category() {
		System.out.println("Kategori constructor'ýyým.");
	}
	public Category(int id,String name,int kursAdeti) {
		this();
		this.id=id;
		this.name=name;
		this.kursAdeti=kursAdeti;
	}
	int id;
	String name;
	int kursAdeti;

}
