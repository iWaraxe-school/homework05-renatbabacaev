package Exercise5;

import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<String, HashMap<String, Integer>> countries = new HashMap<>();

        countries.put("Moldova", new HashMap<String, Integer>());
        countries.get("Moldova").put("Chișinău", 3_022_962);

        countries.put("Finland", new HashMap<String, Integer>());
        countries.get("Finland").put("Helsinki", 5_604_558);

        countries.put("Japan", new HashMap<String, Integer>());
        countries.get("Japan").put("Tokyo", 123_753_041);


        // Iterate through country names
        for (String country : countries.keySet())
        {
            System.out.println("Country: " + country);

            // Iterate through country's capital
            for (String capital : countries.get(country).keySet())
            {
                System.out.println("Capital: " + capital);
                System.out.println("Population: " + countries.get(country).get(capital));
            }
            System.out.println();
        }
    }
}
