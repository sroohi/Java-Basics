package ExceptionHandling;

public class ThrowKeyword {
	public static void main(String[] args) {
		try {
			throw new Exception("Funds Not Available");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
