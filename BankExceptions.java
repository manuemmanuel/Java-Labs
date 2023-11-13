import java.util.Scanner;
public class Bankapp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Account Number: ");
        int noOfCustomers = scan.nextInt();

        Customer [] customer = new Customer[noOfCustomers];
        for (int i = 0; i < noOfCustomers; i++){
            customer[i] = new Customer();
            customer[i].setCustomerDetails();
        }
        for (int i = 0; i < noOfCustomers; i++){
            customer[i].getCustomerDetails();
        }
        int choice;
        do {
            System.out.println("1. Display Account Details: ");
            System.out.println("2. Search by Account Number: ");
            System.out.println("3. Deposit the amount: ");
            System.out.println("4. Withdraw the amount: ");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            switch (choice){
                case 1 :
                    for (int i = 0; i < noOfCustomers; i++) {
                        customer[i].getCustomerDetails();;
                    }
                    break;
                default:
                System.out.println("Invalid Choice!");
            }
               
        }while(choice < 5);
        
    }
}
class Customer {
    int accountNum;
    String accountType;
    String customerName;
    int accountBalance;
    Scanner scan = new Scanner(System.in);
    public void setCustomerDetails(){
        System.out.println("Enter the Account Number: ");
        accountNum = scan.nextInt();
        System.out.println("Enter the Account Type: ");
        accountType = scan.next();
        System.out.println("Enter the Customer Name: ");
        customerName = scan.next();
        System.out.println("Enter the Account opening balance: ");
        accountBalance = scan.nextInt();
    }
    public void getCustomerDetails(){
        System.out.println("The Customer Details are: ");
        System.out.println("Account Number: "+accountNum);
        System.out.println("Account Type: "+accountType);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Account Balance: "+accountBalance);
    }
}
