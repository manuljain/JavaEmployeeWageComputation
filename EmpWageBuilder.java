import java.util.Random;
public class EmpWageBuilder {
    // defining variables
    static int wagePerHour = 20;
    static int fullDayHour = 8;
    static int partTimeHour = 4;
    static int monthlyWorkingDays = 20;
    static int totalWorkingHours = 0;
    
    // defining method
    public void workingHrs(){
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
    public static void main(String[] args) {
        // Welcome message
        System.out.println("welcome to Employee Wage Computation Program.");
        EmpWageBuilder empb = new EmpWageBuilder();
        
        // function call
        empb.workingHrs();
    }
}