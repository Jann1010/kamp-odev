package kampOdev;

public class Student extends User {
	private String name;
	private String lastName;
	private String studentNo;
	
	public Student(String email, String gsm, int id, String userName, 
			String password, String name, String lastName, String studentNo) 
	{
		super(email, gsm, id, userName, password);
		this.name = name;
		this.lastName = lastName;
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	
	
}
