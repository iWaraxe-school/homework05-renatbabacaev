package Exercise3;

import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> students = new HashMap<String, Integer>();

        students.put("Ion", 100);
        students.put("Mihai", 50);
        students.put("Anna", 99);
        students.put("Vlad", 89);
        students.put("Andrei", 33);

        for (String student : students.keySet())
        {
            if (students.get(student) >= 90)
            {
                System.out.println(student + " has score >= 90 (" + students.get(student) + ")");
            }
        }
    }
}
