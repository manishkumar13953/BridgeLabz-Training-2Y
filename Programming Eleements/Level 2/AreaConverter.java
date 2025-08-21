import java.util.Scanner;

public class AreaConverter {
    public static void main(String[] args) {
        double base;
        double height;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base of triangle in cm: ");
        base = input.nextDouble();
        
        System.out.print("Enter height of triangle in cm: ");
        height = input.nextDouble();
        
        double areaSquareCm = 0.5 * base * height;
        double areaSquareInches = areaSquareCm / 6.4516;
        
        System.out.println(" Area of the triangle in sq  " + areaSquareInches + " and sq in cm is " + areaSquareCm);
        
        input.close();
    }
}