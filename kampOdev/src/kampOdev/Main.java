package kampOdev;

public class Main {

	public static void main(String[] args) {
		User instructor = new Instructor("abc@gmail.com", "5461111111", 1, "cann10", "can12345","Aziz Can","ÖZ", "12345");
		
		UserManager userManager = new UserManager();
		
		userManager.signIn(instructor);
		
		User student = new Student("abc@gmail.com", "5462222222", 2, "emre20", "emre56789","Emre","OYTUN", "56789");
		
		StudentManager studentManager = new StudentManager();
		studentManager.sendHomework(student);
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.deleteStudent(instructor, student);
	}
}
