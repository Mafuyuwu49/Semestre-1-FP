
package com.mycompany.proyecto10u3;

import java.util.Scanner;
public class Proyecto10u3 {

     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hrtrab, hrext;
            double pago, sueldosem = 0;
            System.out.println("¿Cuantas horas trabajaste?");
            hrtrab = sc.nextInt();
            System.out.println("¿Cuanto es el pago por hora?");
            pago = sc.nextInt();

            if (hrtrab <= 40 )
            {
                sueldosem = hrtrab * pago;
                System.out.println("Recibiras un total de $" + sueldosem);
            }
            else
            {
                hrext = hrtrab - 40;
                sueldosem = 40 * pago + hrext * (pago * 2);
                System.out.println("Por trabajar " + hrext + " horas extra, usted recibe un total de $" + sueldosem);
            }
    }
}

