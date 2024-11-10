package homework;

/* Create a HashMap object called people that will store String keys and Integer
 values: And use for each loop to iterate the value from Map*/

import java.util.HashMap;
import java.util.Map;

public class Program_9_HashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>();
        people.put("Suresh", 25);
        people.put("Ramesh", 30);
        people.put("Kamlesh", 28);
        people.put("Kalpesh", 22);

        //each loop to iterate the value from Map
        for (Map.Entry<String, Integer> entry : people.entrySet())
            System.out.println(entry.getKey() + " is " + entry.getValue() + " year old.");
    }
}
