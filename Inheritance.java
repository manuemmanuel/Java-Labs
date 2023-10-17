//Write a Java program which creates a class named 'Employee' having the following members: Name, Age, Phone number, Address, Salary. 
//It also has a method named 'printSalaryegg' which prints the salary of the Employee. 
//Two classes 'Officer' and 'Manager' inherits the 'Employee' class. 
//The 'Officer' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
//Now, assign name, age, phone number, address and salary to an officer and a manager by making an object of both of these classes and print the same.
//(Exercise to understand inheritance)
import java.util.Scanner;
public class InheritanceFour {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Officer officer =  new Officer();
		Manager manager = new Manager();
		System.out.println("1. Officer \n2. Manager \nEnter a choice(1/2): ");
		int choice = scan.nextInt();
		if  (choice == 1) {
			officer.input();
			officer.DetailsTwo();
			officer.printSalaryegg();		
			}
		else if (choice == 2) {
			manager.input();
			manager.DetailsTwo();	
			manager.printSalaryegg();
		}
	}
}
class Employee {
	String specialization = new String();
	String department = new String();
	Scanner scan = new Scanner(System.in);
	String Name = new String();
	String Address = new String();
	int Age, Salary;
	long Phonenumber;
	public void printSalaryegg() {
		System.out.println("The salary of the employee is "+ Salary);
	}
}
class Officer extends Employee {
	public void input(){
			System.out.println("Officer");
			System.out.println("Name: ");
			scan.next();
			Name = scan.nextLine();
			System.out.println("Age: ");
			Age = scan.nextInt();
			System.out.println("Phone Number: ");
			Phonenumber = scan.nextLong();
			System.out.println("Address: ");
			scan.next();
			Address = scan.nextLine();
			System.out.println("Salary: ");
			Salary = scan.nextInt();
	}
	public void printSalaryegg() {
		System.out.println();
		System.out.println("Officer Details\n");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Phone Number: "+Phonenumber);
		System.out.println("Address: "+Address);
		System.out.println("Salary: "+Salary);
		System.out.println("Specializtion: "+ specialization+ " Department: "+department);
	}
	public void DetailsTwo(){
		System.out.println("Specialization: ");
		scan.next();
		specialization = scan.nextLine();
		System.out.println("Department: ");
		scan.next();
		department = scan.nextLine();
	}
}
class Manager extends Employee {
	public void input(){
			System.out.println("Manager");
			System.out.println("Name: ");
			scan.next();
			Name = scan.nextLine();
			System.out.println("Age: ");
			Age = scan.nextInt();
			System.out.println("Phone Number: ");
			Phonenumber = scan.nextLong();
			System.out.println("Address: ");
			scan.nextLine();
			Address = scan.nextLine();
			System.out.println("Salary: ");
			Salary = scan.nextInt();
	}
	public void printSalaryegg() {
		System.out.println();
		System.out.println("Manager Details\n");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Phone Number: "+Phonenumber);
		System.out.println("Address: "+Address);
		System.out.println("Salary: "+Salary);
		System.out.println("Specializtion: "+ specialization+ " Department: "+department);
	}
	public void DetailsTwo(){
		System.out.println("Specialization: ");
		scan.next();
		specialization = scan.nextLine();
		System.out.println("Department: ");
		scan.next();
		department = scan.nextLine();
	}
}
