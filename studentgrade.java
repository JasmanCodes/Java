public class studentgrade {
    
    public static String calculateGrade(double marks1, double marks2, double marks3) {
        double average = (marks1 + marks2 + marks3) / 3;
        
        if (average >= 90) {
            return "Grade A";
        } else if (average >= 75) {
            return "Grade B";
        } else if (average >= 50) {
            return "Grade C";
        } else {
            return "Grade F";
        }
    }
    
    public static void main(String[] args) {
        double marks1 = 85, marks2 = 90, marks3 = 80;
        System.out.println("Final Grade: " + calculateGrade(marks1, marks2, marks3));
    }
}
