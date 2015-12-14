package HR;


/*
 * @author Karen Springford
 * @date 09/23/15 - 10/08/15
 * @version 1.0
 */

public class SalaryPlusCommissionEmployee extends Employee {

    public SalaryPlusCommissionEmployee(){
        
    }
    
    private double salary;
    private static final double commissionRate = .07;
    private double sales;
    
    public SalaryPlusCommissionEmployee(String firstName, String lastName, 
            String position, String phoneNo, String email,
            int age, int SIN, int employeeID, int year, int month, int day, 
            double salary, double sales) {
        super(firstName, lastName, position, phoneNo, email, age, SIN, 
                employeeID, year, month, day);
        
        this.salary = salary;
        this.sales = sales;
        
    }
    
    @Override
        public String toString(){
            String employeeInfo = "";
            
            employeeInfo += "\nName:\t\t"+ getFullName();
            employeeInfo += "\nEmployee ID:\t\t"+ getEmployeeID();
            employeeInfo += "\nPosition:\t\t"+ getPosition();
            employeeInfo += "\nDate of Hire:\t\t"+ getDateOfHire();
            employeeInfo += "\nAge:\t\t"+ getAge();
//            employeeInfo += "\nEarns:\t\t"+ earnings();
            
            return employeeInfo;
        }
        
    @Override
    public double getPaymentAmount()
    {
        return (sales * commissionRate) + salary;
    }
}
