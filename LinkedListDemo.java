import java.util.Scanner;
import java.util.LinkedList;
public class LinkedListDemo {
	public static void main(String[] args) {
		DoublyLinkedList <Integer> dll = new DoublyLinkedList <Integer>();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (choice < 6) {
			System.out.print("1.Insert at Front\n2.Insert at Last\n3.Insert at any position\n4.Remove from any position\n5.Display\n6.Exit\nEnter your choice: ");
            choice = scan.nextInt();
            switch (choice) {
            case 1: 
            	System.out.println("Enter the Element: ");
            	int numbers = scan.nextInt();
            	dll.insertFront(numbers);
            	break;
            case 2:
            	System.out.println("Enter the Element: ");
            	numbers = scan.nextInt();
            	dll.insertLast(numbers);
            	break;
            case 3:
            	System.out.println("Enter the Element: ");
            	numbers = scan.nextInt();
            	System.out.println("Enter the Position: ");
            	int position = scan.nextInt();
            	dll.insertAtAnyPosition(position,numbers );
            	break;
            case 4:
            	System.out.println("Enter the Position: ");
            	position = scan.nextInt();
            	dll.removeAtAnyPos(position);
            	break;
            case 5:
            	System.out.print("Doubly Linked List: ");
            	dll.display();
            	break;
            default:
            	System.out.println("Quiting..");
            	break;
            }
		}       	
	}
}
class DoublyLinkedList<T>{
	private LinkedList<T> list = new LinkedList<>();
	public void insertLast(T num) {
		list.addLast(num);
		}
	public void insertFront (T num){
		list.addFirst(num);
		}
	public void insertAtAnyPosition(int index, T num){
		list.add(index, num);
		}
	public void  removeAtAnyPos(int index){
	 list.remove(index);
	 }
	public void display() {
	 for(T num: list) {
		 System.out.print(num +" ");
	 }
	 System.out.println();
	}
}




