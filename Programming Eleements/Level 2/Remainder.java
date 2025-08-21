import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        number2 = input.nextInt();
        
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        System.out.println("The quotient is " + quotient + " and remainder is " + remainder);
        
        input.close();
    }
}