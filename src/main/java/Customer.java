
import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {

        Scanner customerInput = new Scanner(System.in);
        //Gather details of first customer
        System.out.println("Please enter the customers unique ID");
        String studentId = customerInput.nextLine();

        System.out.println("Please enter the customers name");
        String studentName = customerInput.nextLine();

        System.out.println("Please enter the customers email address");
        String studentEmail = customerInput.nextLine();

        System.out.println("Please enter the customers phone number");
        String studentNumber = customerInput.nextLine();

        Customer firstCustomer = new Customer();
        firstCustomer.setIdCustomer(customerId);
        firstCustomer.setNameCustomer(customerName);
        firstCustomer.setEmailCustomer(customerEmail);
        firstCustomer.setNumberCustomer(customerNumber);

        //Gather details of first customer
        System.out.println("Please enter the  second customers unique ID");
        studentId = customerInput.nextLine();

        System.out.println("Please enter the second customers name");
        studentName = customerInput.nextLine();

        System.out.println("Please enter the second customers email address");
        studentEmail = customerInput.nextLine();

        System.out.println("Please enter the second customers phone number");
        studentNumber = customerInput.nextLine();

        Customer secondCustomer = new Customer(CustomerId);
        secondCustomer.setNameCustomer(customerName);
        secondCustomer.setEmailCustomer(customerEmail);
        secondCustomer.setNumberCustomer(customerNumber);

    }
}

