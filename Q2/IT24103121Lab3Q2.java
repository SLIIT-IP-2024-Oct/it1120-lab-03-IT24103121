import java.util.Scanner;
public class IT24103121Lab3Q2{
     public static void main(String[]args){
     Scanner emp = new Scanner(System.in);
     System.out.print("Enter the monthly salary:");
     double salary = emp.nextDouble();
     System.out.print("Enter the number of OT hours:");
     double hours = emp.nextDouble();
     System.out.print("Enter the OT hourly rate:");
     double OTrate = emp.nextDouble();
     double OTcal  = hours * OTrate;
     double totalsalary = OTcal + salary;
     System.out.print("The total salary including:" + totalsalary);

     }
}