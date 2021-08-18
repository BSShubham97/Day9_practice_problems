import java.util.Random;

/**
 * @author Shubham
 * @version 1.0
 * @since 18-08-2021
 */

public class EmployeeWage {
    static final int empWagePerHour = 20;
    static final int empFulldayHour = 8;

    public void isPresent() {
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1)
            System.out.println("Employee PRESENT");
        else
            System.out.println("Employee ABSENT");
    }

    public int giveTotalWage() {
        return empFulldayHour * empWagePerHour;

    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        System.out.println("Total Wages :" + employeeWage.giveTotalWage());
    }
}
