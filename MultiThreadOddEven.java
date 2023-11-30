/*Write a java program that creates three threads. First thread generates a random positive number (>1) every second. If the number is even, the second thread prints all even numbers between 1 and the generated number. If the number is odd, the third thread will print all odd numbers between 1 and the generated number.*/
package javaclass;
import java.util.Random;
public class MultiThreadOddEven {
	public static void main(String[] args) {
		NumberManager nm = new NumberManager();
		nm.generateNumber();

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
	public synchronized void printEvenNumbers() throws InterruptedException {
		while(!numberGenerated || generatedNumber % 2 != 0) {
			wait();
			for (int i = 2; i <= generatedNumber; i ++) {
				System.out.print(i+" ");
			}
			numberGenerated = false;
		}
	}
	public synchronized void printOddNumbers() throws InterruptedException {
		while(!numberGenerated || generatedNumber % 2 == 0) {
			wait();
			for (int i = 1; i <= generatedNumber; i ++) {
				System.out.print(i+" ");
			}
			numberGenerated = false;
		}
	}
}
class NumberGenerator extends Thread {
	NumberManager numberManager;
	public NumberGenerator(NumberManager numbermanager) {
		this.numberManager = numberManager;
	}
	public void run() {
		numberManager.generateNumber();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class ThreadTwo extends Thread {
	
}
class ThreadThree extends Thread {
	
}
