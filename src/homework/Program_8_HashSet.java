package homework;

/* Use aHashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 else)*/

import java.util.HashSet;

public class Program_8_HashSet {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(4);
        set.add(7);
        set.add(8);

        System.out.println("Number between 1 and 10 that are in the set : ");

        for (int i = 1; i <= 10; i++)
            if (set.contains(i))
                System.out.println(i + " is in the set.");
            else
                System.out.println(i + " is not in the set.");

    }
}
