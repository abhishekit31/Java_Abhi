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
