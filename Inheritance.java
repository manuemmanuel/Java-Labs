//Write a Java program which creates a class named 'Employee' having the following members: Name, Age, Phone number, Address, Salary. 
//It also has a method named 'printSalaryegg' which prints the salary of the Employee. 
//Two classes 'Officer' and 'Manager' inherits the 'Employee' class. 
//The 'Officer' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
//Now, assign name, age, phone number, address and salary to an officer and a manager by making an object of both of these classes and print the same.
//(Exercise to understand inheritance)
import java.util.Scanner;
public class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Officer officer =  new Officer();
		Manager manager = new Manager();
		System.out.println("1. Officer \n2. Manager \nEnter a choice(1/2): ");
		int choice = scan.nextInt();
		if  (choice == 1) {
			System.out.println("Officer");
			System.out.println("Name: ");
			officer.Name = scan.next();
			System.out.println("Age: ");
			officer.Age = scan.nextInt();
			System.out.println("Phone Number: ");
			officer.Phonenumber = scan.nextLong();
			System.out.println("Address: ");
			officer.Address = scan.next();
			System.out.println("Salary: ");
			officer.Salary = scan.nextInt();
			officer.DetailsTwo();
			officer.Details();		
			}
		else if (choice == 2) {
			System.out.println("Manager");
			System.out.println("Name: ");
			manager.Name = scan.next();
			System.out.println("Age: ");
			manager.Age = scan.nextInt();
			System.out.println("Phone Number: ");
			manager.Phonenumber = scan.nextLong();
			System.out.println("Address: ");
			manager.Address = scan.next();
			System.out.println("Salary: ");
			manager.Salary = scan.nextInt();
			manager.DetailsTwo();	
			manager.Details();
		}
	}

}
class Employee {
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
	String specialization = new String();
	String department = new String();
	public void Details() {
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
		specialization = scan.next();
		System.out.println("Department: ");
		department = scan.next();
	}
}
class Manager extends Employee {
	String specialization = new String();
	String department = new String();
	public void Details() {
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
		specialization = scan.next();
		System.out.println("Department: ");
		department = scan.next();
	}
}