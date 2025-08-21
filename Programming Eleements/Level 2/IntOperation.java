import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value for a: ");
        a = input.nextInt();
        
        System.out.print("Enter value for b: ");
        b = input.nextInt();
        
        System.out.print("Enter value for c: ");
        c = input.nextInt();
        
        int operation1 = a + b * c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operation4 = a % b + c;
        
        System.out.println("The results of Int Operations are " + operation1 + ", " + operation2 + ", " + operation3 + ", and " + operation4);
        
        input.close();
    }
}