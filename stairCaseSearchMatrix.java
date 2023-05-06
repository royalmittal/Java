import java.util.*;

public class stairCaseSearchMatrix {
    public static boolean stairCaseSearch(int mat[][], int key) {

        int row = 0, col = mat[0].length - 1;
        while (row < mat.length && col >= 0) {
            if (mat[row][col] == key) {
                System.out.println("Found At (" + row + "," + col + ")");
                return true;
            } else if (key < mat[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key Not Found");
        return false;
    }

    public static void createMatrix(int r, int c) {
        // Scanner sc = new Scanner(System.in);
        // int r =sc.nextInt();
        // int c =sc.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        createMatrix(n, m);
        stairCaseSearch(mat, 5);
    }
}
