
package com.mycompany.proyecto16u3;
import java.util.Scanner;

public class Proyecto16u3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=1;
        int horas, pago, sueldo ;
        
            System.out.println("Ingrese la cantidad de horas trabajadas: ");
            horas = sc.nextInt();
            System.out.println("Ingrese el pago por hora:  ");
            pago = sc.nextInt();
            sueldo = horas * pago;
        
        System.out.println("Sueldo de trabajor: "+sueldo);
    }
}
