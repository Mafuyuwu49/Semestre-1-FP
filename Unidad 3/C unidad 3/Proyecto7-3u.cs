using System;

namespace Proyecto7-3u
{
    class Program
    {
        static void Main(string[] args)
        {
            double T;
            Console.WriteLine("¿Qué temperatura hay hoy?");
            T = double.Parse(Console.ReadLine());

            if (T >= 27)
            {
                Console.WriteLine("¡Hace calor!, ¿vamos por un helado?");
            }
            else if (T < 27 && T >= 20)
            {
                Console.WriteLine("¡El clima hoy es agradable!");
            }
            else
            {
                Console.WriteLine("!Hace frío! deberíamos abrigarnos.");
            }
        }
    }
}

