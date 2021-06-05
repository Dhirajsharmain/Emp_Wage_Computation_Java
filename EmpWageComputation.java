//Employee Wage Computation Program in Java

public class EmpWageComputation {
    //constants
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int MAX_HRS_IN_MONTHS= 100;

    public static void main(String[] args) {

        //variables
        int empWage;
        int empHrs = 0;
        int numOfWorkingDays = 20;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while ( totalEmpHrs < MAX_HRS_IN_MONTHS && totalWorkingDays < numOfWorkingDays ) {
            totalWorkingDays += 1 ;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
            }
            totalEmpHrs = totalEmpHrs + empHrs;
        }

        empWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("EmpWage: " + empWage);
    }
}