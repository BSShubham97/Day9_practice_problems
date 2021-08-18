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
    static final int monthDays = 20;
    static final int maxWorkHours = 100;


    public void getLimitMonthWage() {
        Random random = new Random();
        int totalWorkHrs = 0;

        int i;

        for (i = 1; i <= monthDays; i++)    {
            if(totalWorkHrs <= maxWorkHours) {
                int workDoneHrs = random.nextInt((8) )+ 1;
                System.out.println("Work done on day "+i+" is "+workDoneHrs);
                totalWorkHrs = totalWorkHrs + workDoneHrs;
                System.out.println("Total Work Hours till day "+i+" is "+totalWorkHrs);

            }
        }
        int monthWages = totalWorkHrs * empWagePerHour;
        System.out.println("Total wages: "+monthWages);
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.getLimitMonthWage();
    }
}
