package javaclass;
public class SynchronizationDemo {
	public static void main(String[] args) {
		MultiplicationTable mt = new MultiplicationTable();
		MythreadOne t = new MythreadOne(mt);
		t.setPriority(2);
		t.start();
		MythreadTwo m = new MythreadTwo(mt);
		m.setPriority(3);
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
