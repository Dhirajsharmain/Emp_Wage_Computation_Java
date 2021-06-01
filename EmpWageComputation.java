//Employee Wage Computation Program in Java

public class EmpWageComputation {
	 //constants
	 public static final int empRatePerHour = 20;
	 public static final int isFullTime = 1;
	 public static final int isPartTime = 2;
     public static void main(String[] args) {
    	 
    	 //variables
         int empWage = 0;
         int empHrs = 0;
              
         int empCheck =(int) Math.floor(Math.random() * 10) % 3;
              
         switch (empCheck) {
         	case isFullTime:
         		System.out.println("Employee is Present");
         		empHrs = 8;
         		break;
         	case isPartTime:
         		System.out.println("Employee is Part Time");
         		empHrs = 4;
         		break;
         	default:
         		System.out.println("Employee is Absent");
         }
              
          empWage = empHrs * empRatePerHour;
          System.out.println("EmpWage: " +empWage);
        }
}