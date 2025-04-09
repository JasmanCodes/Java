
abstract class Employee{
    abstract void calculatesalary();
    abstract void displayDetails();
}

class Manager extends Employee{
    private double fixedsalary;
    private String name,role;
    public Manager(double fixedsalary, String name, String role){
        this.fixedsalary=fixedsalary;
        this.name=name;
        this.role=role;
    }

    void calculatesalary(){
     double salary=12*fixedsalary;
     System.out.println("Manager's yearly Salary: $"+salary);
    }
    void displayDetails(){
        System.out.println("Name: "+name+", Role: "+role+", Per Month Salary: "+fixedsalary);
    }
}

class developers extends Employee{
    private double hourlywage;
    private int hoursworked;
    private String name,role;
    public developers(double hourlywage,int hoursworked, String name,String role){
        this.hourlywage=hourlywage;
        this.hoursworked=hoursworked;
        this.name=name;
        this.role=role;
    }

    void calculatesalary(){
        double salary= hoursworked*hourlywage;
        System.out.println("Developer's salary: $"+salary);
    }

    void displayDetails(){
        System.out.println("Name: "+name+", Hourlywage: $"+hourlywage+", Role: "+role);
    }
}
public class ques2_employee {
    public static void main(String[] args) {
        Employee Manager=new Manager(40000,"Ansh","Manager");
       
        Employee Developer=new developers(40, 20, "vikhyat", "developer");

        Manager.calculatesalary();
        Manager.displayDetails();
        Developer.calculatesalary();
        Developer.displayDetails();
    }
}
