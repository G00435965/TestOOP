
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
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

        //Gather details of second customer
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

        //Gather details of third customer
        System.out.println("Please enter the  third customers unique ID");
        studentId = customerInput.nextLine();

        System.out.println("Please enter the third customers name");
        studentName = customerInput.nextLine();

        System.out.println("Please enter the third customers email address");
        studentEmail = customerInput.nextLine();

        System.out.println("Please enter the third customers phone number");
        studentNumber = customerInput.nextLine();

        Customer thirdCustomer = new Customer(customerId, cutomerName, customerEmail, customerNumber);

    }
    //Creating an ArrayList
    ArrayList<String> customerArrayList = new ArrayList<>(Arrays.asList("ID","Name","Email", "Phone Number"));
    ArrayList<String> customerArrayList2 = new ArrayList<>(Arrays.asList("1234","John","John@atu.ie", "089 111 1111"));
    //
    ArrayList<String> customerArrayList3 = new ArrayList<>(Arrays.asList("5678","Chris","Chris@atu.ie", "088 111 1111"));
    //
    ArrayList<String> customerArrayList4 = new ArrayList<>(Arrays.asList("9101","Eric","Eric@atu.ie", "087 111 1111"));
    //
    ArrayList<String> customerArrayList5 = new ArrayList<>(Arrays.asList("1213","Luke","Luke@atu.ie"));
    //
    //Get element
    System.out.println(friendsArrayList.get(3))
            //add
            customersArrayList5.add("186 111 1111");

    //updating details
    customersArrayList2.set(1,"Jack");
}


