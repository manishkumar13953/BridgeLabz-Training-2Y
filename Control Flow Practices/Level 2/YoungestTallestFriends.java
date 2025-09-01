import java.util.Scanner;

public class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int amarAge = sc.nextInt();
        double amarHeight = sc.nextDouble();
        int akbarAge = sc.nextInt();
        double akbarHeight = sc.nextDouble();
        int anthonyAge = sc.nextInt();
        double anthonyHeight = sc.nextDouble();
        
        String youngest = "";
        int minAge = amarAge;
        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngest = "Akbar";
        } else {
            youngest = "Amar";
        }
        if (anthonyAge < minAge) {
            youngest = "Anthony";
        }
        
        String tallest = "";
        double maxHeight = amarHeight;
        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallest = "Akbar";
        } else {
            tallest = "Amar";
        }
        if (anthonyHeight > maxHeight) {
            tallest = "Anthony";
        }
        
        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
        
        sc.close();
    }
}