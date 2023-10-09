/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_10;

import java.util.Scanner;

public class Programa 10 {
    public static void main(String[] args) {
        int l, P, A, área;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de uno de los lados: ");
        l = scanner.nextInt();
        P = l * 6;
        
        System.out.println("Ingrese el valor de la apotema: ");
        A = scanner.nextInt();
        
        área = (P * A) / 2;
        System.out.println("El área es igual a: " + área);
    }
}





