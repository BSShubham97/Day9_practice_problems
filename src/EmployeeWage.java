/**
 * @author Shubham
 * @version 1.0
 * @since 18-08-2021
 */

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public int empRatePerHour;
    public int maxWorkingDaysPerMonth;
    public int maxHoursPerMonth;
    public String companyName;
    public int totalEmployeeWage;

    /**
     * @param empRatePerHour : Amount received per hour
     * @param maxHoursPerMonth : The limit of amount a employee can work per month
     * @param maxWorkingDaysPerMonth : The number of days a employee can work
     */


    public EmployeeWage(String companyName, int maxHoursPerMonth,int maxWorkingDaysPerMonth,int empRatePerHour ) {
        this.companyName=companyName;
        this.empRatePerHour=empRatePerHour;
        this.maxWorkingDaysPerMonth=maxWorkingDaysPerMonth;
        this.maxHoursPerMonth=maxHoursPerMonth;


    }

    public void computeEmpWage() {
        int empHrs;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs < maxHoursPerMonth && totalWorkingDays < maxWorkingDaysPerMonth) {
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

        }

        totalEmployeeWage = totalEmpHrs * empRatePerHour;

    }
    @Override
    public String toString(){
        return "Total Employee Wage for Company: "+companyName+" is "+totalEmployeeWage;
    }

    public static void main(String[] args) {

        //uc-9
        //COMPANY 1

        EmployeeWage crisil=new EmployeeWage("CRSISIL",200,20,30);
        crisil.computeEmpWage();
        System.out.println(crisil);
        //COMPANY 2
        EmployeeWage tcs =new EmployeeWage("TCS",200,23,28);
        tcs.computeEmpWage();
        tcs.computeEmpWage();
        System.out.println(tcs);

        }
    }







