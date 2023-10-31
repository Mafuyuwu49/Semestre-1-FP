package com.mycompany.proyecto24u3;

import java.util.Scanner;

public class Proyecto24u3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Ingrese un número");
        N = sc.nextInt();

        do {
            if (N % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }
            N = sc.nextInt();
        } while (N >= 0);
    }
}
     