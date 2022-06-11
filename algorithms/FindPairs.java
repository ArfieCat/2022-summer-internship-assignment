import java.util.Arrays;
import java.util.HashMap;

/**
 * Question 1:
 * 
 * Find all pairs for a given sum.
 * Create a function that accepts an array of integers and a target sum.
 * The function will print all pairs of integers in the array whose sum is equal to the target sum.
 */

class FindPairs 
{
    public static void main(String[] args) 
    {
	    // Test cases go here.
    }

    /**
     * Approach:
     * 
     * 1. Remove duplicates from `testArray`.
     *     a. Edge case: if `testArray` has less than 2 unique items, there are no pairs.
     * 
     * 2. Iterate through `testArray`, using a HashMap to track potential ("have x, need y") pairs.
     *     a. If the current int was already needed, print the pair.
     *     b. Otherwise, calculate the difference needed to reach `targetSum` and put the potential
     *        pair in the HashMap.
     */

    static void findPairs(int[] testArray, int targetSum)
    {
        // Remove duplicates from `testArray`. (Stream: Java 8+)
        testArray = Arrays.stream(testArray).distinct().toArray();

        // If length is less than 2, there are no pairs.
        if (testArray.length < 2) return;

        /* 
         * Value: The current int from `testArray`.
         * Key:   The difference of that int and `targetSum`, needed to make a pair.
         * 
         * Note that the key and value are swapped. This is because Java HashMaps have many-to-one
         * mappings, so it is easier to get values from keys than vice-versa, which is relevant
         * during the iteration step.
         * 
         * In practice, this could be made clearer by using a custom or third-party one-to-one Map.
         */
        HashMap<Integer, Integer> pairs = new HashMap<>();

        // Iterate through `testArray`.
        for (int i : testArray) 
        {
            if (pairs.containsKey(i))
            {
                // If `i` was already needed (exists as a key), print the pair.
                System.out.println("(" + i + ", " + pairs.get(i) + ")");
            }
            else
            {
                // Otherwise, calculate the difference and put in the potential pair.
                pairs.put(targetSum - i, i);
            }
        }
    }
}