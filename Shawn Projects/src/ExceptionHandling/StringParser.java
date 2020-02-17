package ExceptionHandling;

public class StringParser {
	public static void main(String[] args) {
		String s = "ABCD";
		try {
			int i = Integer.parseInt(s);
		} catch (Exception e) {
			System.out.println("Handling...");
		}
		System.out.println("rest of code...");
	}

}
