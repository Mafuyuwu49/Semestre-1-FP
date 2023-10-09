/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_3;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        int c1, c2, c3, c4, c5, c6;
        float promedio;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe Calificacion 1: ");
        c1 = scanner.nextInt();
        System.out.println("Escribe Calificacion 2: ");
        c2 = scanner.nextInt();
        System.out.println("Escribe Calificacion 3: ");
        c3 = scanner.nextInt();
        System.out.println("Escribe Calificacion 4: ");
        c4 = scanner.nextInt();
        System.out.println("Escribe Calificacion 5: ");
        c5 = scanner.nextInt();
        System.out.println("Escribe Calificacion 6: ");
        c6 = scanner.nextInt();
        
        // PASO: CALCULA PROMEDIO
        promedio = (c1 + c2 + c3 + c4 + c5 + c6) / 6.0f;
        
        System.out.println("Tu promedio es: " + promedio);
    }
}