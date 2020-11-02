import java.util.Random;
import java.util.Scanner;
public class EmpWageBuilder {
    
    static int day = 1;
    static int totalWorkingHours = 0;
        
    // defining method
    public void totalWage(int wagePerHour) {
        int totalMonthlyWage = totalWorkingHours * wagePerHour;
        System.out.println("Employee worked " + totalWorkingHours + " Hours in a Month");
        System.out.println("Employee Wage : " + totalMonthlyWage);
    }
    //defining method for counting 20 days
    public void days(int fullTimeHrs, int PartTimeHrs, int dayNum) {

        //To Generate Randoms 0, 1 and 2
        Random ran = new Random();
        int empCheck = ran.nextInt(3);

        //Employee is Present or Not
        if (empCheck == 0) {
            totalWorkingHours += fullTimeHrs;
        } else if (empCheck == 1) {
            totalWorkingHours += PartTimeHrs;
        }
        day += 1;
        if (day <= dayNum) {
            EmpWageBuilder emp = new EmpWageBuilder();
            emp.days(fullTimeHrs, PartTimeHrs, dayNum);
        }
    }

    public static void main(String[] args) {
        // Welcome message
        System.out.println("welcome to the Employee Wage Computation Program");
        int company = 1;
        while (true){
            System.out.println("==========================================");
            System.out.println("Company "+company+"Employee wage computation");
            System.out.println("==========================================");
            //User-readers
            Scanner reader = new Scanner(System.in);

            System.out.println("Enter Wage Per Hour : ");
            int wagePrHr = reader.nextInt();

            System.out.println("Enter Full Time Hours : ");
            int ftHrs = reader.nextInt();

            System.out.println("Enter Half Time Hours : ");
            int htHrs = reader.nextInt();

            System.out.println("Enter number of days in which employee can work in a month : ");
            int dayNum = reader.nextInt();

            System.out.println("Enter number of working hours employee can work in a month : ");
            int monthlyWorkingHrs = reader.nextInt();

            EmpWageBuilder emp = new EmpWageBuilder();
            System.out.println("=========================================");
            emp.days(ftHrs,htHrs,dayNum);
                //Setting Working Hours 100 if greater 100
                if (totalWorkingHours > monthlyWorkingHrs) {
                    totalWorkingHours = monthlyWorkingHrs;
                }
            emp.totalWage(monthlyWorkingHrs);
	        System.out.println("=========================================");
            
            // if you want another company's wage
            System.out.println("want 1 more company's wage?");
            System.out.println("write yes if u want to");
            System.out.println("otherwise write no");
            Scanner scanner = new Scanner(System.in);
            String cnfrm = scanner.nextLine();
            if(cnfrm.equals("yes") || cnfrm.equals("YES")){
                company+=1;
                continue;
            }else if (cnfrm.equals("no") || cnfrm.equals("NO")){
    
                break;
            }
        }
    }
}