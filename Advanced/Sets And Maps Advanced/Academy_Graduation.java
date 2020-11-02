import java.util.*;

public class Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGrades = new TreeMap<>();
        for (int i = 0; i < numberOfStudents; i++) {
            String name = scanner.nextLine();
            String[] scores = scanner.nextLine().split("\\s+");
            ArrayList<Double> grades = new ArrayList<>();
            for (int j = 0; j < scores.length; j++) {
                double grade = Double.parseDouble(scores[j]);
                grades.add(grade);

            }
            studentsGrades.put(name, grades);

        }

        studentsGrades.forEach((key, value) -> {
            System.out.print(key + " is graduated with " + getAverage(value));
            System.out.println();

        });

    }

    private static double getAverage(List<Double> value) {
        double sum =0;
        int count = 0;
        for (int i = 0; i <value.size() ; i++) {
            count++;
            sum+=value.get(i);
        }
        return sum/count;

    }
}

