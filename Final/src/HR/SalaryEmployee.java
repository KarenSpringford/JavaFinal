
package HR;

/**
 * @author Karen Springford
 * @date 10/07/15
 * @version 1.4
 */
public class SalaryEmployee extends Employee {
    public SalaryEmployee(){
        
    }
    private double salary;
    
    public SalaryEmployee(String firstName, String lastName, 
            String position, String phoneNo, String email,
            int age, int SIN, int employeeID, int year, int month, int day, 
            double salary) {
        super(firstName, lastName, position, phoneNo, email, age, SIN, 
                employeeID, year, month, day);
        
        this.salary = salary;
   
    }
    
    @Override
        public String toString(){
            String employeeInfo = "";
            
            employeeInfo += "\nName:\t\t"+ getFullName();
            employeeInfo += "\nEmployee ID:\t\t"+ getEmployeeID();
            employeeInfo += "\nPosition:\t\t"+ getPosition();
            employeeInfo += "\nDate of Hire:\t\t"+ getDateOfHire();
            employeeInfo += "\nAge:\t\t"+ getAge();
//            employeeInfo += "\nSalary:\t\t"+ earnings();
            
            return employeeInfo;
        }
        
        @Override
    public double getPaymentAmount()
    {
        return salary;
    }

}
