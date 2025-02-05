class Student {
    
    private String name;
    private int age;

    
    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }

   
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        
        Student student1 = new Student();
        System.out.println("Details of Student 1:");
        student1.displayDetails();

        
        Student student2 = new Student("John Doe", 21);
        System.out.println("Details of Student 2:");
        student2.displayDetails();
    }
}

