import java.util.*;
import java.lang.*;

public class Assignment {
    static Scanner sc = new Scanner(System.in);

    public int func(int a) {
        int result;
        if (a == 1) {
            result = 1;
        } else {
            result = a * func(a - 1);
        }
        return result;
    }

    public static String piglatin(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String firstLetter = word.substring(0, 1);
            String restOfWord = word.substring(1, word.length());
            result += restOfWord + firstLetter + "ay ";
        }
        return result;
    }

    public static void inputArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] secondLargest(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void inputmatrix(int mat[][]) {
        Scanner sc = new Scanner(System.in);
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public static void printmatrix(int mat[][]) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrixRotaion(int mat[][]) {
        int n = mat.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][n - 1 - i];
                mat[j][n - 1 - i] = mat[n - 1 - i][n - 1 - j];
                mat[n - 1 - i][n - 1 - j] = mat[n - 1 - j][i];
                mat[n - 1 - j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int a, val, sum, n = 550;
        Scanner sc = new Scanner(System.in);
        System.out.println(10 + 20 + "GraphicEar");
        System.out.println("Graphi c Era" + 10 + 20);
        System.out.println(10 * 20 + "GraphicEra");
        System.out.println("GraphicEra" + 10 * 20);
        System.out.println("Enter Value Of val");
        val = sc.nextInt();
        sum = n + val > 1750 ? 400 : 200;
        System.out.println(sum);
        System.out.println("Enter Value Of a");
        a = sc.nextInt();
        // System.out.println("Factorial ->" + func(a));
        Assignment obj = new Assignment();
        System.out.println("Factorial ->" + obj.func(a));
        String c = "Hello i love java";
        boolean var;
        var = c.startsWith("Hello");
        // var = c.startsWith("hello");
        System.out.println(var);
        String Piglatin = piglatin("Hello i love java");
        System.out.println(Piglatin);
        int mat[][] = new int[3][3];
        System.out.println("Enter Matrix");
        inputmatrix(mat);
        System.out.println("Matrix");
        printmatrix(mat);
        System.out.println("Matrix After Rotation");
        matrixRotaion(mat);
        printmatrix(mat);
        int arr[] = new int[5];
        System.out.println("Enter Array");
        inputArray(arr);
        System.out.println("Array");
        printArray(arr);
        int arr1[] = secondLargest(arr);
        System.out.println("Second Largest Element ->" + arr1[arr1.length - 2]);
    }
}