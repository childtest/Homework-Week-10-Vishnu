package homework;

/*Declare following two arrylist and compare it.
 ArrayList<String> c1= new ArrayList<String>();
 c1.add("Red");
 c1.add("Green");
 c1.add("Black");
 c1.add("White");
 c1.add("Pink");
 ArrayList<String> c2= new ArrayList<String>();
 c2.add("Red");
 c2.add("Green");
 c2.add("Black");
 c2.add("Pink")*/

import java.util.ArrayList;
import java.util.HashSet;

public class Program_11_CompareArrayList {

    public static void main(String[] args) {


        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // there are we can do tow way to compare array
        // first one with size and second one with element

        // Compare with size
        CompareWithSize(c1, c2);

        // Compare with element
        CompareWithElement(c1, c2);

    }

    private static void CompareWithSize(ArrayList<String> c1, ArrayList<String> c2) {
        if (c1.equals(c2)) {
            System.out.println("Both ArrayLists are equal.");
        } else {
            System.out.println("The ArrayLists are not equal.");
        }
    }

    private static void CompareWithElement(ArrayList<String> c1, ArrayList<String> c2) {
        if (new HashSet<>(c1).equals(new HashSet<>(c2))) {
            System.out.println("Both ArrayLists have the same elements (ignoring order and duplicates).");
        } else {
            System.out.println("The ArrayLists do not have the same elements.");
        }
    }

}

