import java.util.Scanner;

public class ShortGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Physics marks: ");
        int physics = scanner.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = scanner.nextInt();
        
        double percentage = (physics + chemistry + maths) / 3.0;
        
        char grade = (percentage >= 80) ? 'A' :
                    (percentage >= 70) ? 'B' :
                    (percentage >= 60) ? 'C' :
                    (percentage >= 50) ? 'D' :
                    (percentage >= 40) ? 'E' : 'R';
        
        String remarks = (grade == 'A') ? "Level 4, above agency-normalized standards" :
                        (grade == 'B') ? "Level 3, at agency-normalized standards" :
                        (grade == 'C') ? "Level 2, below, but approaching agency-normalized standards" :
                        (grade == 'D') ? "Level 1, well below agency-normalized standards" :
                        (grade == 'E') ? "Level 1-, too below agency-normalized standards" :
                        "Remedial standards";
        
        System.out.printf("Average Mark: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        scanner.close();
    }
}
