import java.util.Scanner;
public class SynchronizationDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MultiplicationTable mt = new MultiplicationTable();
		System.out.println("Enter the priority for the first thread: ");
		int n = scan.nextInt();
		System.out.println("Enter the priority for the second thread: ");
		int num = scan.nextInt();
		MythreadOne t = new MythreadOne(mt);
		t.setPriority(n);
		t.start();
		MythreadTwo m = new MythreadTwo(mt);
		m.setPriority(num);
		m.start();
	}
}
class MythreadOne  extends Thread {
	MultiplicationTable t = new MultiplicationTable();
	MythreadOne(MultiplicationTable t){
		this.t = t;
	}
	public void run() {
		System.out.println("Name: "+Thread.currentThread().getName());
		System.out.println("Priority: "+Thread.currentThread().getPriority());
		t.print(5);
	}
}
class MultiplicationTable {
	synchronized void print(int number) {
				for (int i = 1; i <= 10; i++) {
				System.out.println(i+"x"+number+"="+i*number);
			}
	}
}
class MythreadTwo extends Thread {
	MultiplicationTable tm = new MultiplicationTable();
	MythreadTwo(MultiplicationTable tm){
		this.tm = tm;
	}
	public void run() {
		System.out.println("Name: "+Thread.currentThread().getName());
		System.out.println("Priority: "+Thread.currentThread().getPriority());
		tm.print(10);
	}
}
