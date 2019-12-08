import java.util.Arrays;

public class BranchPredictor {

    public static void main(String[] args) {
        final int size = 100_000_000;
        final int halfSize = size / 2;

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }

        // https://stackoverflow.com/questions/11227809/why-is-processing-a-sorted-array-faster-than-processing-an-unsorted-array/11227902#11227902
        // uncomment .sort() and watch how fast the for loop will run
//        Arrays.sort(arr);

        long sum = 0;
        long time = System.currentTimeMillis();
        for (int val : arr) {
            if (val > halfSize) {
                sum += val;
            }
        }
        System.out.println(System.currentTimeMillis() - time);
        System.out.println(sum);
    }

}
