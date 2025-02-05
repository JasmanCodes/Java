class University {
    
    static String universityName = "UPES";

   
    private String studentName;


    public University(String studentName) {
        this.studentName = studentName;
    }

    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

   
    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
       
        University.displayUniversityName();

    
        University student1 = new University("Alice");
        University student2 = new University("Bob");
        University student3 = new University("Charlie");

      
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();

  
        University.universityName = "Tech Institute";

       
        System.out.println("\nAfter changing university name:");
        University.displayUniversityName();

        
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
    }
}
