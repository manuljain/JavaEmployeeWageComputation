public class EmpWageBuilder {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("welcome to Employee Wage Computation Program.");
        // Constants
        int IS_FULL_TIME = 1;
        int wagePerHour = 20;
        int fullDayHour = 8;
        // Computation
        Double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("employee is present.");
            System.out.println("daily wage is : "+wagePerHour*fullDayHour);
        } else {
            System.out.println("employee is absent.");
            System.out.println("daily wage is : 0");
        }
    }

}