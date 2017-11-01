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
public class A3Q3 {
    
    public void swap(int[] array, int p1, int p2){
        
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
    
    public void selectionSort(int[] array){
        // to keep track of which position we are sorting
        for(int position = 0; position < array.length; position++){
            // go through the rest looking for a smaller number
            int j = position;
            for(int i = position+1; i < array.length && i >= j; i++){
                // have we found smallest?
                if(array[i] < array[j]){
                    // make the position j what the i position was
                    j = i;
                }
            }
            // swap numbers
            swap(array, j, position);
        }
        
    }
    
    public int countOnes(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            
            if(array[i] == 1){
                count = count + 1;
            }
            
            
        }
        return count;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        A3Q3 test = new A3Q3();
        
        // making a random array of ints
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            // make a random number
            numbers[i] = (int)(Math.random()*2);
            
        }
        // BEFORE
        System.out.println("BEFORE: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        // SORT HERE
        test.selectionSort(numbers);
        
        // AFTER
        System.out.println("AFTER: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        int co = test.countOnes(numbers);
        System.out.println("There are " + co + " ones in the array");
        
        
    }
}
