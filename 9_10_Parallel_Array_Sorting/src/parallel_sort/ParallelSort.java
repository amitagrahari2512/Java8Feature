package parallel_sort;

import java.util.Arrays;

//Java provides a new additional feature in Array class which is used to sort array elements parallel.
//New methods has added to java.util.Arrays package that use the JSR 166 Fork/Join parallelism common pool to 
//provide sorting of arrays in parallel.
//The methods are called parallelSort() and are overloaded for all the primitive data types and Comparable objects.

//Parallel Sort uses Fork/Join framework introduced in Java 7 ,
//to assign the sorting tasks to multiple threads available in the thread pool. 
//Fork/Join implements a work stealing algorithm where in a idle thread can steal tasks queued up in another thread.
public class ParallelSort {
	public static void main(String[] args) {  
        // Creating an integer array   
        int[] arr = {5,8,1,0,6,9};  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
        // Sorting array elements parallel  
        //It sorts the specified array into ascending numerical order.
        Arrays.parallelSort(arr);  
        System.out.println("\nArray elements after sorting");  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
    }  
}
