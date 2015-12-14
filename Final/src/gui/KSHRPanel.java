
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Karen Springford
 * @date November 25, 2015
 */

public class KSHRPanel extends JPanel
{
    //***   CREATE THE COMPONENTS   ***//
    //***  LABELS  ***//
    private final JLabel lblFirstName, lblLastName, lblAge, lblSIN, lblPosition,
            lblEmployeeType, lblEmail, lblEmployeeID, lblHireYear, lblHireMonth, 
            DateOfHireJLabel, lblCommissionRate,lblHourlyPay, lblSalary;
    
    //***  TEXT FIELDS  ***//
    private final JTextField txtFirstName, txtLastName, txtAge,  txtSIN, txtEmail, 
            txtEmployeeID, txtCommissionRate, txtHourlyPay, txtSalary;
    
    //***  RADIO BUTTONS  ***//
    private ButtonGroup bg;
    private final JRadioButton rdbGenderMale, rdbGenderFemale;
    
    //***  DROP DOWN MENUS   ***//
    private final JComboBox<String> cmbYear, cmbMonth, cmbDay, cmbPosition,
            cmbEmployeeType;
    
    //***   POPULATE THE DATA IN THE DROP DOWN MENUS   ***//
    private final String[] year = {"2014", "2015", "2016"};
    private final String [] month = {"January","February","March","April", 
        "May","June","July","August","September","October","November","December"};
    private final String [] day = {"1","2","3","4","5","6","7","8","9","10","11","12",
        "13","14","15","16","17","18","19","20","21","22","23","24","25","26","27",
    "28","29","30","31"};
    private final String [] position ={"Sales","Administration", 
        "Shipping","Management"};
    private final String [] employeeType = {"Hourly Employee", "Salary",
        "Salary+Commission"};
    
    public KSHRPanel()
    { 
        //***  SET THE LAYOUT   ***//
        setLayout(new GridLayout(20,20));
        
        lblFirstName = new JLabel("First Name");
        lblLastName = new JLabel("Last Name");
        lblAge = new JLabel("Age");
        lblSIN = new JLabel("Social Insurance Number");
        lblPosition = new JLabel("Position: ");
        lblEmployeeType = new JLabel("Employee Type");
        lblEmail = new JLabel("Email");
        lblEmployeeID = new JLabel("Employee ID");
        lblHireYear = new JLabel("Hire Year");
        lblHireMonth = new JLabel("Hire Month");
        DateOfHireJLabel = new JLabel("Hire Day");
        lblCommissionRate = new JLabel("Commission Rate:");
        lblHourlyPay = new JLabel("Hourly Pay");
        lblSalary = new JLabel("Salary");
        
        //***   INITIALIZE THE TEXT FIELDS   ***//
        txtFirstName = new JTextField(15);
        txtLastName = new JTextField(15);
        txtAge = new JTextField(2);
        txtSIN = new JTextField(9);
        txtEmail = new JTextField(15);
        txtEmployeeID = new JTextField(20);
        txtCommissionRate = new JTextField(15);
        txtHourlyPay = new JTextField(15);
        txtSalary = new JTextField(15);
        
        //***   RADIO BUTTONS   ***///
        rdbGenderMale = new JRadioButton("Male");
        rdbGenderFemale = new JRadioButton("Female");
        bg = new ButtonGroup();
        bg.add(rdbGenderMale);
        bg.add(rdbGenderFemale);
        
        //***   COMBO BOX / DROP DOWN   ***//
        cmbYear = new JComboBox<String>(year);
        cmbMonth = new JComboBox<String>(month);
        cmbDay = new JComboBox<String>(day);
        cmbPosition = new JComboBox<String>(position);
        cmbEmployeeType = new JComboBox<String>(employeeType);
        
        //*** Set the Border ***//
        setBorder(BorderFactory.createEtchedBorder(Color.lightGray, Color.pink));

        
        add(lblFirstName);
        add(txtFirstName);
        add(lblLastName);
        add(txtLastName);
        add(lblAge);
        add(txtAge);
        add(lblSIN);
        add(txtSIN);
        add(lblEmail);
        add(txtEmail);
        add(rdbGenderMale);
        add(rdbGenderFemale);
        add(lblEmployeeID);
        add(txtEmployeeID);
        add(lblHireYear);
        add(cmbYear);
        add(lblHireMonth);
        add(cmbMonth);
        add(DateOfHireJLabel);
        add(cmbDay);
        add(lblPosition);
        add(cmbPosition);
        add(lblEmployeeType);
        add(cmbEmployeeType);
        add(lblCommissionRate);
        add(txtCommissionRate);
        add(lblHourlyPay);
        add(txtHourlyPay);
        add(lblSalary);
        add(txtSalary);
        
    }
    
}//end of the CLASS
