import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

interface EmpWageCal{
public void EmpWage();
}

public class EmpWageBuilder implements EmpWageCal{


	public void EmpWage(){

		int empRatePerHr;
		int noWorkingDays;
		int maxHr;
		Scanner in = new Scanner(System.in);
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM!");
		System.out.println("==============================================");
		System.out.println("Enter the necessary details as per your company");
		System.out.println("Enter a hourly Wage for your company :");
		empRatePerHr=in.nextInt();
		System.out.println("Enter a maximum Working Days : ");
		noWorkingDays=in.nextInt();
		System.out.println("Enter a maximum Working Hours for month : ");
		maxHr=in.nextInt();
		System.out.println("");
		//Variable declaration
		int empHr;
		int dailyWage;
		int totalSalary=0;
		int partTime=0;
		int fullTime=0;
		int absent=0;
		int totalDays=0;
		int totalEmpHr=0;
		System.out.println("COMPANY DATA");
		System.out.println("Employee Wage per hour : "+empRatePerHr+" Maximum Working Days : "+maxHr+" Maximum Working Hours : "+maxHr);
		System.out.println("");

		while( totalEmpHr<maxHr && totalDays<noWorkingDays ){
			totalDays+=1;
			Random ran=new Random();
                int ran1=ran.nextInt(3)+1;
            
			switch(ran1){
				case 3: 
                absent+=1;
                empHr=0;
                break;
				case 1 :
                fullTime+=1;
                empHr=8;
                break;
                default :
                partTime+=1;
                empHr=4;
			}
		totalEmpHr+=empHr;
		dailyWage=empRatePerHr*empHr;
		totalSalary=dailyWage+totalSalary;
		}
		System.out.println("EMPLOYEE DATA :");
		System.out.println("FullTime Present Days : "+fullTime+" Part Time Present Days : "+partTime+" Absent Days : "+absent);
		System.out.println("Total Working Days : "+totalDays+" Total Working Hours : "+totalEmpHr);
		System.out.println("Total Salary for a Month is "+totalSalary);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("");
	}

	public static void main(String args[]){

        EmpWageBuilder[] obj = new EmpWageBuilder[3];

        ArrayList<EmpWageBuilder> company = new ArrayList<EmpWageBuilder>();
            company.add(new EmpWageBuilder());
            company.add(new EmpWageBuilder());
            company.add(new EmpWageBuilder());

        for (EmpWageBuilder c: company){
            c.EmpWage();
        }
    }
}