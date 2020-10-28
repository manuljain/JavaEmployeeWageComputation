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
    public void fullTime(){
        int wagePerHour = 20;
        int fullDayHour = 8;
        System.out.println("daily full timewage is : "+wagePerHour*fullDayHour);
    }
    public void partTime(){
        int wagePerHour = 20;
        int partTimeHour = 4;
        System.out.println("daily part time wage is : "+wagePerHour*partTimeHour);
    }
}