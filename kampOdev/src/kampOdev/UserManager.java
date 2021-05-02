package kampOdev;

import java.util.Scanner;     

public class UserManager {
	Scanner scanner = new Scanner(System.in);
	
	public void signIn(User user) {
		String _userName;
		String _password;
		
		System.out.print("Kullan�c� ad�: ");
		_userName = scanner.nextLine();
		System.out.print("�ifre: ");
		_password = scanner.nextLine();
		
		if (_userName.equals(user.getUserName()) && _password.equals(user.getPassword())) {
			System.out.println("Giri� ba�ar�l�");
		}
		
		else {
			System.out.println("Kullan�c� ad� veya �ifre hatal�");
		}
	}
	
	public void signOut(User user) {
		System.out.println("��k�� yap�ld�");
	}
}
