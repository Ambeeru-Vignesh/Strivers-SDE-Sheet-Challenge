import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // LinkedList<int[]> list = new LinkedList<>();
        ArrayList<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {

            // if(list.isEmpty() || list.getLast()[1] < interval[0]){
            // list.add(interval);
            // }
            // else {
            // list.getLast()[1] = Math.max(list.getLast()[1],interval[1]);
            // }

            if (list.isEmpty() || list.get(list.size() - 1)[1] < interval[0]) {
                list.add(interval);
            } else {
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], interval[1]);
            }

        }

        return list.toArray(new int[list.size()][]);

    }
}