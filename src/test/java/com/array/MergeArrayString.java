package com.array;

import java.util.Arrays;

public class MergeArrayString {

	// Method to merge three arrays into one
    public static String[] mergeThreeArrays(String[] arr1, String[] arr2, String[] arr3) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int length3 = arr3.length;
        
        String[] mergedArray = new String[length1 + length2 + length3];
        
        // Copy elements of the first array
        System.arraycopy(arr1, 0, mergedArray, 0, length1);
        
        // Copy elements of the second array
        System.arraycopy(arr2, 0, mergedArray, length1, length2);
        
        // Copy elements of the third array
        System.arraycopy(arr3, 0, mergedArray, length1 + length2, length3);
        
        return mergedArray;
    }

	public static void main(String[] args) {
		 String[] array1 = {"1", "2", "3"};
	        String[] array2 = {"4", "5", "6"};
	        String[] array3 = {"7", "8", "9"};

	        String[] mergedArray = mergeThreeArrays(array1, array2, array3);

	        // Print the merged array
	        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

	}

}
