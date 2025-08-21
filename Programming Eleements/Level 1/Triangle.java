import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double base;
        double height;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base of triangle in inches: ");
        base = input.nextDouble();
        
        System.out.print("Enter height of triangle in inches: ");
        height = input.nextDouble();
        
        double areaSquareInches = 0.5 * base * height;
        double areaSquareCentimeters = areaSquareInches * 6.4516;
        
        System.out.println("The area of triangle is " + areaSquareInches + " square inches and " + areaSquareCentimeters + " square centimeters");
        
        input.close();
    }
}