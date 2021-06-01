//Employee Wage Computation Program in Java

public class EmpWageComputation {
     public static void main(String[] args) {
    	 //constants
    	 int empRatePerHour = 20;
    	 int isFullTime = 1;
    	 int isPartTime = 2;
    	 
    	 //variables
         int empWage = 0;
         int empHrs = 0;
              
         double empCheck = Math.floor(Math.random() * 10) % 3;
              
         if (empCheck == isFullTime) {
        	 System.out.println("Employee is Present");
        	 empHrs = 8;
         }
         else if(empCheck == isPartTime) {
        	 System.out.println("Employee is Part Time");
        	 empHrs = 4;
         }
         else {  
        	 System.out.println("Employee is Absent");
         }
              
          empWage = empHrs * empRatePerHour;
          System.out.println("EmpWage: " +empWage);
        }
}