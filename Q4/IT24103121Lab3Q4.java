import java.util.Scanner;

public class IT24103121Lab3Q4{
    public static void main(String[] args) {
        Scanner five = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int number = five.nextInt();
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
            return;
        }
        int d1 = number / 10000;               // First digit
        int d2 = (number / 1000) % 10;         // Second digit
        int d3 = (number / 100) % 10;          // Third digit
        int d4 = (number / 10) % 10;           // Fourth digit
        int d5 = number % 10;                  // Fifth digit
        
        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
        
        five.close();
    }
}
