import java.util.Scanner;

public class FpurFunctionCalculator {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		char operator;
		double answer = 0;
		Scanner scannObject = new Scanner(System.in);

		System.out.println("Enter First Number:");
		num1 = scannObject.nextInt();
		System.out.println("Enter Second Number:");
		num2 = scannObject.nextInt();
		System.out.println("Enter Type Of Operator(+,-,*,/)");
		operator = scannObject.next().charAt(0);

		switch (operator) {
		case '+':
			answer = num1 + num2;
			break;
		case '-':
			answer = num1 - num2;
			break;
		case '*':
			answer = num1 * num2;
			break;
		case '/':
			answer = num1 / num2;
			break;

		}
		System.out.println(num1 + " " + operator + " " + num2 + "=" + answer);

	}

}
