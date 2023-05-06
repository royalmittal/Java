import java.util.*;

public class Recursion_Application {

    // ===================================================================================
    // TOWER OF HANOI
    public static void TowerOfHanoi(int n, String src, String helper, String dest) {

    }

    // ==================================================================================
    // BOARD PATH PROBLEM
    // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
    public static int boardPath(int curr, int end, String ans) {
        if (curr == end) {
            System.out.println(ans);
            return 1;
        }
        if (curr > end) {
            return 0;
        }
        int count = 0;
        for (int dice = 1; dice <= 6; dice++) {
            count += boardPath(curr + dice, end, ans + dice);
        }
        return count;
    }

    // ==================================================================================
    // MAZE PATH PROBLEM
    // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
    public static int mazePath(int curr, int end, String ans) {
        if (curr == end) {
            System.out.println(ans);
            return 1;
        }
        if (curr > end) {
            return 0;
        }
        int count = 0;
        for (int dice = 1; dice <= 6; dice++) {
            count += mazePath(curr + dice, end, ans + dice);
        }
        return count;
    }

    // ==================================================================================
    // TILING PROBLEM
    // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
    public static int tilingProblem(int n)
    {
        if( n == 0 || n == 1)
     

        //vertical tiling
        int fnm1 = tilingProblem(n-1);
        //horizontal tiling
        int fnm2 = tilingProblem(n-2);
        int totalways = fnm1 + fnm2;
        return totalways;
    }

    // ==================================================================================
    // FRIEND PAIRING PROBLEM

    public static int friendPairing(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        // choice 1: single
        int fnm1 = friendPairing(n - 1);
        // choice 2: pair
        int fnm2 = friendPairing(n - 2) * (n - 1);
        int pairing = (n - 1) * fnm2;
        // choice 3: group
        int fnm3 = friendPairing(n - 3) * (n - 1) * (n - 2);
        int grouping = (n - 1) * (n - 2) * fnm3;
        // total ways
        int totalways = fnm1 + pairing + grouping;
        return totalways;
    }

    public static int friendPairing(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        return friendPairing(n - 1) + (n - 1) * friendPairing(n - 2);
    }

    // ==================================================================================
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end point");
        int end = sc.nextInt(
        System.out.println("The number of ways to reach end point is: " + mazePath(0, end, ""));
        mazePath(0, end, "");
        System.out.println("The number of ways to reach end point is: " + boardPath(0, end, ""));
        boardPath(0, end, "");
        System.out.println("Enter the number of tiles");
        int n = sc.nextInt();
        System.out.println(tilingProblem(n));
        System.out.println("Enter the number of friends");
        int n = sc.nextInt();
        System.out.println(friendPairing(n));
        int g = friendPairing(n);
        System.out.println("Total number of ways to pair friends is:")
        System.out.println(g);
        
    }
}