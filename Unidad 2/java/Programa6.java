package com.mycompany.programa6;
import java.util.Scanner; //1

public class Programa6 { //1

    public static void main(String[] args) { //1
        Scanner it = new Scanner(System.in); //1
        double p1,p2,p3,subtotal,total,ivaT; //PASO" VARIABLES
        final double iva=0.16; //2 CONSTANTE
        System.out.print("Escribe el precio 1"); //3
        p1= it.nextDouble(); //4
        System.out.print("Escribe el precio 2"); //3
        p2= it.nextDouble(); //4
        System.out.print("Escribe el precio 3"); //3
        p3= it.nextDouble(); //4
        total = p1 + p2 + p3; //5a
        ivaT = total * iva; //5b
        subtotal = total - ivaT; //5c
        System.out.println("Total: "+total); //6
        System.out.println("IVA: "+ivaT); //6
        System.out.println("SUBTOTAL: "+subtotal); //6
    }
}
