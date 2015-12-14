
package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


/**
 *
 * @author Karen
 */
public class KarenStoreGui extends JFrame
{
    private JPanel centerPanel, northPanel, southPanel;
    private JButton exitButton, addButton;
    
    public KarenStoreGui()
    {
        super("KarenStore");
        setLayout(new BorderLayout());
        
        //***   CREATE THE TAB CONTAINER   ***//
        JTabbedPane tabPane = new JTabbedPane();
        
        //***  TAB 1  ***//
        JLabel lblPanelOne = new JLabel(" ", SwingConstants.CENTER);
        JPanel hrPanel = new KSHRPanel();
        hrPanel.add(lblPanelOne);
        tabPane.addTab("Human Resources",null, hrPanel, "First Panel");
        
        //***  TAB 2  ***//
        JLabel lblPanelTwo = new JLabel(" ", SwingConstants.CENTER);
        JPanel productPanel = new KSProductPanel();
        productPanel.add(lblPanelTwo);
        tabPane.addTab("Products Information", null, productPanel, "First Panel");
        
        //***  TAB 3  ***//
        JLabel lblPanelThree = new JLabel (" ", SwingConstants.CENTER);
        JPanel searchPanel = new KSSearchPanel();
        searchPanel.add(lblPanelThree);
        tabPane.addTab("Search", null, searchPanel, "First Panel");
        
        //***  BUILD THE PANELS   ***//
        northPanel = new KSGreetingPanel();
        buildButtonPanel();
        
        add(northPanel, BorderLayout.NORTH);
        add(tabPane, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
        
      
    } // end of constructor
    
    //***   CREAT A METHOD TO BUILD THE BUTTONS   ***//
    private void buildButtonPanel()
    {
        southPanel = new JPanel();
        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ExitButtonHandler());
        
        southPanel = new JPanel();
        addButton = new JButton("Add");
        addButton.addActionListener((ActionListener) new AddButtonHandler());
      
        southPanel.add(exitButton);
        southPanel.add(addButton);
     
    }//end of buildButtonPanel
    
    private class ExitButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            //***EXITS***//
            System.exit(0);
        }//end of actionPerformed
    }//end of BuildButtonHandler

    private class AddButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(null, "You pressed the add button!");
        }
    }
    
    //***   MAIN METHOD   ***//
    public static void main(String[]args) throws SQLException
    {
        //*** Declare/Set up the URL to the database
        final String DB_URL = "jdbc:mysql://sql.computerstudi.es:3306/gc200299681";
        
        //*** Declare the Query / Set it up to pull ***//
        final String QRY = "Select * from employees";
        
        //*** declare the connection, statement and result set ***//
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        
        try
        {
            //*** open the connection ***//
            conn = DriverManager.getConnection(DB_URL, "gc200299681","3VNBh2r4");
            stat = conn.createStatement();
            rs = stat.executeQuery(QRY);
            
        //***  gets the information regarding the data coming form sql ***//
        ResultSetMetaData metaData = rs.getMetaData();
        int numOfCols = metaData.getColumnCount();
        
        //***  NEED TO FIGURE OUT HOW TO IMPORT THE INFORMATION INTO THE KSSEARCHPANEL UPON REQUEST ***//

            
        }
        catch(SQLException error){
            error.printStackTrace();
        }
        catch(Exception error){
            error.printStackTrace();
        }
        finally{
            //*** close the connection ***//
            rs.close();
            stat.close();
            conn.close();
        }

        KarenStoreGui gui = new KarenStoreGui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.pack();
        gui.setVisible(true);

        
    }//end of the main
    
}//end of the class





/////  ****  put the try statement in the search with an IF/ELSE surrounding it
//           for products or employees
//  **********  Or make a Search() method and then call it when search button 
//  **********  is pressed with an if/else calling the search method!

//        try
//        {

//            
//            //to iterate all the rows within the database
//            while(rs.next())
//            {
//                //to iterate each column from every row
//                for(int i=1;i<=numOfCols; i++)
//                {
//                    //formatting the string
//                    System.out.printf("%-8s\t",
//                            metaData.getColumnName(i)+
//                                    ": " + rs.getObject(i));
//                    
//                    System.out.println();
//                }
//            }   
//        }
//        catch(SQLException error)
//        {
//            error.printStackTrace();
//        }
//        catch(Exception error)
//        {
//            error.printStackTrace();
//        }
//        finally
//        {
//            //close the connection
//            rs.close();
//            stat.close();
//            conn.close();
//        }

//    *****  This is for the add ***  MUST adapt to include products as well
//    *****  as employees!

//    public static void insertData() throws SQLException
//    {
//        Statement stat = null;
//        Connection conn = null;
//        
//        final String DB_URL = "jdbc:mysql://localhost/gc200299681";
//        
//        try 
//        {
//            conn = DriverManager.getConnection(DB_URL,"gc200299681", "3VNBh2r4");
//            
//            stat = conn.createStatement();
//            
//            String sql = "INSERT into 'gc200299681'.'Employees'"
//                    + "('firstName','lastName','age','position')"
//                    + "VALUES ('Karen','Springford','37', 'sales')";
//            
//            stat.executeUpdate(sql);
//            System.out.println("Data Inserted");
//        }
//        catch(SQLException error)
//        {
//            error.printStackTrace();
//        }
//        finally
//        {
//            stat.close();
//            conn.close();
//        }




