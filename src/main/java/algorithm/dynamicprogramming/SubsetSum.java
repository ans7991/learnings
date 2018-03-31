package algorithm.dynamicprogramming;

public class SubsetSum {

    public int numberOfSubsetWithSumAsN(int[] ints, int n, int N) {
        if (N == 0) return 1;
        if (n == -1) return 0;

        if (ints[n] > N) return numberOfSubsetWithSumAsN(ints, n - 1, N);
        return numberOfSubsetWithSumAsN(ints, n - 1, N - ints[n]) + numberOfSubsetWithSumAsN(ints, n - 1, N);
    }
}
