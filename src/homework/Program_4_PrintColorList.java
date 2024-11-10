package homework;

/*Write a Java program to create a new array list, add some colours (string) and
 printout the collection using for each loop.*/

import java.util.ArrayList;

public class Program_4_PrintColorList {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Colors in the List : ");

        for (String name : colors)
            System.out.println(name);

    }
}
