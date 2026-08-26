public class FastPower {
    public static void main(String[] args){
        System.out.println(fastPower(3,4));
    }

    static int fastPower(int num, int exp){
        if(exp == 0) return 1;
        int r = fastPower(num, exp/2);
        return (exp % 2 == 0) ? (r * r) : (r * r * num);
    }
}
