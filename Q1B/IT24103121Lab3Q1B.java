import java.util.Scanner;
public class IT24103121Lab3Q1B{
     public static void main(String[]args){
     Scanner shop = new Scanner(System.in);
     System.out.println("Enter the price of 1kg of rice:");
     double price = shop.nextDouble();
     System.out.println("Enthe the number of killograms you want to buy:");
     double qut = shop.nextDouble();
     double amount = price*qut;
     double cal = amount*0.10;
     double discount = amount-cal;
     System.out.println("The total amount with 10% discount is: " + discount);
     }

}