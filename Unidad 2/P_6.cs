//Comentarios en una linea
/*Comentarios en bloque:
 * Console en Writeline para imprimir
 * Para imprimir texto sin variable
 * tiene que ir entre "" comillas dobles*/
using System;

namespace P_6 
{
    internal class Grados
    {
        static void Main(string[] args)
        {
            int C, F;
            Console.WriteLine("Inserte el valor de los grados centigrados");
            C = Convert.ToInt32(Console.ReadLine());
            F = (C * 9/5) + 32;
            Console.WriteLine("Los grados en fahrenheit son :" + F);

        }
    }
}
