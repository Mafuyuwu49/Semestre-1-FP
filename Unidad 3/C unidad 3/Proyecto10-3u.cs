using System;

namespace Proyecto10-3u
{
    class Program
    {
        static void Main(string[] args)
        {
            int hrtrab, hrext;
            double pago, sueldosem = 0;
            Console.WriteLine("¿Cuantas horas trabajaste?");
            hrtrab = int.Parse(Console.ReadLine);
            Console.WriteLine("¿Cuánto es el pago por hora?");
            pago = double.Parse(Console.ReadLine());

            if (hrtrab <= 40)
            {
                sueldosem = hrtrab * pago;
                Console.WriteLine("Recibirás un total de $" + sueldosem);
            }
            else
            {
                hrext = hrtrab - 40;
                sueldosem = 40 * pago + hrext * (pago * 2);
                Console.WriteLine("Por trabajar " + hrext + " horas extra, usted recibe un total de $" + sueldosem);
            }
        }
    }
}

