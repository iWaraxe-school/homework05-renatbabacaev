package Exercise4;

import java.util.LinkedList;

public class Main
{
    public static void displayQueue()
    {

    }

    public static void main(String[] args)
    {
        LinkedList<String> books = new LinkedList<>();

        books.add("The Hobbit");
        books.add("Harry Potter");
        books.add("Around The World In Eighty Days");
        books.add("Don Quixote");
        books.add("1984");
        System.out.println(books);

        books.removeLast();
        books.removeLast();
        System.out.println(books);

        books.add("Moby-Dick");
        books.add("War and Peace");
        books.add("Iliad");
        System.out.println(books);

        // The first in the queue in The Hobbit
        // add() method adds entry at the end of the queue
    }
}
