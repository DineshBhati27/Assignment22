import java.util.Random;
class EMPUC8{
        final static int isPartTime=0;
        final static int isFullTime=1;
        
public void calculate(String company,int empRatePerHour,int totalHours,int totalDays){
        int hours=0;
        int days=0;
        int salary=0;
        int empHours;
        int totalSalary=0;
        Random ran=new Random();
        while(hours<=totalHours && days<=totalDays){
              int empCheck=ran.nextInt(2);
                switch(empCheck){
                case isPartTime:
                        empHours=4;
                        break;
                case isFullTime:
                        empHours=8;
                        break;
                default :
                        empHours=0;
                }
                hours+=empHours;
                days++;
                salary=empRatePerHour*empHours;
                totalSalary=totalSalary+salary;
  }
                  System.out.println("Employee total wage per month in "+company+" is: "+totalSalary);
}
public static void main(String args[]){
    EMPUC8 emp=new EMPUC8();
    emp.calculate("Dmart",20,100,20);
    emp.calculate("Amazon",20,100,20);
    emp.calculate("Flipkart",20,100,20);
}
}