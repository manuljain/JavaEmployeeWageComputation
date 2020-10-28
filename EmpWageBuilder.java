import java.util.Random;
public class EmpWageBuilder {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("welcome to Employee Wage Computation Program.");
        
        // Creating object of class
        EmpWageBuilder empw = new EmpWageBuilder();

        // Generating Randoms 0, 1 and 2
        Random ran= new Random();
        int empCheck = ran.nextInt(3);
        

        switch (empCheck){
        case 0 :
            System.out.println("employee is present.");
            empw.partTime();
            break;
        case 1 :
            System.out.println("employee is present.");
            empw.fullTime();
            break;
        case 2 :
            System.out.println("employee is absent.");
            System.out.println("daily wage is : 0");
            break;
        }
    }
    // calculating total month wage
    public void fullTime(){
        int wagePerHour = 20;
        int fullDayHour = 8;
        int monthlyWorkingDays = 20;
        int totalMonthWage = wagePerHour*fullDayHour*monthlyWorkingDays;
        System.out.println("daily full timewage is : "+totalMonthWage);
    }
    public void partTime(){
        int wagePerHour = 20;
        int partTimeHour = 4;
        int monthlyWorkingDays = 20;
        int totalMonthWage = wagePerHour*partTimeHour*monthlyWorkingDays;
        System.out.println("daily part time wage is : "+totalMonthWage);
    }
}