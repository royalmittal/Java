import java.util.*;

public class JavaLab4 {
    public static void main(String[] args) {
        // Develop a program in Java to find out the second min and min, second max
        // and max in an array of ‘n’ integers without using any sorting algorithm.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int secondMin = arr[0];
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] > min) {
                secondMin = arr[i];
            }
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("The min is: " + min);
        System.out.println("The second min is: " + secondMin);
        System.out.println("The second max is: " + secondMax);
        System.out.println("The max is: " + max);

        // search in matrix
        System.out.println("Enter the size of the matrix: ");
        int s = sc.nextInt();
        int[][] matrix = new int[s][s];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to be searched: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == search) {
                    System.out.println("The element is found at position: " + i + " " + j);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("The element is not found");
        }

        // Create a jagged array having three rows, Where 1st row contains 3 columns,
        // 2nd row contains 4 columns and 3rd row contains 2 columns. Insert the
        // elements in the array and print the sum of each row.
        int[][] jagged = new int[3][];
        jagged[0] = new int[3];
        jagged[1] = new int[4];
        jagged[2] = new int[2];
        System.out.println("Enter the elements of the jagged array: ");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                sum += jagged[i][j];
            }
            System.out.println("Sum of row " + i + " is: " + sum);
            sum = 0;
        }
    }

}
