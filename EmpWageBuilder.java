import java.util.Random;

interface EmpWageCalculation{
    public void totalWage();
}
class CompanyEmpWage{
    
    
    public final String company;
    public static int wagePerHour;
    public final int workingDays;
    public static int monthlyHrs;
    public int totalMonthlyWage;
    
    //Constructor
    public CompanyEmpWage(String company, int wagePerHour, int workingDays, int monthlyHrs) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.monthlyHrs = monthlyHrs;
    }
    public void setTotalMonthlyWage(int totalMonthlyWage){
        this.totalMonthlyWage=totalMonthlyWage;
    }

    @Override
    public String toString(){
        return "Total employee Wage for " + company + " is : "+ totalMonthlyWage;
    }
}

public class EmpWageBuilder implements EmpWageCalculation{

    //Computing Wage for Companies
    private int numOfCompany=0;
    private CompanyEmpWage[] EmpWageBuilderArray;

    public EmpWageBuilder() {
        EmpWageBuilderArray = new CompanyEmpWage[5];
    }

    void addEmpWageBuilder(String company, int wagePerhour, int workingDays, int maxMonthHours){
        EmpWageBuilderArray[numOfCompany] = new CompanyEmpWage(company, wagePerhour, workingDays,maxMonthHours);
        numOfCompany++;
    }
    public void totalWage(){
        for (int i=0; i<numOfCompany; i++){
            EmpWageBuilderArray[i].setTotalMonthlyWage(this.totalWage(EmpWageBuilderArray[i]));
            System.out.println(EmpWageBuilderArray[i]);
        }
    }
    private int totalWage(CompanyEmpWage companyEmpWage) {
        int totalMonthlyWage=0,totalWorkingHours=0, fullTimeHrs=8, partTimeHrs=4;

        for (int i=0; i<companyEmpWage.workingDays; i++) {

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
            if (totalWorkingHours > CompanyEmpWage.monthlyHrs) {
                totalWorkingHours = CompanyEmpWage.monthlyHrs;
                break;
            }
        }
        //Counting Total Monthly Wage
        totalMonthlyWage=totalWorkingHours * CompanyEmpWage.wagePerHour;
    
    
        return totalMonthlyWage = totalWorkingHours * companyEmpWage.wagePerHour;
    
    }
    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        System.out.println("====================================");
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addEmpWageBuilder("Company1",20,20,100);
        empWageBuilder.addEmpWageBuilder("Company2", 30,30, 120);
        empWageBuilder.addEmpWageBuilder("Company3",20,30,100);
        empWageBuilder.addEmpWageBuilder("Company4", 25,26, 120);
        empWageBuilder.totalWage();
        
    }
}