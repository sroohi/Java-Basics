package ExceptionHandling;

public class MultiCatch {
	public static void main(String[] args) {
		try {
			String input = args[0];
			System.out.println("Input is  :" + input);
			int output = Integer.parseInt(input);
			System.out.println("Output is  :" + output);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Input is Required");
		} catch (NumberFormatException e) {
			System.out.println("Invalid Input");
		}
		System.out.println("rest of the code...");

	}// with runtime configuration you can have inputs

}
