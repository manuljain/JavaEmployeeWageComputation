import java.util.Random;

public class EmpWageBuilder {
    
    
    static String company;
    static int wagePerHour;
    static int workingDays;
    static int monthlyHrs;
    static int totalMonthlyWage;
    
    //Constructor
    EmpWageBuilder(String company, int wagePerHour, int workingDays, int monthlyHrs) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.monthlyHrs = monthlyHrs;
    }
    //Computing Wage for Companies
    static void totalWage() {
        //Variables
        int totalWorkingHours=0, fullTimeHrs=8, partTimeHrs=4;
        for (int i=0; i<workingDays; i++) {
            //To Generate Randoms 0, 1 and 2
            Random ran = new Random();
            int empCheck = ran.nextInt(3);
            
            //Employee is Present or Not
            if (empCheck == 0) {
                totalWorkingHours += fullTimeHrs;
            } else if (empCheck == 1) {
                totalWorkingHours += partTimeHrs;
            } else {
                totalWorkingHours += 0;
            }
            if (totalWorkingHours > monthlyHrs) {
                totalWorkingHours = monthlyHrs;
                break;
            }
        }
        //Counting Total Monthly Wage
        totalMonthlyWage=totalWorkingHours * wagePerHour;
    }
    public String toString(){
        return "Total employee Wage for " + company + " is : "+ totalMonthlyWage;
    }
    

    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        System.out.println("====================================");
        EmpWageBuilder company1 = new EmpWageBuilder("company1",20,20,100);
        company1.totalWage();
        System.out.println(company1);
        System.out.println("====================================");
        EmpWageBuilder company2 = new EmpWageBuilder("company2", 50,28, 150);
        company2.totalWage();
        System.out.println(company2);
    }
}