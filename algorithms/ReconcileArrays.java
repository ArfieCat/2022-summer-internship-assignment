import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question 2:
 * 
 * Reconcile Arrays.
 * Given two unsorted integer arrays, print out the numbers that are NOT contained in the
 * other array.
 */

class ReconcileArrays 
{
    public static void main(String[] args) 
    {
	    // Test cases go here.
    }

    /**
     * Approach:
     * 
	 * 1. Remove duplicates and cast both arrays to List to access useful methods.
	 * 2. Remove all ints present in one List from the other for both Lists.
	 * 3. Format and print the remaning ints.
     */

    static void reconcileHelper(int[] a, int[] b)
    {
        // Remove duplicates from both arrays and cast to List. (Stream: Java 8+)
        List<Integer> aList = Arrays.stream(a).distinct().boxed().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(b).distinct().boxed().collect(Collectors.toList());

        // Clone either List for later use as the Lists will be modified in-place.
        List<Integer> aCopy = new ArrayList<>(aList);

        // Remove any shared ints from both arrays.
        aList.removeAll(bList);
        bList.removeAll(aCopy);

        // Print any remaining ints in the prescribed format. (Text block literal: Java 15+)
        System.out.println(String.format(
            """
            Numbers in array a that aren't in array b:
            %s
        
            Numbers in array b that aren't in array a:
            %s
            """,
            // Arrays are printed without commas or delimiting brackets.
            aList.toString().replaceAll("[\\[,\\]]", ""),
            bList.toString().replaceAll("[\\[,\\]]", "")
        ));
    }
}