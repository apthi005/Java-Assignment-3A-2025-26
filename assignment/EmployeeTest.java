package assignment;
class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        salary += salary * (percent / 100);
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Alice", 50000);
        emp.display();
        System.out.println("Raising salary by 10%...");
        emp.raiseSalary(10);
        emp.display();
    }
}