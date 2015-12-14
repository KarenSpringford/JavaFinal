package HR;
import ap.*;

/**
 *
 * @author Karen Springford
 * @date 10/07/15
 * @version 1.4
 */
public class HourlyEmployee extends Employee {

    private double hours;
    private double hourlyWage;
    private final double benefitsCost = 25;
    private final double overTime = 1.5;
    private final double overTimeCutOff = 44;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String firstName, String lastName,
            String position, String phoneNo, String email,
            int age, int SIN, int employeeID, int year, int month, int day,
            double hours, double hourlyWage, double benefitsCost, double overTime) {
        super(firstName, lastName, position, phoneNo, email, age, SIN,
                employeeID, year, month, day);

        this.hours = hours;
        this.hourlyWage = hourlyWage;

    }

    @Override
    public String toString() {
        String employeeInfo = "";

        employeeInfo += "\nName:\t\t" + getFullName();
        employeeInfo += "\nEmployee ID:\t\t" + getEmployeeID();
        employeeInfo += "\nPosition:\t\t" + getPosition();
        employeeInfo += "\nDate of Hire:\t\t" + getDateOfHire();
        employeeInfo += "\nAge:\t\t" + getAge();
//        employeeInfo += "\nCurrent PayCheque:\t\t" + earnings();

        return employeeInfo;
    }

    @Override
    public double getPaymentAmount() {
        if (hours < overTimeCutOff) {
            return (hours * hourlyWage) - benefitsCost;
        } else {
            return (hours - overTimeCutOff) * overTime + (hours * hourlyWage) - benefitsCost;
        }
    }
}
