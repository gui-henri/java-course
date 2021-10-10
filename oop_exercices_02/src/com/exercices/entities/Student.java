package com.exercices.entities;

public class Student {
    public String name;
    public double grade1, grade2, grade3;

    public double finalGrade(){
        return this.grade1 + this.grade2 + this.grade3;
    }
    public String verifyApproval(){
        if (finalGrade() < 60){
            return String.format("Failed: missing %.2f points.%n", 60 - finalGrade());
        }
        return "Pass";
    }
}
