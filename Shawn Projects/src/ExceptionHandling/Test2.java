package ExceptionHandling;

public class Test2 {
	public static void main(String[] args) throws CheckedCustomExceptions {
		// throw new UncheckedCustomExceptions("Business Exception Occured");
		throw new CheckedCustomExceptions("Business Exception that needs to be handled");
	}

}
