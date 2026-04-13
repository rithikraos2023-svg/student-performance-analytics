package com.student.app;

public class Student {
    String name;
    double cat, assignment, fat, total;
    String grade;

    public Student(String name, double cat, double assignment, double fat) {
        this.name = name;
        this.cat = cat;
        this.assignment = assignment;
        this.fat = fat;
        this.total = cat + assignment + fat;
        this.grade = calculateGrade(total);
    }

    private String calculateGrade(double total) {
        if (total >= 90) return "S";
        if (total >= 80) return "A";
        if (total >= 70) return "B";
        if (total >= 60) return "C";
        return "F";
    }
}
