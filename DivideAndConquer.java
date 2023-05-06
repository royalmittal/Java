import java.util.*;

public class DivideAndConquer {
    // ==================================================================================
    // ROTATED SORTED ARRAY
    public static int search(int arr[], int tar) {
        int si = 0, ei = arr.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == tar) {
                return mid;
            } else if (arr[si] <= arr[mid]) {
                if (tar >= arr[si] && tar <= arr[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            } else {
                if (tar >= arr[mid] && tar <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int tarIdx = search(arr, target);
        if (tarIdx == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + tarIdx);
        }
    }
}
