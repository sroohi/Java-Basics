package multiThreading;

public class MultiThreaded extends Thread {
	public static void main(String[] args) throws InterruptedException {
		MultiThreaded mt = new MultiThreaded();
		mt.start();

		Thread currentThread = Thread.currentThread();
		System.out.println("Thread Name Is  :  " + currentThread.getName());

		/*
		 * for (int j = 1; j <= 200; j++) { System.out.print("j :" + j + "\t");
		 * Thread.sleep(1000); }
		 */

	}

	public void run() {
		Thread currentThread = Thread.currentThread();
		currentThread.setName("PRINT 200 NUMBERS");
		System.out.println("Thread Name Is  :  " + currentThread.getName());
		
		/*
		 * for (int i = 1; i <= 200; i++) { System.out.print("i :" + i + "\t");
		 * try { Thread.sleep(1000); } catch (InterruptedException e) {
		 * System.out.println("Child Thread Exiting"); } }
		 */

	}

}
