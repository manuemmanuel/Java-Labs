import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {
	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("/home/csea2/Manu/Lab/JavaLab/result.txt");
			String data = new String();
			data = "Hello";
			fr.write(data);
			fr.close();
			System.out.println("The file is written successfully");
		} catch (IOException e) {
			System.out.println("An IO Exception has occured.");
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader("/home/csea2/Manu/Lab/JavaLab/result.txt");
			char [] filedata = new char [50];
			fr.read(filedata);
			System.out.println("The file contains: ");
			System.out.println(filedata);
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
