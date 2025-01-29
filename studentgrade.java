import java.util.Scanner;

public class gradecalculator{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter marks of your Subject 1: ");
            float m1 = sc.nextFloat();
            System.out.println("Marks of your Subject 1: "+ m1);
            System.out.print("Enter marks of your Subject 2: ");
            float m2 = sc.nextFloat();
            System.out.println("Marks of your Subject 2: "+ m2);
            System.out.print("Enter marks of your Subject 3: ");
            float m3 = sc.nextFloat();
            System.out.println("Marks of your Subject 3: "+ m3);

            float Avg;

            Avg = (m1 + m2 + m3) / 3;

            System.out.println("Your Avg is: "+ Avg);
            char grade;
            if(Avg >= 90){
                    grade = 'A';
                }
                else if(Avg >= 75){
                    grade = 'B';
            }
            else if(Avg >= 50){
                grade = 'C';
            }
            else{
                grade = 'F';
            }
            System.out.println("Your grade is: "+ grade);
        }
    }
}
