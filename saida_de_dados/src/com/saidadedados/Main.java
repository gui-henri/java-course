package com.saidadedados;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int y = 32;

        System.out.println("Writing in a program is this easy!!");
        System.out.println(y);

        double x = 10.35784;

        System.out.println(x);

        /*Running with american standards,
        * like showing "10.36" instead "10,36"
        * */
        Locale.setDefault(Locale.US);

        // printf: formated text
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        System.out.println("Concatenating: " + x + y); // the value isn't added, just concatenated

        System.out.printf("Concatenating using format: %.2f%n", x);

        String name = "Sarah";
        byte age = 19;
        double money = 9999.0;
        System.out.printf("%s is %d years old and have $%.2f%n", name, age, money);
    }
}
