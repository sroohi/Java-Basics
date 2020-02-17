package multiThreading;

public class SingleThread {
	public static void main(String[] args) {

		SingleThread st = new SingleThread();
		st.printNumber();

		for (int j = 1; j <= 200; j++) {
			System.out.print("j :" + j + "\t");
		}

	}

	void printNumber() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("i :" + i + "\t");
		}
	}

}
