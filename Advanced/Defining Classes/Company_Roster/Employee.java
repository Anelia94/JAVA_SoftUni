public class Employee {
    //name, salary, position, department, email and age
    public String name;
    public  double salary;
    public String position;
    public String department;
    public String email;
    public int age;

    public Employee(String name, double salary, String position, String department){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;

    }
    public Employee(String name, double salary, String position, String department, String email, int age){
        this(name, salary, position, department);
        this.email = email;
        this.age = age;
    }
    public Employee (String name, double salary, String position,String department,String email){
        this(name, salary, position, department);
        this.email = email;
        this.age = -1;

    }
    public Employee(String name, double salary, String position,String department,int age){
        this(name, salary, position, department);
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    @Override
    public String toString(){
       return String.format("%s %.2f %s %d",this.getName(),this.getSalary(),this.getEmail(),this.age);
    }
}
