/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_6;
import java.util.Scanner;

public class Grados {
    public static void main(String[] args) {
        int C, F;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserte el valor de los grados centígrados: ");
        C = scanner.nextInt();

        F = (C * 9/5) + 32;
        System.out.println("Los grados en Fahrenheit son: " + F);
    }
}






