import java.util.Random;

/**
 * @author Shubham
 * @version 1.0
 * @since 18-08-2021
 */

public class EmployeeWage {
    static final int empWagePerHour = 20;
    static final int empFullTime = 8;
    static final int empPartTime = 4;

    public void isPresent() {
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1)
            System.out.println("Employee PRESENT");
        else
            System.out.println("Employee ABSENT");
    }

    public int workTime() {
        Random random = new Random();
        int workHours = random.nextInt(9);
        if (workHours == 0) {
            System.out.println("Employee Absent ");
            return 0;
        } else if (workHours > empPartTime) {
            System.out.println("Employee is a FULL TIME worker");
            return workHours;
        } else {
            System.out.println("Employee is a PART TIME worker");
            return workHours;
        }
    }

    public void giveTotalWage(int Hours) {
        int totalWage = Hours * empWagePerHour;
        System.out.println("Total Wage: " + totalWage);
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.giveTotalWage(employeeWage.workTime());
    }
}
