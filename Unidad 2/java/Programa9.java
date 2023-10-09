/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_9;

import java.util.Scanner;

public class Programa9 {
    public static void main(String[] args) {
        int a = 1, b = 2, l, o, v, e;
        
        l = a + b;
        System.out.println("La suma es igual a: " + l);
        o = a - b;
        System.out.println("La resta es igual a: " + o);
        v = a * b;
        System.out.println("La multiplicación es igual a: " + v);

        if (b != 0) {
            e = a / b;
            System.out.println("La división es igual a: " + e);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}





