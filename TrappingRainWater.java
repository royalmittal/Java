//=====================================================
//
//       |6|
//       |6|   |5|
// |4|   |6|   |5|
// |4|   |6|3| |5|
// |4|2| |6|3|2|5|
// |4|2| |6|3|2|5|
// =====================================================
//
//
// LEFT MAX BOUNDARRY          -> |4|4|4|6|6|6|6|
// (HEIGHT) RIGHT MAX BOUNDARY -> |6|6|6|6|5|5|5|
// (MIN VALUE)                 -> |4|4|4|6|5|5|5|
//
//
// (MIN VALUE - HEIGHT) - TRAPPED
//
//
// ======================================================

import java.util.*;

public class TrappingRainWater {

    public static int trappedRainWater(int height[]) {
        Integer n = height.length;
        Integer left_max[] = new Integer[n];
        int right_max[] = new int[n];
        left_max[0] = height[0];
        for (int i = 0; i < n; i++) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }
        right_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; --i) {
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(left_max[i], right_max[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println(trappedRainWater(height));
    }
}