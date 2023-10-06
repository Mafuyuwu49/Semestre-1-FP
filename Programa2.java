 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa2;
import java.util.Scanner;
/**
 *
 * @author Instalacion
 */
public class Programa2 { //Paso 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //PASO1
        int a, b, suma; //PASO 2 Declarar variables
        System.out.print("Escribe un numero A: " ); //PASO3
        a = sc.nextInt(); //PASO 4- ASIGNAR VALOR
        System.out.println("Escribe un numero B: " ); //PASO3
        b = sc.nextInt(); //PASO 4- ASIGNAR VALOR
        suma=a+b; //PASO5-OPERACION
        System.out.println("Resultado: "+suma);
    }
}
