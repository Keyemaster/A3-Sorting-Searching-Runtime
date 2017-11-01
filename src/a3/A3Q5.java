/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

import java.util.Scanner;

/**
 *
 * @author keyew7019
 */
public class A3Q5 {

    public void swap(String[] array, int p1, int p2) {

        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    // insertion sort
    public void insertionSort(String[] array) {

        // start going through the array
        // store position
        for (int i = 0; i < array.length - 1; i++) {
            // take the original position and add 1
            int position = i;
            // check values beside each other
            while (position >= 0 && array[position].compareTo(array[position + 1]) > 0) {
                // if out of place, swap it downwards
                // until correct position is reached
                swap(array, position, position + 1);
                position--;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        A3Q5 test = new A3Q5();

        // making a array of strings
        String[] words = new String[]{"p",
            "n",
            "a",
            "m"};

        // BEFORE
        System.out.println("BEFORE: ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("");
        // SORT HERE
        test.insertionSort(words);

        // AFTER
        System.out.println("AFTER: ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
