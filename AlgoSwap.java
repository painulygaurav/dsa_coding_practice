public class AlgoSwap {
    public static void main(String[] args) {
        swap(10,20);
    }

    static void swap(int x, int y){
        int temp;
        temp = x;
        System.out.println("x = " + x + " y = " + y);
        x = y;
        y = temp;
        System.out.println("after swapping...");
        System.out.println("x = " + x + " y = " + y);
    }
}
