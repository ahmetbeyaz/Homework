package newhomework;

public class Instructor extends User {
	public Instructor() {
		super();
	}
	String Bolum;

	public Instructor(String bolum,int id, String name, String lastname) {
		super(id,name,lastname);
		Bolum = bolum;
	}

	public String getBolum() {
		return Bolum;
	}

	public void setBolum(String bolum) {
		Bolum = bolum;
	}
	

}
