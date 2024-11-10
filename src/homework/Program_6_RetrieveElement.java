package homework;

/*  Write a Java program to retrieve an element (at a specified index) from a given
 array list*/

import java.util.ArrayList;

public class Program_6_RetrieveElement {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        //specified index  for retrieve
        int index = 2;

        // call method  to retrieve element
        String element = getElementIndex(colors, index);

        System.out.println("Element at index " + index + ": " + element);

    }

    private static String getElementIndex(ArrayList<String> colors, int index) {

        if (index >= 0 && index < colors.size()) {
            return colors.get(index);
        } else {
            return "Invalid Index";
        }
    }
}
