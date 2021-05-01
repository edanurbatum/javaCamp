package day3Task2;

public class UserManager {
	
    public void signIn(User user) {
    	System.out.println("kullanýcý sisteme giriþ yaptý: "+user.getName());  	
    }
	
    public void logOut(User user) {
    	System.out.println("kullanýcý sistemden çýkýþ yaptý: "+user.getName());  	
    }
	

}
