﻿//Comentarios en una linea
/*Comentarios en bloque:
 * Console en Writeline para imprimir
 * Para imprimir texto sin variable
 * tiene que ir entre "" comillas dobles*/
﻿using System;

namespace P_10 
{
    internal class Programa 10
    {
        static void Main(string[] args)
        {
            int l, P, A, área;
            Console.WriteLine("Introuzca valor de uno de los lados");
            l = Convert.ToInt32(Console.ReadLine());
            P = l * 6;
            Console.WriteLine("Introducir valor de la apotema");
            A = Convert.ToInt32(Console.ReadLine());
            área = (P * A) / 2;
            Console.WriteLine("El área es igual a :" + área);
        }
    }
}