package databaseapplicationapp;

import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {
        // Ask how many students do you want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create a number of new students
        for(int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].showInfo());
        }



    }
}
