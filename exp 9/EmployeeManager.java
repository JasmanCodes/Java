import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;

    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: ₹" + salary;
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
       
        ArrayList<Employee> employees = new ArrayList<>();

        
        employees.add(new Employee("Alice", 101, 50000));
        employees.add(new Employee("Bob", 102, 55000));
        employees.add(new Employee("Charlie", 103, 60000));

        
        for (Employee emp : employees) {
            if (emp.id == 102) {
                emp.salary = 58000; 
                System.out.println("Updated salary for ID 102.\n");
                break;
            }
        }

        
        employees.removeIf(emp -> emp.id == 101);

       
        System.out.println("Remaining Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
