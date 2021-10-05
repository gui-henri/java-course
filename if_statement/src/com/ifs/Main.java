package com.ifs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas horas são?");
        int horas = sc.nextInt();

        if (horas < 12) {
            System.out.println("Bom dia!!");
        } else if (horas < 18) {
            System.out.println("Boa tarde!!");
        } else {
            System.out.println("Boa noite!!");
        }

        System.out.println("Diga o dia da semana");

        int input = sc.nextInt();
        
        String day;

        switch (input) {
            case 1 -> day = "Domingo";
            case 2 -> day = "Segunda";
            case 3 -> day = "Terça";
            case 4 -> day = "Quarta";
            case 5 -> day = "Quinta";
            case 6 -> day = "Sexta";
            case 7 -> day = "Sábado";
            default -> day = "Dia inválido";
        }

        System.out.println(day);
        
        sc.close();
    }
}
