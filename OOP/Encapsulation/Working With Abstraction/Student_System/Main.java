package Student_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();
        while (!"Exit".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String name = tokens[1];

            if (command.equals("Create")) {
                int age = Integer.parseInt(tokens[2]);
                double grade = Double.parseDouble(tokens[3]);

                Student student = new Student(name, age, grade);
                students.add(student);
            } else if (command.equals("Show")) {
                for (Student student : students) {
                    if (student.getName().equals(name)) {
                        System.out.println(student.show(name));
                    }
                }
            }
            input = scanner.nextLine();
        }


    }
}

