import java.util.Scanner;

public class Gradebook1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many students in the class? ");
        int numStudents = in.nextInt();
        int[] id = new int[numStudents];
        double[] quiz1 = new double[numStudents];
        double[] quiz2 = new double[numStudents];
        double[] quiz3 = new double[numStudents];
        double quizSum = 0.0;
        double classAverage;

        for(int i = 0; i < numStudents; i++){
            System.out.print("Enter student ID: ");
            id[i] = in.nextInt();

            System.out.print("Enter the score for Quiz 1 : ");
            quiz1[i] = in.nextDouble();
            System.out.print("Enter the score for Quiz 2 : ");
            quiz2[i] = in.nextDouble();
            System.out.print("Enter the score for Quiz 3 : ");
            quiz3[i] = in.nextDouble();
        }

        for(int i = 0; i < numStudents; i++){
            double stuAverage = (quiz1[i] + quiz2[i] + quiz3[i]) / 3;
            System.out.println("ID " + id[i] + " - Final grade: " + stuAverage);
            quizSum += stuAverage;
        }
        classAverage = quizSum/numStudents;
        System.out.println("Class average: " + classAverage);

//        System.out.println(Arrays.toString(id));
//        System.out.println(Arrays.toString(quiz1));
//        System.out.println(Arrays.toString(quiz2));
//        System.out.println(Arrays.toString(quiz3));
    }
}
