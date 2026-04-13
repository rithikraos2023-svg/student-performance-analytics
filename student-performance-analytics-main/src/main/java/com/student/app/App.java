package com.student.app;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter name and marks (CAT[30], Assignment[20], FAT[50]) for Student " + i + ":");
            students.add(new Student(sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }

        Student topper = students.stream().max(Comparator.comparingDouble(s -> s.total)).get();

        System.out.println("\n--- Performance Insights ---");
        for (Student s : students) {
            System.out.println(s.name + " | Total: " + s.total + " | Grade: " + s.grade);
        }
        System.out.println("\nTOPPER: " + topper.name + " with " + topper.total + " marks.");
    }
}
