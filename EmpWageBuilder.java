import java.util.Random;
public class EmpWageBuilder {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("welcome to Employee Wage Computation Program.");

        // defining variables
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int monthlyWorkingDays = 20;
        int totalWorkingHours = 0;

        for(int i=0;i<monthlyWorkingDays;i++){

            //generating random values 0,1 and 2
            Random random = new Random();
            int empCheck = random.nextInt(3);

            if(empCheck == 0){
               totalWorkingHours += fullDayHour;
            } else if (empCheck == 1){
               totalWorkingHours += partTimeHour;
            } else{
               totalWorkingHours += 0;   
            }

            if(totalWorkingHours>=100){
               totalWorkingHours = 100;
                break;
            }
        }
        System.out.println("Total Working Hours : " + totalWorkingHours );
        // calculating total monthly wage
        int totalMonthlyWage=totalWorkingHours * wagePerHour;
        System.out.println("Total monthly wage : " + totalMonthlyWage);
    }
}