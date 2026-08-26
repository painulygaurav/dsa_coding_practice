import java.util.Arrays;

public class Combination {

    private static final int MAX_N = 101;
    private static final int MAX_R = 101;

    // Constant-sized 2D array to hold state combinations
    private static final int[][] memo = new int[MAX_N][MAX_R];

    // Static block to initialize the matrix once when the class loads
    static {
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
    }

    static int comb(int n,int r){
        if(r == 0 || r == n) return 1;
        return comb(n-1,r-1) + comb(n-1, r);
    }

    static int combPascal(int n, int r) {
        // base case
        if(r == 0 || r == n) return 1;

        // check if this specific n,r combination is already solved
        if(memo[n][r] != -1) return memo[n][r];
        memo[n][r] = combPascal(n-1, r-1) + combPascal(n-1, r);
        return memo[n][r];
    }

    public static void main(String[] args){
        // System.out.println(comb(40,25)); // It will take 1-3 minutes. Not optimized answer = 1570639392
        System.out.println(combPascal(40,25)); // Less than a millisecond answer = 1570639392
    }
}
