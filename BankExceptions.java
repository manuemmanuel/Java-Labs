// create a mini-application for a banking system in Java. In this program, we will add some basic functionalities of a bank account like a deposit of amount, withdrawal of amount, etc.Initially, the program accepts the number of customers (Array of Objects)we need to add and adds the customer and account details accordingly. Further, it displays the series of menus to operate over the accounts.
//
//1.Display all account details
//
//2.Search by account number
//
//3.Deposit the amount
//
//4.Withdraw the amount
//
//5.Exit 
//
//Create Custom Exception and perform the following action:
//
//Customers are not allowed to deposit amount <= 0 ( In this case throw InvalidAmountException).
//
//Customers are not allowed to withdraw amount <= 0 (throw InvalidAmountException).
//
//Customers are also not allowed to withdraw an amount greater than (>)
//
//the available amount (throw InsufficientFundsException)
//	
//bank-cust-op.docx bank-cust-op.docx
//6 January 2022, 11:06 AM
import java.util.Scanner;
public class BankException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many number of customers do you want to input?: ");
		int numCustomers = scan.nextInt();
		Customer customer = new Customer();
		customer.setCustomerDetails();
		
	}

}
class  Customer {
	Scanner scan = new Scanner(System.in);
	int accountNumber, balance;
	String accountType,customerName;
	public void setCustomerDetails() {
		System.out.println("Enter the Account Number: ");
		accountNumber = scan.nextInt();
		System.out.println("Enter the Account Type: ");
		accountType = scan.next();
		System.out.println("Enter the customer name: ");
		customerName = scan.next();
	}
	public void getCustomerDetails() {
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Type: "+ accountType);
		System.out.println("Customer Name: "+ customerName);
	}
}
