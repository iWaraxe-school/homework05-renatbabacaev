package Exercise2;

import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        HashSet<String> books = new HashSet<String>();

        books.add("The Hobbit");
        books.add("Harry Potter");
        books.add("Don Quixote");
        books.add("The Hobbit");

        // Printing out hashset
        // There are no duplicates in the output
        System.out.println(books);

        // The Hobbit was not added twice
        for (String book : books)
        {
            System.out.println(book);
        }
    }
}
