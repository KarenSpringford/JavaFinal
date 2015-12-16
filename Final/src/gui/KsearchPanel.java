package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author KarenSpringford
 * @date December 14, 2015
 * @version 2.0
 */

public class KsearchPanel extends JPanel implements ItemListener {

    //*** Create the Components ***//
    JPanel cards;
    final static String employeePanel = "Employee Search";
    final static String productPanel = "Product Search";
    
    private final JLabel lblFirstName, lblLastName, lblAge, lblPosition,
            lblEmployeeType, lblEmployeeID, lblHireYear, lblCommissionRate,
            lblHourlyPay, lblSalary;
    
        //***  TEXT FIELDS  ***//
    private final JTextField txtFirstName, txtLastName, txtAge,
            txtEmployeeID, txtCommissionRate, txtHourlyPay, txtSalary;
    
        //***  DROP DOWN MENUS   ***//
    private final JComboBox<String> cmbYear, cmbPosition, cmbEmployeeType;

    //***   POPULATE THE DATA IN THE DROP DOWN MENUS   ***//
    private final String[] year = {"2014", "2015", "2016"};
    private final String[] position = {"Sales", "Administration",
        "Shipping", "Management"};
    private final String[] employeeType = {"Hourly Employee", "Salary",
        "Salary+Commission"};
        //*** Constructor ***//


    public  KsearchPanel() {}


    public void innerPane(Container pane){
        //*** Addign the JComboBox in the panel ***//
        JPanel comboBoxPane = new JPanel();
        String comboBoxItems[] = {employeePanel, productPanel };
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.addItemListener(this);
        comboBoxPane.add(cb);
    
        //***  Create the Cards ***//
        JPanel employee = new JPanel();
        employee.add(new JLabel("First Name"));
        employee.add(new JTextField(15));
        employee.add(new JLabel("Last Name"));
        employee.add(new JTextField(15));
        employee.add(new JLabel("Age"));
        employee.add(new JTextField(2));
        employee.add(new JLabel("Position: "));
        employee.add(new JComboBox<String>(position));
        employee.add(new JLabel("Employee Type"));
        employee.add(new JComboBox<String>(employeeType));
        employee.add(new JLabel("Employee ID"));
        employee.add(new JTextField(20));
        employee.add(new JLabel("Hire Year"));
        employee.add(new JComboBox<String>(year));
        employee.add(new JLabel("Commission Rate:"));
        employee.add(new JTextField(15));
        employee.add(new JLabel("Hourly Pay"));
        employee.add(new JTextField(15));
        employee.add(new JLabel("Salary"));
        employee.add(new JTextField(15));
        
        JPanel product = new JPanel();
        product.add(new JLabel("Product"));
        product.add(new JTextField(25));
        product.add(new JLabel("Product ID"));
        product.add(new JTextField(8));
   
    }
}

    




