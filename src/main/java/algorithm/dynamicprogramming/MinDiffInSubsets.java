package algorithm.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class MinDiffInSubsets {

    private Map<String, Integer> table = new HashMap<>();

    public int findByRecursion(int[] ints) {
        return findDiffByRecursion(ints, ints.length - 1, 0, 0);
    }

    public int findByDynamicProgramming(int[] ints) {
        return findDiffByDynamicProgramming(ints, ints.length - 1, 0, 0);
    }

    private int findDiffByDynamicProgramming(int[] numbers, int n, int s1, int s2) {

        if (n < 0) {
            return abs(s1 - s2);
        }

        String key = String.valueOf(n) + "-" + s1;

        return table.computeIfAbsent(key, v -> {
            int include = findDiffByDynamicProgramming(numbers, n - 1, s1 + numbers[n], s2);
            int exclude = findDiffByDynamicProgramming(numbers, n - 1, s1, s2 + numbers[n]);
            return min(include, exclude);
        });
    }

    private int findDiffByRecursion(int[] numbers, int n, int s1, int s2) {
        System.out.println(String.format("n: %s, s1: %s, s2: %s", n, s1, s2));
        if (n < 0) {
            return abs(s1 - s2);
        }

        int includeI = findDiffByRecursion(numbers, n - 1, s1 + numbers[n], s2);

        int excludeI = findDiffByRecursion(numbers, n - 1, s1, s2 + numbers[n]);

        return min(includeI, excludeI);
    }
    
    /*
    
    Bottom Up:
    ---------------------------------------------------------
    Ex.: [1, 2, 3, 4]
    ---------------------------------------------------------

     _______________________________________________________
    |			0	1	2	3	4	5	6	7	8	9	10	|
    |-------------------------------------------------------|
    |	0	|	1	0	0	0	0	0	0	0	0	0	0	|
    |	1	|	1	1	0	0	0	0	0	0	0	0	0	|
    |	2	|	1	1	1	1	0	0	0	0	0	0	0	|
    |	3	|	1	1	1	1	1	1	1	0	0	0	0	|
    |	4	|	1	1	1	1	1	1	1	1	1	1	1	|
    |-------------------------------------------------------|
    
    */
}
