package salaryIncrease;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    private String getFirstName() {
        return this.firstName;
    }

    private String getLastName() {
        return this.lastName;
    }

    private int getAge() {
        return this.age;
    }

    private double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (this.getAge() < 30) {
             this.setSalary(this.getSalary() + (this.getSalary() * ((bonus / 2) / 100)));
        } else {
             this.setSalary(this.getSalary() + (this.getSalary() * (bonus / 100)));
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.0###");
        String sb = String.format("%s %s gets ", this.getFirstName(), this.getLastName()) +
                df.format(this.getSalary()) +
                " leva";
        return sb.trim();
    }


}
