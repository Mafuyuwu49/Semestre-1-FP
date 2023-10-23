
package com.mycompany.p13;

import java.util.Scanner;

public class P13 {

    public static void main(String[] args) {
         float cA, cB, cC, cD, cE, cF;
        float promedio;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe Calificacion 1: ");
        cA = scanner.nextFloat();
        System.out.println("Escribe Calificacion 2: ");
        cB = scanner.nextFloat();
        System.out.println("Escribe Calificacion 3: ");
        cC = scanner.nextFloat();
        System.out.println("Escribe Calificacion 4: ");
        cD = scanner.nextFloat();
        System.out.println("Escribe Calificacion 5: ");
        cE = scanner.nextFloat();
        System.out.println("Escribe Calificacion 6: ");
        cF = scanner.nextFloat();
        
        promedio = (cA + cB + cC + cD + cE + cF) / 6.0f;
        if (promedio>=70.0)
        System.out.println("Felicidades, aprobaste :D " + promedio);
        else
            System.out.println("Hechale ganas karnal, la recuperas en la siguiente :/ :" + promedio);
    }
}