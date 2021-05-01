package newhomework;

public class Student extends User {
	public Student() {
		super();
	}
	
	String classname;
	String school;

	public Student(String classname,String school,int id, String name, String lastname) {
		super(id,name,lastname);
		this.classname = classname;
		this.school=school;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	

}
