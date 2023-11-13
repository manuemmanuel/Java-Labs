import java.util.Scanner;
public class Bankapp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the No. of Customers: ");
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
                case 2:
                    System.out.print("Enter account number to search: ");
                    int accNo = scan.nextInt();
                    boolean found = false;
                    for (int i = 0; i < noOfCustomers; i++) {
                        if (accNo == customer[i].accountNum){
                            customer[i].getCustomerDetails();
                            found = true;
                            break;
                        }
                        }
                    break;
                case 3:
                System.out.print("Enter account number and deposit amount: ");
                    int accN = scan.nextInt();
                    System.out.println("Enter the deposit amount: ");
                    double amtD = scan.nextDouble();
                    if (amtD < 0){
                        System.out.println("Invalid Input");
                    }
                    boolean founDe = false;
                    for (int i = 0; i < noOfCustomers; i++) {
                        if (accN == customer[i].accountNum) {
                            customer[i].depositeAmount(amtD);
                            founDe = true;
                            break;
                            }
                    }
                    if (!founDe) {
                        System.out.println("Account not found!");
                    } 
                    else {
                        System.out.println("Deposited successfully.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number and withdrawal amount: ");
                    int accW = scan.nextInt();
                    System.out.println("Enter the withdrawal amount: ");
                    double amtW = scan.nextDouble();
                    if (amtW > 9999 || amtW < -9999){
                        System.out.println("Invalid input");
                    }
                    boolean founWithdraw = false;
                    for (int i = 0; i < noOfCustomers; i++) {
                        if (accW == customer[i].accountNum) {
                            customer[i].withDrawlAmount(amtW);
                            founWithdraw = true;
                            break;
                            }
                    }
                    if (!founWithdraw) {
                        System.out.println("Account not found!");
                    } 
                    else {
                        System.out.println("Withdrawn successfully.");
                    }
                    break;
                default:
                System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
            } while (choice != 5);
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
    public void withDrawlAmount(double amtW) {
        accountBalance -= amtW;
    }
    public void depositeAmount(double amtD) {
        accountBalance += amtD;
    }
    public boolean searchAccountNumber(String accNo) {
        return this.accountNum == Integer.parseInt(accNo);
    }
    public void getCustomerDetails(){
        System.out.println("The Customer Details are: ");
        System.out.println("Account Number: "+accountNum);
        System.out.println("Account Type: "+accountType);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Account Balance: "+accountBalance);
    }
}
