abstract class Person {
    String name;
    Person(String name) { this.name = name; }
    abstract void performDuty();
}

class Student extends Person {
    Student(String name) { super(name); }
    void performDuty() { System.out.println(name + " is studying."); }
}

class Teacher extends Person {
    Teacher(String name) { super(name); }
    void performDuty() { System.out.println(name + " is teaching."); }
}

public class SchoolManagement {
    public static void main(String[] args) {
        Person[] people = { new Student("Alice"), new Teacher("Mr. Smith"), new Student("Bob"), new Teacher("Ms. Johnson") };
        for (Person person : people) person.performDuty();
    }
}
