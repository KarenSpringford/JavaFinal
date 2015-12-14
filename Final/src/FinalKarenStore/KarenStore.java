package FinalKarenStore;

import HR.*;
import java.util.ArrayList;
import java.util.Scanner;
import products.*;

/**
 *
 * @author Karen Springford
 * @date September 29, 2015
 * @version 1.0
 */
public class KarenStore {

    public KarenStore() {
    }

    //specifically made for testing
    public KarenStore(ArrayList<Product> prod, ArrayList<Employee> emp) {
        this.prod = prod;
        this.emp = emp;
        main(null);
    }

    private static Scanner read = new Scanner(System.in);
    private static ArrayList<Product> prod = new ArrayList<>();
    private static ArrayList<Employee> emp = new ArrayList<>();
    private static int input;
    private static boolean keepGoing = true;

    public static void main(String[] args) {
        while (keepGoing) {
            mainMenu();
        }
    }

    private static void mainMenu() {
        getInitialMessage();
        try {
            input = Integer.parseInt(read.nextLine());
        } catch (Exception e) {
            input = -1;
        }
        //if input is 1, run the product block
        if (input == 0) {//Exit block
            keepGoing = false;
        } else if (input == 1) {
            productMenu();
        } else if (input == 2) {//if input is 2, run the HR block
            hrMenu();
        } else {//default block if input is invalid
            System.out.println("Please enter a valid input value!");
        }
    }

    public static void hrMenu() {

        //display the HR message
        getHRMessage();
        //read the user input
        input = Integer.parseInt(read.nextLine());
        //selection statement to determine what to do
        if (input == 0) {
        } else if (input == 1) {
            HRhelper.findEmployeeID(emp);
        } else if (input == 2) {
            newEmployeeTypeMenu();
            input = Integer.parseInt(read.nextLine());
            if (input == 0) {
            } else if (input == 1) {
                emp.add(new HourlyEmployee());
                HRhelper.personalEmployeeInfo(emp, input);
            } else if (input == 2) {
                emp.add(new SalaryEmployee());
                HRhelper.personalEmployeeInfo(emp, input);
            } else if (input == 3) {
                emp.add(new SalaryPlusCommissionEmployee());
                HRhelper.personalEmployeeInfo(emp, input);
            } else {
                System.out.println("Invalid input! Please try again");
            }
        }
    }

    public static void productMenu() {
        boolean prodBool = true;
        //inner product loop that will work with the
        //product block. Runs until the user ends it.
        while (prodBool) {
            //display the product message
            getProductMessage();
            //read the user input
            input = Integer.parseInt(read.nextLine());

            //selection statement to determine what to do
            if (input == 0) {
                prodBool = false;
            } else if (input == 1) {
                //add search function from the ProductHelper.java
                ProductHelper.findProduct(prod);
            } else if (input == 2) {
                //calling to the add product method in the product helper class
                ProductHelper.addProduct(prod);
                //calling to the complete method if the product helper class
                ProductHelper.completeProduct(prod, prod.size() - 1);
            } else if (input == 3) {
                System.out.println("Display Product list and details:");
                for (Product p : prod) {
                    System.out.println(prod.get(prod.indexOf(p)).toString() + "\n");
                }
            } else {
                System.out.println("Invalid input! Please try again");
            }
        }
    }

    //static initial message method
    public static void getInitialMessage() {
        System.out.println("Welcome to KarenStore!");
        System.out.println("Please enter a choice to proceed:");
        System.out.println("1: Products");
        System.out.println("2: HR");
        System.out.println("0: EXIT");
    }

    //static product message method
    public static void getProductMessage() {
        System.out.println("<-----Product Menu----->");
        System.out.println("1: Search products");
        System.out.println("2: Enter new product");
        System.out.println("3: Product List");
        System.out.println("0: EXIT");
    }

    //static HR message method
    public static void getHRMessage() {
        System.out.println("<-----Human Resources Menu----->");
        System.out.println("1: Search Employees");
        System.out.println("2: Enter new employee");
        System.out.println("0: EXIT");
    }

    //static newEmployee message method
    public static void newEmployeeTypeMenu() {
        System.out.println("<-----Employment Options----->");
        System.out.println("1. Hourly");
        System.out.println("2. Salary");
        System.out.println("3. Salary plus Commission");
        System.out.println("0. To EXIT");
    }
}
