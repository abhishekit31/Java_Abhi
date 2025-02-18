package Aelum_Questions;

import java.util.HashSet;

public class FindTriplet {

    public int CountTriplet(int[] arr, int n) {
        int count = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (set.contains(arr[i] + arr[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = { 1, 5, 3, 2 };

        FindTriplet obj = new FindTriplet();
        System.out.println(obj.CountTriplet(arr, n));

    }
}
// Time Complexity: O(n)
