import java.util.Arrays;
import java.util.Collections;

public class DescendingArray {

	public static void main(String[] args) {
		// Initializing the array
        Integer array[] = { 6,8,14,3};
  
        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());
  
        // Printing the elements
        System.out.println(Arrays.toString(array));
    }
}	
	
	


