package com.saidadedados;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int y = 32;

        System.out.println("Para escrever uma mensagem é simples assim!!");
        System.out.println(y);

        double x = 10.35784;

        System.out.println(x);

        /*O programa rodará usando padrões americanos,
        * por exemplo, "10.36" ao inves de "10,36"
        * */
        Locale.setDefault(Locale.US);

        // printf: texto formatado
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

    }
}
