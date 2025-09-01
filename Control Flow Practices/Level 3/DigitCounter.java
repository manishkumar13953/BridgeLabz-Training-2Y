import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int count = 0;
        int originalNumber = Math.abs(number);
        
        if (originalNumber == 0) {
            count = 1;
        } else {
            while (originalNumber != 0) {
                originalNumber = originalNumber / 10;
                count++;
            }
        }
        
        System.out.println("Number of digits in " + number + " is: " + count);
        
        scanner.close();
    }
}
