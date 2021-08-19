
/**
 * @author Shubham
 * @version 1.0
 * @since 18-08-2021
 */

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public int EMP_RATE_PER_HOUR;
    public int NUM_OF_WORKING_DAYS;
    public int MAX_HRS_IN_A_MONTH;
    public String COMPANY_NAME ;

    public EmployeeWage( String COMPANY_NAME,int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_A_MONTH) {
        this.COMPANY_NAME=COMPANY_NAME;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
        this.MAX_HRS_IN_A_MONTH = MAX_HRS_IN_A_MONTH;
    }

//Method
    public  int computeEmpWage() {
        System.out.println("--------------------------------------------");
        System.out.println("Employee Wage Computation for "+COMPANY_NAME);
        System.out.println("--------------------------------------------");
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs < MAX_HRS_IN_A_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case PART_TIME:
                    empHrs = 4;
                    break;
                case FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("DAY: " + totalWorkingDays + " Emp Hrs: " + empHrs);
        }
        System.out.println("Total work hours: "+totalEmpHrs);
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        //COMPANY 1
        EmployeeWage crisil=new EmployeeWage("Crisil",25,20,100);
        System.out.println(crisil.computeEmpWage());
        //COMPANY 2
        EmployeeWage tcs =new EmployeeWage("TCS",50,20,100);
        System.out.println(tcs.computeEmpWage());

    }

}


