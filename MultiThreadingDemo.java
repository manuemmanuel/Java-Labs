//Write a Java program that implements a multi-threaded program which has three threads. First
//
//thread generates a random integer every 1 second. If the value is even, second thread
//
//computes the square of the number and prints. If the value is odd the third thread will print the
//
//value of cube of the number
import java.util.Random;
public class MultiThreadingDemo {
	public static void main(String[] args) {
		ThreadOne one = new ThreadOne();
		Thread object = new Thread(one);
		object.start();

	}

}
class ThreadOne implements Runnable {
	int generatedNumber = new Random().nextInt(99)+2;
	public void run() {
		System.out.println("Generated Random Number: "+generatedNumber);
	}
}
class ThreadTwo extends ThreadOne implements Runnable {
	public void run() {
		int result = generatedNumber*generatedNumber;
		
	}
}
class ThreadThree implements Runnable {
	public void run() {
		
	}
}
