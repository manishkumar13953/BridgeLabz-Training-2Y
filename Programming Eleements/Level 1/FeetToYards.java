import java.util.Scanner;

public class FeetToYards {
    public static void main(String[] args) {
        double distanceInFeet;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();
        
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        
        System.out.println("The distance in feet is " + distanceInFeet + " while in yards is " + distanceInYards + " and miles is " + distanceInMiles);
        
        input.close();
    }
}
