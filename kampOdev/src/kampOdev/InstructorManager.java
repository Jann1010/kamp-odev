package kampOdev;

public class InstructorManager {
	public void deleteStudent(User instructor, User student) {
		Student student2 = (Student) student;
		System.out.println("Öğrenci silindi: " + student2.getName());
	}
	
	public void addStudent(User instructor, User student) {
		Student student2 = (Student) student;
		System.out.println("Öğrenci eklendi: " + student2.getName());
	}
}
