package com.exercices;

import com.exercices.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        st.name = sc.nextLine();
        st.grade1 = sc.nextDouble();
        st.grade2 = sc.nextDouble();
        st.grade3 = sc.nextDouble();

        System.out.println(st.finalGrade());
        System.out.println(st.verifyApproval());

    }
}
