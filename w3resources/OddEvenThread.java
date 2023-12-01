public class EvenOddThreads {
    public static void main(String[] args){

    }
}
class Odd extends Thread {
    public void run(){
        System.out.println("The Odd numbers: ");
        for (int i = 0;i < 20; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
class Even extends Thread {
    public void run(){
        
    }

}
