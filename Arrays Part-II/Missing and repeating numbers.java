import java.util.*;
import java.io.*;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];

        for (int num : arr) {
            if (set.contains(num)) {
                result[1] = num;
            } else {
                set.add(num);
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                result[0] = i;
                break;
            }
        }

        return result;
    }
}