
package com.mycompany.proyecto13;

import java.util.Scanner;

public class Proyecto13 {

    public static void main(String[] args) {
         int cA, cB, cC, cD, cE, cF;
        float promedio;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe Calificacion 1: ");
        cA = scanner.nextInt();
        System.out.println("Escribe Calificacion 2: ");
        cB = scanner.nextInt();
        System.out.println("Escribe Calificacion 3: ");
        cC = scanner.nextInt();
        System.out.println("Escribe Calificacion 4: ");
        cD = scanner.nextInt();
        System.out.println("Escribe Calificacion 5: ");
        cE = scanner.nextInt();
        System.out.println("Escribe Calificacion 6: ");
        cF = scanner.nextInt();
        
        promedio = (cA + cB + cC + cD + cE + cF) / 60f;
        if (promedio>=7.0)
        System.out.println("Felicidades, aprobaste :D " + promedio);
        else
            System.out.println("Hechale ganas karnal, la recuperas en la siguiente :/ :" + promedio);
    }
}
    

