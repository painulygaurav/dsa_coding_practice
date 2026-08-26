public class FrequencyCountAlgo {
    public static void main(String[] args){
        int numberOfElement = 5;
        int[] arr = new int[numberOfElement];
        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(sum(arr,numberOfElement));
    }

    static int sum(int[] a, int n){
        int s = 0;
        for(int i = 0; i<n; i++){
            s = s + a[i];
        }
        return s;
    }
}
