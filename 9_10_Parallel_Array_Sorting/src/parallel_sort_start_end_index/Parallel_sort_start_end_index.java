package parallel_sort_start_end_index;

import java.util.Arrays;


//In the following example, we are passing starting and end index of the array. 
//The first index is inclusive and end index is exclusive

//It throws IllegalArgumentException if start index > end index.

//It throws ArrayIndexOutOfBoundsException if start index < 0 or end index > a.length.

public class Parallel_sort_start_end_index {
	public static void main(String[] args) {  
        // Creating an integer array   
        int[] arr = {5,8,1,0,6,9,50,-3};  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
        // Sorting array elements parallel and passing start, end index 
        //It sorts the specified range of the array into ascending numerical order. 
        //The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. 
        //If fromIndex == toIndex, the range to be sorted is empty.
        Arrays.parallelSort(arr,0,4);  
        System.out.println("\nArray elements after sorting");  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
    }  
}
