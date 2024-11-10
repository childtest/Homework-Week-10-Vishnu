package homework;

/* Write a Java program to iterate through all elements in an array list using
 Iterater.*/

import java.util.ArrayList;
import java.util.Iterator;

public class Program_5_IteraterList {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        Iterator<String> iterator = colors.iterator();

        System.out.println("Colors in the List : ");

        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
