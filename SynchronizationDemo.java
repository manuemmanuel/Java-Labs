package javaclass;
public class SynchronizationDemo {
	public static void main(String[] args) {
		MultiplicationTable mt = new MultiplicationTable();
		MythreadOne t = new MythreadOne(mt);
		t.start();
		MythreadTwo m = new MythreadTwo(mt);
		m.start();

	}
}
class MythreadOne  extends Thread {
	MultiplicationTable t = new MultiplicationTable();
	MythreadOne(MultiplicationTable t){
		this.t = t;
	}
	public void run() {
		t.print(5);
	}
}
class MultiplicationTable {
	void print(int number) {
		synchronized(this) {
				for (int i = 1; i <= 10; i++) {
				System.out.println(i+"x"+number+"="+i*number);
			}
		}
	}
}
class MythreadTwo extends Thread {
	MultiplicationTable tm = new MultiplicationTable();
	MythreadTwo(MultiplicationTable tm){
		this.tm = tm;
	}
	public void run() {
		tm.print(10);
	}
}
