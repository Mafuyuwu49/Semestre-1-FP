//Comentarios en una linea
/*Comentarios en bloque:
 * Console en Writeline para imprimir
 * Para imprimir texto sin variable
 * tiene que ir entre "" comillas dobles*/
using System;

namespace P_7 
{
    internal class Metros
    {
        static void Main(string[] args)
        {
            int M, P;
            Console.WriteLine("¿Cuantos metros se desean convertir?");
            M = Convert.ToInt32(Console.ReadLine());
            P = (int)(M * (3.28 / 1));
            Console.WriteLine(M + "metros convertidos a pies es igual a :" + P);
        }
    }
}
