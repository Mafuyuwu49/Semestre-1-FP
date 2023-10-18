using System;

namespace Programa3
{
    internal class Program
{
    static void Main(string[] args)
    {
        int edad;
        Console.WriteLine("Escribe tu edad: ");
        edad = Convert.ToInt32(Console.ReadLine());
            if (edad >= 18)
                Console.WriteLine("Eres mayor de edad!!");
            else
                Console.WriteLine("Eres menor de edad!!");



    }

}

}