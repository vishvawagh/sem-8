
import java.util.*;
import java.util.stream.IntStream;

public class ParallelArrayOps {

    public static long parallelSum(List<Integer> arr) {
        return arr.parallelStream().mapToLong(Integer::longValue).sum();
    }

    public static int parallelMax(List<Integer> arr) {
        return arr.parallelStream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
    }

    public static int parallelMin(List<Integer> arr) {
        return arr.parallelStream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);
    }

    public static double parallelAverage(List<Integer> arr) {
        return arr.parallelStream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        long sum = parallelSum(arr);
        int max_val = parallelMax(arr);
        int min_val = parallelMin(arr);
        double average = parallelAverage(arr);

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max_val);
        System.out.println("Min: " + min_val);
        System.out.println("Average: " + average);
    }
}
