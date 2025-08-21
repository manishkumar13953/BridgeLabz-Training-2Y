import java.util.Scanner;

public class FeetDistance {
    public static void main(String[] args) {
        double distanceInFeet;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();
        
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
        
        input.close();
    }
}