import java.util.ArrayList;
import java.util.List;

public class q10 {
    public static void main(String[] args) {
        EmployeeModel model = new EmployeeModel();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.addEmployee(new Employee("John", "Developer", 50000));
        controller.addEmployee(new Employee("Alice", "Manager", 60000));
        controller.updateView();
    }
}
class Employee {
    private String name;
    private String position;
    private double salary;
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public double getSalary() {
        return salary;
    }
}
class EmployeeModel {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

class EmployeeView {
    public void printEmployeeDetails(List<Employee> employees) {
        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Position: " + employee.getPosition());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
    }
}

class EmployeeController {
    private EmployeeModel model;
    private EmployeeView view;

    public EmployeeController(EmployeeModel model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void addEmployee(Employee employee) {
        model.addEmployee(employee);
    }

    public void updateView() {
        List<Employee> employees = model.getEmployees();
        view.printEmployeeDetails(employees);
    }
}
