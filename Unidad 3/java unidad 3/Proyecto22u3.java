
package com.mycompany.proyecto22u3;

import java.util.Scanner;
public class Proyecto22u3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int num;
        do{
            System.out.println("Ingrese el valor del numero: ");
            num = sc.nextInt();
            suma=suma+num;
        }while (num!=0);
            System.out.println( "Resultado: "+suma);
        }
        
    }

