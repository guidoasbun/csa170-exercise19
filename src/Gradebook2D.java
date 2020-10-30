/*
*   Guido Asbun
*   CSA170
*   October 29, 2020
*
*   Exercise 19
 */

import java.util.Scanner;

public class Gradebook2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many students in the class? ");
        int numStudents = in.nextInt();
        int[] id = new int[numStudents];
        double[][] quizzes = new double[numStudents][3];
        double quizSum = 0.0;
        double classAverage;

        for(int i = 0; i < numStudents; i++){
            System.out.print("Enter student ID: ");
            id[i] = in.nextInt();

            for(int j = 0; j < 3; j++){
                System.out.print("Enter score for Quiz " + (j+1) + " : ");
                quizzes[i][j] = in.nextDouble();
            }
        }

        for(int i = 0; i < numStudents; i++){
            double stuAverage;
            double stuSum = 0.0;

            for(int j = 0; j < 3; j++){
                stuSum += quizzes[i][j];
            }
            stuAverage = stuSum / 3;
            quizSum += stuAverage;
            System.out.print("\nID " + id[i] + " - Final grade: ");
            System.out.printf("%.2f", stuAverage);
        }

        classAverage = quizSum/numStudents;
        System.out.print("\nThe class average: ");
        System.out.printf("%.2f", classAverage);

    }
}
