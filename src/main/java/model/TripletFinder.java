package model;

import java.util.Arrays;

/**
 * Created by malang on 29/01/19.
 */
public class TripletFinder {

    /*
    Optimized method
    Finds 3 numbers in the given array, that sum equals to the given value, it it exists
    returns: true if the triplet was found, false otherwise
    */
    public static boolean findTripletInArrayOptimized(int[] array, int value) {
        if (array == null || array.length < 1)
            return false;

        Arrays.sort(array); // sort array using quicksort, allow to remove 1 iteration

        for (int i = 0; i < array.length - 2; i++) {
            // to reduce iterations, we take 2 pointers from both ends until they meet
            int j = i + 1, k = array.length - 1;
            while (j < k) {
                if (array[i] + array[j] + array[k] == value) {
                    System.out.println(String.format("Triplet found: (%s, %s, %s)", array[i], array[j], array[k]));
                    return true;    // triplet found, stop iteration
                }
                if (array[i] + array[j] + array[k] < value) {
                    j++;    // Increment the lower index because we did not reach the expected result (array is sorted)
                } else {
                    k--;    // decrement the upper index because we are above the expected result
                }
            }
        }
        return false;
    }

    /*
    Finds 3 numbers in the given array, that sum equals to the given value, it it exists
    returns: true if the triplet was found, false otherwise
    */
    public static boolean findTripletInArray(int[] array, int value) {
        if (array == null || array.length < 1)
            return false;

        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == value) {
                        System.out.println(String.format("Triplet found: (%s, %s, %s)", array[i], array[j], array[k]));
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
