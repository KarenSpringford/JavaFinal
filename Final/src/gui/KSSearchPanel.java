
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Karen Springford
 * @date December 9, 2015
 */
public class KSSearchPanel extends JPanel{

    
    //*** Create the Components ***//
    private final JLabel lblFirstName, lblLastName, lblAge, lblPosition,
            lblEmployeeType, lblEmployeeID, lblHireYear, lblCommissionRate,
            lblHourlyPay, lblSalary, lblProductName, lblProductID,lblProductPrice, 
            lblManufacturer;

    //***  TEXT FIELDS  ***//
    private final JTextField txtFirstName, txtLastName, txtAge,
            txtEmployeeID, txtCommissionRate, txtHourlyPay, txtSalary,
            txtProductName, txtProductID,txtProductPrice, 
            txtManufacturer;

    //***  DROP DOWN MENUS   ***//
    private final JComboBox<String> cmbYear, cmbPosition, cmbEmployeeType;

    //***   POPULATE THE DATA IN THE DROP DOWN MENUS   ***//
    private final String[] year = {"2014", "2015", "2016"};
    private final String[] position = {"Sales", "Administration",
        "Shipping", "Management"};
    private final String[] employeeType = {"Hourly Employee", "Salary",
        "Salary+Commission"};

    //*** Button ***//
    private ButtonGroup bg;
    //*** Radio Buttons ***//
    private JRadioButton btnSearchEmployee, btnSearchProduct;

    //*** Constructor ***//
    public KSSearchPanel() {

        //*** Set the Layout ***//
        setLayout(new GridLayout(20, 20));

        //*** Set the Border ***//
        setBorder(BorderFactory.createEtchedBorder(Color.lightGray, Color.pink));

        lblFirstName = new JLabel("First Name");
        lblLastName = new JLabel("Last Name");
        lblAge = new JLabel("Age");
        lblPosition = new JLabel("Position: ");
        lblEmployeeType = new JLabel("Employee Type");
        lblEmployeeID = new JLabel("Employee ID");
        lblHireYear = new JLabel("Hire Year");
        lblCommissionRate = new JLabel("Commission Rate:");
        lblHourlyPay = new JLabel("Hourly Pay");
        lblSalary = new JLabel("Salary");
        //*** Product Labels ***//
        lblProductName = new JLabel("Product Name");
        lblProductID = new JLabel("Product ID");
        lblProductPrice = new JLabel("Product Sale Price");
        lblManufacturer = new JLabel("Manufacturer");
        
        

        //***   INITIALIZE THE TEXT FIELDS   ***//
        txtFirstName = new JTextField(15);
        txtLastName = new JTextField(15);
        txtAge = new JTextField(2);
        txtEmployeeID = new JTextField(20);
        txtCommissionRate = new JTextField(15);
        txtHourlyPay = new JTextField(15);
        txtSalary = new JTextField(15);
                //*** Product Texts ***//
        txtProductName = new JTextField(20);
        txtProductID = new JTextField(15);
        txtProductPrice = new JTextField(10);
        txtManufacturer = new JTextField(20);

        //***   COMBO BOX / DROP DOWN   ***//
        cmbYear = new JComboBox<String>(year);
        cmbPosition = new JComboBox<String>(position);
        cmbEmployeeType = new JComboBox<String>(employeeType);

        //*** Radio Buttons ***//
        btnSearchEmployee = new JRadioButton("Search Employee");
        btnSearchProduct = new JRadioButton("Search Products");
        bg = new ButtonGroup();
        bg.add(btnSearchEmployee);
        bg.add(btnSearchProduct);
        btnSearchEmployee.addActionListener(new BtnSearchEmployeeHandler());
        btnSearchProduct.addActionListener(new BtnSearchProductHandler());

        
        
        add(btnSearchEmployee);
        add(btnSearchProduct);

        add(lblFirstName);
        add(txtFirstName);
        add(lblLastName);
        add(txtLastName);
        add(lblAge);
        add(txtAge);
        add(lblEmployeeID);
        add(txtEmployeeID);
        add(lblHireYear);
        add(cmbYear);
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
        
        //*** Product Fields ***//
        add(lblProductName);
        add(txtProductName);
        add(lblProductID);
        add(txtProductID);
        add(lblProductPrice);
        add(txtProductPrice);
        add(lblManufacturer);
        add(txtManufacturer);

        hideEmployee(btnSearchEmployee.isSelected());
        hideProduct(btnSearchProduct.isSelected());

    }

    private class BtnSearchEmployeeHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if(btnSearchEmployee.isSelected()){
            hideEmployee(true);
            hideProduct(false);
            }
        }
    }
    
        private class BtnSearchProductHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if(btnSearchProduct.isSelected()){
            hideEmployee(false);
            hideProduct(true);
            }
        }
    }


    public void hideEmployee(boolean check) {
        lblFirstName.setVisible(check);
        txtFirstName.setVisible(check);
        lblLastName.setVisible(check);
        txtLastName.setVisible(check);
        lblAge.setVisible(check);
        txtAge.setVisible(check);
        lblEmployeeID.setVisible(check);
        txtEmployeeID.setVisible(check);
        lblHireYear.setVisible(check);
        cmbYear.setVisible(check);
        lblPosition.setVisible(check);
        cmbPosition.setVisible(check);
        lblEmployeeType.setVisible(check);
        cmbEmployeeType.setVisible(check);
        lblCommissionRate.setVisible(check);
        txtCommissionRate.setVisible(check);
        lblHourlyPay.setVisible(check);
        txtHourlyPay.setVisible(check);
        lblSalary.setVisible(check);
        txtSalary.setVisible(check);


    }
    
    private void hideProduct(boolean check){

        lblProductName.setVisible(check);
        txtProductName.setVisible(check);
        lblProductID.setVisible(check);
        txtProductID.setVisible(check);
        lblProductPrice.setVisible(check);
        txtProductPrice.setVisible(check);
        lblManufacturer.setVisible(check);
        txtManufacturer.setVisible(check);
    }
}



