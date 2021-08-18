import java.util.Random;

public class EmployeeWage {
    public void isPresent() {
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1)
            System.out.println("Employee PRESENT");
        else
            System.out.println("Employee ABSENT");
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.isPresent();
    }
}
