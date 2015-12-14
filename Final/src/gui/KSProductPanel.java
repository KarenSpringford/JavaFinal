
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Karen Springford
 * @date Dec 7, 2015
 */
public class KSProductPanel extends JPanel
{

    //***CREATE THE COMPONENTS***//
    //***LABELS***//
    private final JLabel lblProductName, lblProductDescription, lblQuantity, lblMinQuantity,
                lblProductID, lblPrice, lblProductCost, lblReOrder, lblProductAvailable, lblBuiltBy;
                
    
    //***TEXT FIELDS***//
    private final JTextField txtProductName, txtProductDescription, txtQuantity, txtMinQuantity,
                txtProductID, txtPrice, txtProductCost, txtBuiltBy;
                
    
    //***DROP DOWNS***//
    private final JComboBox<String> cmbReOrder, cmbProductAvailable;
    
    //***POPULATE THE DROP DOWNS***//
    private final String [] reOrder = {"Yes", "No"};
    private final String [] productAvailable = {"Yes", "No"};

    
    
    public KSProductPanel()
    {
         //***  SET THE LAYOUT   ***//
        setLayout(new GridLayout(20,20));
        
        lblProductName = new JLabel("Product Name"); 
        lblProductDescription = new JLabel ("Product Description");
        lblQuantity = new JLabel ("Quantity in Stock");
        lblMinQuantity = new JLabel ("Minimum Quantity");
        lblProductID = new JLabel ("Product ID");
        lblPrice = new JLabel ("Price for Sale");
        lblProductCost = new JLabel ("Store Purchase Price");
        lblReOrder = new JLabel ("Product Needs to be ReOrdered?");
        lblProductAvailable = new JLabel("Product Available: ");
        lblBuiltBy = new JLabel ("Manufacturer");
        
        //***INITIALIZE THE TEXT FIELDS***//
        txtProductName = new JTextField(25);
        txtProductDescription = new JTextField(30); 
        txtQuantity = new JTextField(15); 
        txtMinQuantity = new JTextField(15);
        txtProductID = new JTextField(8);
        txtPrice = new JTextField(8); 
        txtProductCost = new JTextField(8); 
        txtBuiltBy = new JTextField(25);
        
        //***COMBO BOX / DROP DOWN***//
        cmbReOrder = new JComboBox<String>(reOrder);
        cmbProductAvailable = new JComboBox<String>(productAvailable);
        
        //*** Set the Border ***//
        setBorder(BorderFactory.createEtchedBorder(Color.lightGray, Color.pink));
        
        add(lblProductName); 
        add(txtProductName);
        add(lblProductDescription); 
        add(txtProductDescription);
        add(lblQuantity);
        add(txtQuantity);
        add(lblMinQuantity);
        add(txtMinQuantity);
        add(lblProductID); 
        add(txtProductID);
        add(lblPrice); 
        add(txtPrice);
        add(lblProductCost); 
        add(txtProductCost); 
        add(lblReOrder); 
        add(cmbReOrder); 
        add(lblProductAvailable); 
        add(cmbProductAvailable);
        add(lblBuiltBy);
        add(txtBuiltBy);
              
    }
}
