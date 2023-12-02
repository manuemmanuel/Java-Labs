import java.util.Random;
public class MultiThreadingDemo {
	public static void main(String[] args) {
		NumberThread ng = new NumberThread();
		ng.start();
	}
}
class Square extends Thread {
	int number;
	Square(int n){
		number = n;
	}
	public void run() {
		int square = number * number;
		System.out.println("The Square of the generated number is: "+ square);
	}
}
class Cube extends Thread {
	int number;
	Cube(int n) {
		number = n;
		}
	public void run(){
		int cube = number * number * number;
		System.out.println("The Cube of the generated number is:" + cube );
		}
	}
class NumberThread extends Thread {
	public void run() {
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			int generatedNumber = random.nextInt(10);
			System.out.println("Random generated number: " + generatedNumber);
			Square sq = new Square(generatedNumber);
			Cube c = new Cube(generatedNumber);
			if (generatedNumber % 2 == 0) {
				sq.start();
			}
			else {
				c.start();
			}
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					}
			}
		}
	}

