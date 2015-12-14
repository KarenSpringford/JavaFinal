package HR;

import java.util.*;
import ap.*;

/**
 *
 * @author Karen Springford
 * @date 09/23/15 - 10/06/15
 * @version 1.4
 */
public abstract class Employee implements Payable {

    //properties
    private String firstName, lastName, position, phoneNo, email;
    private int age, SIN, employeeID;
    private double taxRate;
    private Date dateOfHire;

    //default constructor
    public Employee() {
    }

    //constructor
    public Employee(String firstName, String lastName, String position, String phoneNo, String email,
            int age, int SIN, int employeeID, int year, int month, int day) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.phoneNo = phoneNo;
        this.email = email;
        this.age = age;
        this.SIN = SIN;
        this.employeeID = employeeID;

        //get the time variable
        this.dateOfHire = new GregorianCalendar(year, month - 1, day).getTime();
        System.out.println(dateOfHire);

        //call the static method of employeeID to get /assign a new ID
        this.employeeID = HRhelper.getEmployeeID();

    }

    //The following are the setter methods//
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //phone number must be 10 characters
    public void setPhoneNo(String phoneNo) {
        if (phoneNo.length() == 10) {
            this.phoneNo = phoneNo;
//            System.out.println("Phone # Accepted");
            return;
        }
        System.out.println("Not a valid Phone #");
    }

    //set the email condition @
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
//            System.out.println("Acceptable email");
            return;
        }
        System.out.println("Invalid Email Address");
    }

    public void setAge(int age) {
        this.age = age;
    }

    //set the string to 9 characters
    public void setSIN(int SIN) {
        if (SIN > 99999999 && SIN < 1000000000) {
            this.SIN = SIN;
//            System.out.println("Acceptable SIN");
            return;
        }
        System.out.println("Unacceptable input for a SIN");
    }

    public void setEmployeeID() {
        this.employeeID = HRhelper.getEmployeeID();
    }

    //The following are the get methods//
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getPosition() {
        return this.position;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public String getEmail() {
        return this.email;
    }

    public int getAge() {
        return this.age;
    }

    public int getSIN() {
        return this.SIN;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public Date getDateOfHire() {
        return dateOfHire;
    }

    public String getEmployeeInfo() {
        return toString();
    }

    @Override
    public String toString() {
        String employeeInfo = "";

        employeeInfo += "\nName:\t\t" + getFullName();
        employeeInfo += "\nEmployee ID:\t\t" + getEmployeeID();
        employeeInfo += "\nPosition:\t\t" + getPosition();
        employeeInfo += "\nDate of Hire:\t\t" + getDateOfHire();
        employeeInfo += "\nAge:\t\t" + getAge();

        return employeeInfo;
    }
}
