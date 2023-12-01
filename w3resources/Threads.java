//Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
public class Threads {
    public static void main(String[] args){
        ThreadOne to = new ThreadOne();
        to.start();
    }
}
class ThreadOne extends Thread {
    public void run(){
        System.out.println("Hello World");
    }
}
