

package com.mycompany.proyecto6u3;

import java.util.Scanner;
public class Proyecto6u3 {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N;
        System.out.println("Ingrese el un número");
        N = sc.nextInt();

        if (N % 2 == 0)
        System.out.println("El número es par");
        else
        System.out.println("El número es impar");
    }
}
