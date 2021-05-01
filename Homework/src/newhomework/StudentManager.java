package newhomework;

public class StudentManager  {
	public void addStudent(Student student) {
		System.out.println(student.getName()+student.getLastname()+"   Add to Student");
	}
	public void addMultipleStudent(Student[] students) {
		for(Student student:students) {
			addStudent(student);
		}
	}

}
