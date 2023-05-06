import java.util.*;

public class diagonalSumAndSpiralMatrix {

    // =============================================
    public static void spiralMatrix(int mat[][]) {
        int i, j;
        int startRow = 0;
        int startCol = 0;
        int endRow = mat.lenght - 1;
        int endCol = mat[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top;
            for (j = startCol; j <= endCol; j++) {
                System.out.println(mat[startRow][j] + " ");
            }
            // right
            for (i = startRow; i <= endRow; i++) {
                System.out.println(mat[i][endCol] + " ");
            }
            // bottom
            for (j = endCol - 1; j >= startCol; j--) {
                // ODD MATRIX
                if (startCol == endCol)
                    return;
                System.out.println(mat[endRow][j] + " ");
            }
            // left
            for (i = endRow - 1; i >= startRow + 1; i--) {
                System.out.println(mat[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol++;
            endRow++;
        }
        System.out.println();
    }

    // ==============================================================================

    public static void diagonalSum(int mat[n][m]) 
    {
        int sum=0;
        for (int i =0;i<n;i++)
        {
            //primary diagonal
            sum += matrix[i][j];

            //secondary diagonal
            sum += mat[i][j-i-1];
        }
        return sum;
    }
    // =====================================================================================

    public static void createMatrix(int n, int m) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // =================================================================================
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < n; i++)

        {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // ===========================================================================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        createMatrix(5, 5);
        printMatrix();
        spiralMatrix(mat[][]);
        int Sum = diagonalSum(mat[n][m]);
        System.out.println("Both Diagonal Sum = " + Sum);
    }

}
