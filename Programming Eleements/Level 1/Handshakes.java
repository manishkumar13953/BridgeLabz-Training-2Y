import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        int numberOfStudents;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        numberOfStudents = input.nextInt();
        
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);
        
        input.close();
    }
}