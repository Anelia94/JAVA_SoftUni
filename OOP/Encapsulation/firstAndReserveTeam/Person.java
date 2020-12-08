package firstAndReserveTeam;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    private String getFirstName() {
        return this.firstName;
    }

    private String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    private double getSalary() {
        return this.salary;
    }

    public void setFirstName(String firstName){
        setNames(firstName, "First name");
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        setNames(lastName, "Last name");
        this.lastName = lastName;
    }

    public void setNames(String name, String paramName){
        if(name.length()<3){
            throw new IllegalArgumentException(paramName + " cannot be less than 3 symbols");
        }
    }


    public void setAge(int age){
        if(age <= 0){
            throw  new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary < 460.0){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
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
