package kampOdev;

public class Instructor extends User {
	private String name;
	private String lastName;
	private String instructorNo;
	
	public Instructor(String email, String gsm, int id, String userName,
					String password, String name, String lastName, String instructorNo) 
	{
		super(email, gsm, id, userName, password);
		this.name = name;
		this.lastName = lastName;
		this.instructorNo = instructorNo;
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

	public String getInstructorNo() {
		return instructorNo;
	}

	public void setInstructorNo(String instructorNo) {
		this.instructorNo = instructorNo;
	}	
}
