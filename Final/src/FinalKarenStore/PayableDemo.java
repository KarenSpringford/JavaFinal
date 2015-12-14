
package FinalKarenStore;
import java.util.ArrayList;
import ap.*;
import HR.*;

/**
 *
 * @author Karen Springford
 * @date Nov18/15
 */

public class PayableDemo {
    public static void main(String[]args)
    {
        ArrayList<Payable> payableObjects = new ArrayList();
        
        payableObjects.add(new Invoice("1234", "pillow", 2, 49.00));
        payableObjects.add(new Invoice("5678", "bed", 1, 349.00));
        payableObjects.add(new SalaryEmployee("Joe", "Smith", "Sales", "542-7654","joe@gc.com",45, 345678976,23, 2001, 12, 12, 450000));
        
        System.out.println("Polymorphic display of Invoices and Employees");
        
        for(Payable current:payableObjects)
        {
            System.out.println(current.toString() + " "+current.getPaymentAmount());
        }
    }
}
