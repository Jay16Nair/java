import java.util.Scanner;

public class GradeCalculator {
    public static void main(String args[]) {
        System.out.println("Enter your marks");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        sc.close();
        int grade = -1; // Initialize grade to -1

        if (marks > 90) {
            grade = 1; // O grade
        } else if (marks > 80 && marks <= 90) {
            grade = 2; // A+ grade
        } else if (marks > 60 && marks <= 80) {
            grade = 3; // A grade
        }

        switch (grade) {
            case 1:
                System.out.println("O grade");
                break;
            case 2:
                System.out.println("A+ grade");
                break;
            case 3:
                System.out.println("A grade");
                break;
            default:
                System.out.println("Fail");
                break;
        }
    }
}
