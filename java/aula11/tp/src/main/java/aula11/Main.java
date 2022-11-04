package aula11;

public class Main {

	public static void main(String[] args) {
		MinhaThread thread1 = new MinhaThread("a");
		MinhaThread thread2 = new MinhaThread("b");
		MinhaThread thread3 = new MinhaThread("c");

		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
