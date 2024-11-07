import java.util.Scanner;
public class IT24103121Lab3Q1B{
     public static void main(String[]args){
     Scanner emp = new Scanner(System.in);
     System.out.print("Enter the monthly salary:");
     double salary = emp.nextDouble();
     System.out.print("Enter the number of OT hours:");
     double hours = emp.nextDouble();
     System.out.print("Enter the OT hourly rate:");
     double OT rate = emp.nextDouble();
     double OT cal  = hours * OT rate;
     double totalsalary = OT cal + salary;
     System.out.print("The total salary including:" + totalsalary);

     }
}