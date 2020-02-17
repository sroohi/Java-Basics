package FirstSession;

public class Test {

	public static void main(String[] args) {
		AdminstrationServices as = new AdminstrationServices();
		Student s = new Student();
		s.setId(5220);
		s.setName("Shawn");
		as.admit(s);

	}

}
