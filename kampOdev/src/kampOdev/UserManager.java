package kampOdev;

import java.util.Scanner;     

public class UserManager {
	Scanner scanner = new Scanner(System.in);
	
	public void signIn(User user) {
		String _userName;
		String _password;
		
		System.out.print("Kullanýcý adý: ");
		_userName = scanner.nextLine();
		System.out.print("Þifre: ");
		_password = scanner.nextLine();
		
		if (_userName.equals(user.getUserName()) && _password.equals(user.getPassword())) {
			System.out.println("Giriþ baþarýlý");
		}
		
		else {
			System.out.println("Kullanýcý adý veya þifre hatalý");
		}
	}
	
	public void signOut(User user) {
		System.out.println("Çýkýþ yapýldý");
	}
}
