using System;

namespace Programa14-3u
{
    class Program
    {
        static void Main(string[] args)
        {
            int numero = 2;
            int contador = 0;

            while (contador < 100)
            {
                Console.WriteLine(numero);
                numero += 2;
                contador++;
            }
        }
    }
}