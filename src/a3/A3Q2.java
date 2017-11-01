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
public class A3Q2 {

    public void swap(int[] array, int p1, int p2) {

        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void selectionSort(int[] array) {
        // to keep track of which position we are sorting
        for (int position = 0; position < array.length; position++) {
            // go through the rest looking for a smaller number
            int j = position;
            for (int i = position + 1; i < array.length && i >= j; i++) {
                // have we found smallest?
                if (array[i] < array[j]) {
                    // make the position j what the i position was
                    j = i;
                }
            }
            // swap numbers
            swap(array, j, position);
        }

    }

    public int smallestMissingNumber(int[] array) {


        for (int count = 0; count < array.length; count++) {
            if (array[count] != count) {
                return count;
            }
        }
        return -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        A3Q2 test = new A3Q2();

        // making a random array of ints
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            // make a random number
            //numbers[i] = (int)(Math.random()*101);
            numbers[i] = in.nextInt();

        }
        // BEFORE
        System.out.println("BEFORE: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // SORT HERE
        test.selectionSort(numbers);

        // AFTER
        System.out.println("AFTER: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int mn = test.smallestMissingNumber(numbers);
        System.out.println("The smallest missing number in the array is: " + mn);


    }
}
