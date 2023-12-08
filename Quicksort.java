import java.util.Scanner;
public class Quicksort {
    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(String[] arr, int start, int end) {
        String pivotElement = arr[start]; 
        int i = start;
        for (int j = start + 1; j <= end; j++) {
            if (arr[j].compareTo(pivotElement) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, start, i); 
        return i;
    }
    public static void quickSort(String[] arr, int start, int end) {
        if (start < end) {
            int pivotElement = partition(arr, start, end);
            quickSort(arr, start, pivotElement - 1);
            quickSort(arr, pivotElement + 1, end);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int limit = scan.nextInt();
        scan.nextLine(); 
        String[] array = new String[limit];
        System.out.println("Enter the elements:");
        for (int i = 0; i < limit; i++) {
            array[i] = scan.nextLine();
        }
        quickSort(array, 0, limit - 1);
        System.out.print("Sorted array: ");
        for (int i = 0; i < limit; i++) {
            System.out.print(array[i]+"  ");
        }
    }
}
