/*Given an unsorted array arr of size n that contains only non negative integers, 
find a sub-array (continuous elements) that has sum equal to s. You mainly need to 
return the left and right indexes(1-based indexing) of that subarray. In case of 
multiple subarrays, return the subarray indexes which come first on moving from left 
to right. If no such subarray exists return an array consisting of element -1. 
INPUT - [1,2,3,7,5], n = 5, s = 12 */

package Aelum_Questions;

import java.util.*;

public class SubarrayWithGivenSum {
    public static List<Integer> findSubarray(int[] arr, int n, int s) {
        int left = 0, currentSum = 0;

        for (int right = 0; right < n; right++) {
            currentSum += arr[right];

            // Shrink window if sum exceeds 's'
            while (currentSum > s && left <= right) {
                currentSum -= arr[left];
                left++;
            }

            // If required sum is found, return 1-based index
            if (currentSum == s) {
                return Arrays.asList(left + 1, right + 1);
            }
        }

        return Arrays.asList(-1); // No subarray found
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int n = arr.length;
        int s = 12;

        System.out.println(findSubarray(arr, n, s));
    }
}
