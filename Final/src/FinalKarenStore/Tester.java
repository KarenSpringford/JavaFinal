
package FinalKarenStore;

import HR.Employee;
import HR.HourlyEmployee;
import HR.SalaryEmployee;
import java.util.ArrayList;
import products.Product;

/**
 *
 * @author Karen
 */
public class Tester {

    public static void main(String[] args) {

        ArrayList<Product> prod = new ArrayList<>();
        ArrayList<Employee> emp = new ArrayList<>();
       

        emp.add(new HourlyEmployee());
        emp.get(0).setFirstName("Karen");
        emp.get(0).setLastName("Springford");
        emp.get(0).setPosition("Customer Service Rep");
        emp.get(0).setPhoneNo("9058684695");
        emp.get(0).setEmail("jkspringford@rogers.com");
        emp.get(0).setAge(37);
        emp.get(0).setSIN(906845234);
        emp.get(0).setEmployeeID();
        System.out.println(emp.get(0).getEmployeeID());
        

        emp.add(new SalaryEmployee());
        emp.get(1).setFirstName("Jordan");
        emp.get(1).setLastName("Springford");
        emp.get(1).setPosition("Manager");
        emp.get(1).setPhoneNo("9058684696");
        emp.get(1).setEmail("jkspringford@gmail.com");
        emp.get(1).setAge(38);
        emp.get(1).setSIN(905515804);
        emp.get(1).setEmployeeID();
        System.out.println(emp.get(1).getEmployeeID());


        prod.add(new Product());
        prod.get(0).setProductName("bread");
        prod.get(0).setDescription("white sliced bread");
        prod.get(0).setMinQuantity(5);
        prod.get(0).setQuantity(1);
        prod.get(0).setProductCost(.40);
        prod.get(0).setProductID(0);

        prod.add(new Product());
        prod.get(1).setProductName("eggs");
        prod.get(1).setDescription("from the chicken's bum");
        prod.get(1).setMinQuantity(10);
        prod.get(1).setQuantity(20);
        prod.get(1).setProductCost(2);
        prod.get(0).setProductID(1);

        new KarenStore(prod, emp);

    }
}
