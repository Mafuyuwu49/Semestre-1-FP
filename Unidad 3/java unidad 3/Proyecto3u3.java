
package com.mycompany.proyecto3u3;

import java.util.Scanner;
public class Proyecto3u3 {



    public static void main(String[] args) {
        int edad;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu edad: ");
        edad = scanner.nextInt();

        if (edad >= 18)
            System.out.println("Eres mayor de edad!!");
        else
            System.out.println("Eres menor de edad!!");
    }
}
