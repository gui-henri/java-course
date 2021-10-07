package com.loops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;

        while (x!= 0){
            soma += x;
            x = sc.nextInt();
        }
        System.out.println(soma);

        x = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < x; i++){
            int y = sc.nextInt();
            sum += y;
        }

        System.out.println(sum);

        sc.close();
    }
}
