/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

/**
 *
 * @author keyew7019
 */
public class A3Q4 {

    public void countingSort(int[] array) {
        //create a tracker array
        int[] count = new int[101];
        // for each integer in array
        for (int i = 0; i < array.length; i++) {
            // add 1 to the position == integers value in count array    
            count[array[i] - 1] += 1;
        }
        // output the sorted numbers
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < count[i]; j++) {
                System.out.println(i);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        A3Q4 test = new A3Q4();

        // making a random array of ints
        int[] numbers = new int[101];
        for (int i = 0; i < numbers.length; i++) {
            // make a random number
            numbers[i] = (int) (Math.random() * 101);
        }
        // BEFORE
        System.out.println("BEFORE: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("");

        //AFTER
        System.out.println("AFTER: ");
        // SORT HERE
        test.countingSort(numbers);


    }
}
