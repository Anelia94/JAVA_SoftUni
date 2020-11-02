import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();
        Map<String,Department> departments =new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            Employee employee = null;

            if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee = new Employee(name, salary,position,department,email,age);
            } else if (input.length == 4) {
                employee = new Employee(name, salary,position,department);
            } else if (  input.length == 5) {
              try {
                  int age = Integer.parseInt(input[4]);
                  employee = new Employee(name, salary,position,department,age);
              }catch (NumberFormatException e){
                  String email = input[4];
                  employee = new Employee(name, salary,position,department,email);
              }
            }
            employees.add(employee);
            departments.putIfAbsent(department,new Department(department));
            departments.get(department).getEmployees().add(employee);

        }

       Department maxAverageSalaryDepartment = departments
               .entrySet().
                       stream().
                       max(Comparator.comparing(e -> e.getValue().AverageSalary())).get().getValue();

        System.out.println(String.format("Highest Average Salary: %s",maxAverageSalaryDepartment.getName()));
        maxAverageSalaryDepartment.getEmployees().stream().sorted((e1,e2) ->
            Double.compare(e2.getSalary(),e1.getSalary()) ).forEach(
                    employee -> {
                        System.out.println(employee.toString());
                    }
        );


    }
}

