
package com.mycompany.proyecto9u3;

import java.util.Scanner;
public class Proyecto9u3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hr,suma=0;
        System.out.print("Escribe las horas: ");
        hr=sc.nextDouble();
        if(hr>=0.01 && hr<=1.00)
            suma=suma+5;
        else if (hr>=1.01 && hr<=2.00);
            suma=suma+10;
         
            if (hr>=2.01 && hr<=3.00)
                
            System.out.print("Total a pagar $ "+suma);
        
    }
}
