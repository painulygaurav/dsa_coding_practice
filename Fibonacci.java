public class Fibonacci {

    static int[] F;

    static int fibLoop(int n){
        int a = 0, b = 1, c;
        for(int i = 0; i<n; i++){
            c = b + a;
            a = b;
            b = c;
        }
        return a;
    }

    static int fibRecursion(int n){
        if(n <= 1) return n;
        return fibRecursion(n - 2) + fibRecursion(n - 1);
    }

    static int fibRecMemoization(int n){
        if(n <= 1) return n;
        if(F[n-2] == -1) F[n-2] = fibRecMemoization(n-2);
        if(F[n-1] == -1) F[n-1] = fibRecMemoization(n-1);
        return F[n-2] + F[n-1];

    }

    static int fibRecMemoizationClean(int n){
        if(n <= 1) return n;
        if(F[n] != -1) return F[n];
        F[n] = fibRecMemoizationClean(n-2) + fibRecMemoizationClean(n-1);
        return F[n];
    }

    public static void main(String[] args){
        F = new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    }

}
