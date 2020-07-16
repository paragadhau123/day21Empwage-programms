public class EmployeeWageBuilderwhile {
  public static final int IS_PART_TIME=1;
  public static final int IS_FULL_TIME =2;
  public static final int EMP_RATE_PER_HOUR=20;
  public static final int NUM_OF_WORKING_DAYS=20;
  public static final int MAX_HRS_IN_MONTH=100;

  public static void main(String args[]){
   int emphrs;
   int totalemphrs=0;
   int empwage=0;
   int totalempwage=0;
   int totalworkingdays=0;
  while (totalemphrs <= MAX_HRS_IN_MONTH && totalworkingdays < NUM_OF_WORKING_DAYS){
    double empcheck = Math.floor(Math.random() * 10) % 3;
    totalworkingdays=totalworkingdays+1;
    switch ((int)empcheck){
    case IS_FULL_TIME:
     emphrs=8;
     break;
    case IS_PART_TIME:
     emphrs=4;
     break;
   default:
     emphrs=0;
   }
  empwage=emphrs*EMP_RATE_PER_HOUR;
  totalempwage=totalempwage+empwage;
  totalemphrs=totalemphrs+emphrs;
  System.out.println("EMPWAGE="+empwage);
  }
  System.out.println("Total empwage :"+totalempwage);
  }
}



