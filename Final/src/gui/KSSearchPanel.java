
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

        //***   INITIALIZE THE TEXT FIELDS   ***//
        txtFirstName = new JTextField(15);
        txtLastName = new JTextField(15);
        txtAge = new JTextField(2);
        txtEmployeeID = new JTextField(20);
        txtCommissionRate = new JTextField(15);
        txtHourlyPay = new JTextField(15);
        txtSalary = new JTextField(15);

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

        //*****NO CLUE WHERE TO PUT THE LISTENER TO MAKE IT WORK???*****//
        
        
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

        hidestuff(btnSearchEmployee.isSelected());

    }

    private class BtnSearchEmployeeHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if(btnSearchEmployee.isSelected()){
            hidestuff(true);
            }
        }
    }
    //  ***  card layout within the tab *** //
    
//    
//        private class AddButtonHandler implements ActionListener
//    {
//        @Override
//        public void actionPerformed(ActionEvent event)
//        {
//            JOptionPane.showMessageDialog(null, "You pressed the add button!");
//        }
//    }

    public void hidestuff(boolean check) {
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
}




