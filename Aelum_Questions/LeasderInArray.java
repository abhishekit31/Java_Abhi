package Aelum_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeasderInArray {

    void PrintLeaders(int[] arr, int size) {
        // start from the right most index
        int rightMax = arr[size - 1];

        List<Integer> lead = new ArrayList<>();
        lead.add(rightMax);

        // traverse from right to left
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] >= rightMax) {
                // add the element to the list
                lead.add(arr[i]);

                // update the rightMax
                rightMax = arr[i];
            }
        }
        Collections.reverse(lead);
        System.out.println("Leader in the array : " + lead);
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        LeasderInArray obj = new LeasderInArray();
        obj.PrintLeaders(arr, n);
    }

}
// Time Compexity : O(n)