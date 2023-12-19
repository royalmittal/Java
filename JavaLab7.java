import java.util.*;
import java.io.*;

class LowerBoundException extends Exception {
    public LowerBoundException(String s) {
        super(s);
    }

    public String toString() {
        return "LowerBoundException: " + getMessage();
    }
}

public class JavaLab7 {

    static Scanner sc = new Scanner(System.in);

    /*
     * Write a program to demonstrate the use of following exceptions:
     * 1. ArithmeticException
     * 2. ArrayIndexOutOfBoundsException
     * 3. NullPointerException
     */

    public static void ArithmeticException() {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void ArrayIndexOutOfBoundsException() {
        try {
            int n = sc.nextInt();
            System.out.println("Enter Size of array");
            int arr[] = new int[n];
            arr[n + 1] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void NullPointerException() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    /*
     * Write a program to demonstrate the use of user defined exception
     */

    public static void WithDrawl(int amount) {
        try {
            if (amount > 50000) {
                throw new LowerBoundException("Amount cannot be greater than 50000");
            } else {
                System.out.println("Amount withdrawn successfully!");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    // // Write a program in Java to merge the contents of two files into a third
    // // file.(Use appropriate Character Streams to input and output)

    public static void mergeFiles(String inputFile1, String inputFile2, String outputFile) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
                BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;

            // Merge contents of inputFile1
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Merge contents of inputFile2
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the exception to be thrown: ");
        System.out.println("1. ArithmeticException");
        System.out.println("2. ArrayIndexOutOfBoundsException");
        System.out.println("3. NullPointerException");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                ArithmeticException();
                break;
            case 2:
                ArrayIndexOutOfBoundsException();
                break;
            case 3:
                NullPointerException();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        // Bank Withdrawal Exception
        System.out.println("Bank Balance = 50000");
        System.out.println("Enter the amount to be withdrawn: ");
        int amount = sc.nextInt();
        WithDrawl(amount);

        // Merge Files
        String inputFile1 = "file1.txt";
        String inputFile2 = "file2.txt";
        String outputFile = "merged.txt";

        mergeFiles(inputFile1, inputFile2, outputFile);
        System.out.println("Files merged successfully!");
        sc.close();
    }
}
