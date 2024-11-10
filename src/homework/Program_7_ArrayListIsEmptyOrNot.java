package homework;

/* Write a Java program to test if an array list is empty or not*/

import java.util.ArrayList;

public class Program_7_ArrayListIsEmptyOrNot {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        checkIsEmpty(list);

        list.add("Banna");

        checkIsEmpty(list);


    }

    private static void checkIsEmpty(ArrayList<String> list) {

        System.out.println(list.isEmpty() ? "The ArrayList is empty." :
                "The ArrayList is not empty.");
    }

}
