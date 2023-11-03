class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void work() {
        System.out.println(name + " is performing their job.");
    }
    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
}
class HRManager extends Employee {
    public HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing HR tasks.");
    }
    public void addEmployee(Employee employee) {
        System.out.println(getName() + " is adding a new employee: " + employee.getName());}}
public class q4 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Taranjeet", 50000);
        HRManager hrManager = new HRManager("Taran", 70000);
        employee1.work();
        hrManager.work();
        System.out.println("Employee's Salary: " + employee1.getSalary());
        System.out.println("HR Manager's Salary: " + hrManager.getSalary());
        Employee newEmployee = new Employee("Tanuj", 55000);
        hrManager.addEmployee(newEmployee);
    }
}
