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

    public int isPresent() {
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1)
            return 1;
        else
            return 0 ;
    }

    public void workTime() {
        Random random = new Random();
        int checkEmployee = isPresent();
        switch (checkEmployee) {
            case 0:
                System.out.println("Employee Absent ");
                System.out.println("Total Wages: 0");
                break;

            case 1:
                int workHours = random.nextInt((8)+1);
                if (workHours > empPartTime) {
                    System.out.println("Employee is a FULL TIME worker");
                    int totalWage = workHours * empWagePerHour;
                    System.out.println("Total Wages:" + totalWage);
                } else {
                    System.out.println("Employee is a PART TIME worker");
                    int totalWage = workHours * empWagePerHour;
                    System.out.println("Total Wages:" + totalWage);
                }
                break;
        }


    }
    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.workTime();
    }
}
