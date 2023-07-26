import java.util.*;
import java.io.*;

class ExceptionHandlingTest extends Throwable {
    public ExceptionHandlingTest(String message) {
        super(message);
    }
}

public class ExceptionHandling {

    public static void tryCatchBlock() {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

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
            int[] arr = new int[5];
            arr[10] = 10;
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

    public static void FinallyBlock() {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }

    public static void throwKeyword() {
        try {
            throw new ArithmeticException("Throw keyword");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void throwsKeyword() throws IOException {
        FileReader file = new FileReader("file.txt");
        BufferedReader fileInput = new BufferedReader(file);
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());
        fileInput.close();
    }

    public static void test1() {
        static ArithmeticException e = new ArithmeticException("Test");
        System.out.println(e.getMessage());
    }

    public static void test2() {
        throw new ArithmeticException();
        System.out.println("Test 2");
    }

    public static void throwsMannualHandling() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void throwsAutoHandling() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        tryCatchBlock();
        ArithmeticException();
        ArrayIndexOutOfBoundsException();
        NullPointerException();
        FinallyBlock();
        throwKeyword();
        try {
            throwsKeyword();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        test1();
        test2();
        ExceptionHandlingTest e = new ExceptionHandlingTest("Test");
        System.out.println(e.getMessage());
        throwsMannualHandling();
        throwsAutoHandling();

    }
}
