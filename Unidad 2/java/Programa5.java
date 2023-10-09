/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_5;

import java.util.Scanner;

import java.util.Scanner;

public class Programa 5 {
    public static void main(String[] args) {
        int a, b, c;
        float area, perimetro;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba la longitud a: ");
        a = scanner.nextInt();
        System.out.println("Escriba la longitud b: ");
        b = scanner.nextInt();
        System.out.println("Escriba la longitud c: ");
        c = scanner.nextInt();

        perimetro = a + b + c;
        System.out.println("El perimetro del triángulo es: " + perimetro);

        area = (a * b) / 2.0f;
        System.out.println("El área del triángulo es: " + area);
    }
}