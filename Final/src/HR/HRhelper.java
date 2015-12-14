package HR;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karen Springford
 * @date 10/08/15 version 1.5
 */
public class HRhelper {

    private static Scanner keyboard = new Scanner(System.in);
    private static int employeeID = 100;

    //enables the ability to be called
    public static int getEmployeeID() {
        return employeeID++;
    }

    public static void personalEmployeeInfo(ArrayList<Employee> emp, int e) {
        boolean testAnswer = false;
        do {
            System.out.print("Enter the Employee's first name: ");
            emp.get(e).setFirstName(keyboard.nextLine());
        } while (emp.get(e).getFirstName().isEmpty());
        do {
            System.out.print("Enter the Employee's last name: ");
            emp.get(e).setLastName(keyboard.nextLine());
        }while (emp.get(e).getLastName().isEmpty());
        do{
            System.out.print("Enter the Employee's Position: ");
            emp.get(e).setPosition(keyboard.nextLine());
        }while (emp.get(e).getPosition().isEmpty());
        do{
        System.out.print("Enter Employee's phone number: ");
        emp.get(e).setPhoneNo(keyboard.nextLine());
        }while (emp.get(e).getPhoneNo().isEmpty());
        do {
            System.out.print("Enter an Email Address: ");
            emp.get(e).setEmail(keyboard.nextLine());
        } while (emp.get(e).getEmail().isEmpty());
        do{
           try{
               System.out.print("Please enter the age: ");
                emp.get(e).setAge(Integer.parseInt(keyboard.nextLine()));
                testAnswer = true;
            } catch (Exception f) {
                System.out.println("Not an acceptable age");
            }
        } while (!testAnswer);
        testAnswer = false;
        do{
            try{
                System.out.print("Please enter their SIN #: ");
                emp.get(e).setSIN(Integer.parseInt(keyboard.nextLine()));
                testAnswer = true;     
            } catch (Exception g){
                System.out.println("Not an acceptable SIN");     
            }
        }while (!testAnswer);
    }
        public static Employee findEmployeeID(ArrayList<Employee> emp) {
        int theEmployeeID;
        try {
            System.out.println("Please enter the employee ID you are searching: ");
            theEmployeeID = keyboard.nextInt();
            for (Employee e : emp) {
                System.out.println(e.getEmployeeID());
                if (e.getEmployeeID() == theEmployeeID) {
                    System.out.println(e.toString());  
                    return e; 
                }   
            } System.out.println("There is no such employee ID in use");
        } catch (Exception g) {
        }
        return null;
    }

}
