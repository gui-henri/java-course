package com.triangles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double triangleXArea = getTriangle(sc);
        double triangleYArea = getTriangle(sc);

        System.out.printf("Triangle X area: %.2f%n", triangleXArea);
        System.out.printf("Triangle Y area: %.2f%n", triangleYArea);

        String greaterTriangle = getGreaterTriangle(triangleXArea, triangleYArea);

        System.out.printf("Greater Triangle: %s%n", greaterTriangle);

        sc.close();
    }

    public static double getTriangle(Scanner sc){

        System.out.println("Enter the measures of the triangle:");

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        return calculateTriangleAreaFromSides(x, y, z);

    }

    public static double calculateTriangleAreaFromSides(double x, double y, double z){
        double delta = (x + y + z) / 2;

        return Math.sqrt(delta * (delta - x) * (delta - y) * (delta - z));
    }
    public static String getGreaterTriangle(double x, double y){

        boolean isEqual = x == y;

        if (isEqual){
            return "They have the same area.";
        }

        return x > y ? "X" : "Y";
    }
}
