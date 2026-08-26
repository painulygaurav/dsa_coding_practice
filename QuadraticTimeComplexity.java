import java.util.Arrays;

public class QuadraticTimeComplexity {
    public static void main(String[] args) {
        int[][] A = {{1,2},{3,4}};
        int[][] B = {{1,1},{1,1}};
        System.out.println(Arrays.deepToString(add(A, B, 2)));
    }

    static int[][] add(int[][] A, int[][] B, int n) {
        int[][] C = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                C[i][j] = A[i][j]+B[i][j];
            }
        }
        return C;
    }
}
