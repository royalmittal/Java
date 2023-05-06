import java.util.*;

public class ArraySum {

    // ===========================================================================

    // BRUTE FORCE APPROACH
    public static int bruteForceSum(int marks[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            for (int j = i; j < marks.length; j++) {
                for (int k = i; k <= j; k++) {
                    currSum += marks[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println("Maximum Sum=" + maxSum);
        }
        return maxSum;
    }

    // ================================================================================

    // PREFIX SUM APPROACH

    public static void MaxSumPrefix(int marks[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[marks.length];
        prefix[0] = marks[0];
        // calculate prefix array
        for (int i = 1; i < marks.length; i++) {
            prefix[i] = prefix[i - 1] + marks[i];
        }
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks.length; j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum Sum=" + maxsum);
    }

    // =========================================================================================

    // KADANE'S ALGORITHM

    public static void Kadane(int marks[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < marks.length; i++) {
            currSum = currSum + marks[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum Sum=" + maxSum);
    }

    // ==========================================================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Elements: ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter The Elements: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("The Array Is: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println("The Sum Of The Array Is: ");
        bruteForceSum(marks);
        MaxSumPrefix(marks);
        Kadane(marks);
    }
}
