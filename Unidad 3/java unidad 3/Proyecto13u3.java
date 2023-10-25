
package com.mycompany.proyecto13u3;

import java.util.Scanner;
public class Proyecto13u3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos= 0;
        int negativos = 0;
        
        for (int i = 0; i<5; i++){
            System.out.println("Introduzca el numero: "+ (i +1) + ":");
            int numero = sc.nextInt();
            
            if (numero>0){
                positivos ++;
            } else if (numero<0){
                negativos ++;
            }
        }
        System.out.println("Cantidad de numeros positivos: " + positivos);
        System.out.println("Cantidad de numeros negativos: " + negativos);
    }
}
 