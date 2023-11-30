/*Write a java program that creates three threads. First thread generates a random positive number (>1) every second. If the number is even, the second thread */
package javaclass;
import java.util.Random;
public class MultiThreadOddEven {
	public static void main(String[] args) {
		

	}

}
class NumberManager {
	private int generatedNumber;
	private boolean numberGenerated = false;
	public synchronized void generateNumber() {
		generatedNumber = new Random().nextInt(99)+2;
		System.out.println("Generated Random Number: "+generatedNumber);
		numberGenerated = true;
	}
}
class ThreadOne extends Thread {
	
}
class ThreadTwo extends Thread {
	
}
class ThreadThree extends Thread {
	
}
