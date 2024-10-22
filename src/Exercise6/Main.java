package Exercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            numbers.add((new Random()).nextInt(100));
        }

        System.out.println("Numbers:");
        for (Integer i : numbers)
        {
            System.out.println(i);
        }

        System.out.println("\nOrdered Numbers:");
        Collections.sort(numbers);
        for (Integer i : numbers)
        {
            System.out.println(i);
        }

        System.out.println("\nShuffled Numbers:");
        Collections.shuffle(numbers);
        for (Integer i : numbers)
        {
            System.out.println(i);
        }
    }
}
