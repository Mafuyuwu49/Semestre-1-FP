/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_7;

import java.util.Scanner;

public class Programa 7 {
    public static void main(String[] args) {
        int M, P;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos metros se desean convertir?");
        M = scanner.nextInt();

        P = (int)(M * (3.28 / 1));
        System.out.println(M + " metros convertidos a pies es igual a: " + P);
    }
}