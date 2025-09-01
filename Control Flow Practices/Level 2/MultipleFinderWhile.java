import java.util.Scanner;

public class MultipleFinderWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            scanner.close();
            return;
        }
        
        System.out.println("Multiples of " + number + " below 100 are:");
        
        int counter = 99;
        
        while (counter >= number) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
        
        scanner.close();
    }
}
