package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortByFrequency {

    public int[] sort(int[] a) {
        Map<Integer, Integer> count = new HashMap<>();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>(a.length);

        for (int element : a) {
            count.merge(element, 1, (a1, b) -> a1 + b);
            lists.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            lists.get(entry.getValue()).add(entry.getKey());
        }

        int r = 0;
        int[] result = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            if (!lists.get(i).isEmpty()) {
                Collections.sort(lists.get(i));
                for (Integer j : lists.get(i)) {
                    for (int k = i; k > 0; k--)
                        result[r++] = j;
                }
            }
        }
        return result;
    }
}
