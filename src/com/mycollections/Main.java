/**
 * Java program to create, update, and delete TreeMap.
 */

package com.mycollections;

import java.util.Map;
import java.util.TreeMap;

/**
 *  Main class.
 */

public class Main {

    // JVM entry point,.
    public static void main(String[] args) {

        // Create.
        Map<Double, String> myMap = new TreeMap<>();

        // Add.
        myMap.put(1.2, "Peanuts");
        myMap.put(3.2, "Walnuts");
        myMap.put(4.9, "Cashew");

        // Display.
        System.out.println(myMap); // Output: {1.2=Peanuts, 3.2=Walnuts, 4.9=Cashew}

        // Delete.
        myMap.remove(3.2);

        // Display.
        System.out.println(myMap); // Output: {1.2=Peanuts, 4.9=Cashew}

        // Replace.
        myMap.replace(4.9, "Almonds");

        // Display.
        System.out.println(myMap); // Output: {1.2=Peanuts, 4.9=Almonds}

        // Clear.
        myMap.clear();

    }
}