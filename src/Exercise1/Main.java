package Exercise1;

import java.util.ArrayList;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            numbers.add((new Random()).nextInt());
        }

        System.out.println("Printing out generated numbers");
        for (int i = 0; i < 10; i++)
        {
            if (i % 2 == 0)
            {
                System.out.printf("%d\tEven\n", numbers.get(i));
            } else
            {
                System.out.printf("%d\tOdd\n", numbers.get(i));
            }
        }

        System.out.println("\nPrinting out even numbers");
        for (int i = 0; i < 10; i += 2)
        {
            System.out.println(numbers.get(i));
        }
    }
}