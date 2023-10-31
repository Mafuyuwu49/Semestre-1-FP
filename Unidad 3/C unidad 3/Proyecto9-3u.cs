using System;

namespace Proyecto9-3u
{
    class Program
    {
        static void Main(string[] args)
        {
            double hr, suma = 0;
            Console.Write("Escribe las horas: ");
            hr = double.Parse(Console.ReadLine());

            if (hr >= 0.01 && hr <= 1.00)
                suma += 5;
            else if (hr >= 1.01 && hr <= 2.00)
                suma += 10;
            else if (hr >= 2.01 && hr <= 3.00)
                suma += 15;

            Console.WriteLine("Total a pagar: $" + suma);
        }
    }
}

