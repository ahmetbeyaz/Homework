package newhomework;

public class Main {

	public static void main(String[] args) {
	Student person=new Student();
	person.setId(1);
	person.setName("Ahmet");
	person.setLastname("Beyaz");
	person.setSchool("Derince Anadolu Lisesi");
	person.setClassname("11-A");
    System.out.println(person.getId()+person.getName()+person.getLastname()+person.getSchool()+person.getClassname());
    
    Instructor teacher=new Instructor();
	teacher.setId(2);
	teacher.setName("Engin");
	teacher.setLastname("Demirog");
	teacher.setBolum("Java Gelistirici Kampi");
	
	System.out.println(teacher.getId()+teacher.getName()+teacher.getLastname()+teacher.getBolum());
	
	StudentManager studentManager=new StudentManager();
	Student[] students= {person};
	studentManager.addMultipleStudent(students);
	InstructorManager instructorManager=new InstructorManager();
	Instructor[] instructors= {teacher};
	instructorManager.AddMultipleInstructor(instructors);
	
    
	}

}
