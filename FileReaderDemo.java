import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileReaderDemo {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/home/csea2/Manu/Lab/JavaLab/output.txt");
			char [] data = new char [50];
			fr.read(data);
			System.out.println(data);
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("The File does not exist");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("An IO Exception has occured.");
			e.printStackTrace();
		} 
	}
}
