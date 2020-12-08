package Student_System;

import java.util.ArrayList;
import java.util.List;

public class Student {
    //name, age, grade
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

    }

    public String getName() {
        return this.name;
    }
    private int getAge(){
        return this.age;
    }

    private String studentGradeCommentary (){
        if(this.grade >= 5.50){
            return "Excellent student.";
        }else if (this.grade >= 3.50 && this.grade < 5.50){
            return "Average student.";
        }
        return "Very nice person.";
    }


    public String show(String name) {
        if (this.getName().equals(name)) {
                return String.format("%s is %d years old. %s",
                        this.getName(),this.getAge(),this.studentGradeCommentary());
            }

        return "";
    }


}
