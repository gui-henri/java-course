package com.entradadedados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type an string and a integer");

        String x = sc.next();
        int y = sc.nextInt();

        sc.close();

        System.out.println("You typed: " + x + " and " + y);
    }
}
