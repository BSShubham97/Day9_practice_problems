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
    static final int monthDays=20;


    public int getTotalMonthWage() {
        Random random = new Random();
        int totalWorkHrs = 0;

        int i ;
        for(i=1;i<=monthDays;i++) {
            int workDoneHrs = random.nextInt((8) + 1);
            totalWorkHrs = totalWorkHrs + workDoneHrs;
        }
        int monthWages= totalWorkHrs * empWagePerHour;
        return monthWages;

    }
    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        System.out.println("Total Wages of a month: "+employeeWage.getTotalMonthWage());
    }
}
