import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public double AverageSalary() {
        List<Employee> employees = this.getEmployees();
        int count = 0;
        double sum = 0.00;

        for (int i = 0; i < employees.size(); i++) {
            sum += employees.get(i).getSalary();
            count++;
        }

        return sum / count;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public String getName() {
        return this.name;
    }

}