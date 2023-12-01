public class Threads {
    public static void main(String[] args){
        ThreadOne to = new ThreadOne();
    }
}
class ThreadOne extends Thread {
    public void run(){
        System.out.println("Hello World");
    }
}
