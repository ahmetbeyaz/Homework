package newhomework;

public class InstructorManager {
	public void AddInstructor(Instructor instructor) {
		System.out.println(instructor.getName()+instructor.getLastname()+"  Add to Instructor");
		
	}
	public void AddMultipleInstructor(Instructor[] instructors) {
		for(Instructor instructor:instructors) {
			AddInstructor(instructor);
		}
	}

}
