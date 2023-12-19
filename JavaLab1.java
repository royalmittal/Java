import java.util.*;
import java.lang.Math;

public class JavaLab1 {
    static Scanner input = new Scanner(System.in);

    public static int calculator(int a, int b, String op) {
        int result = 0;
        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            result = a / b;
        } else if (op.equals("%")) {
            result = a % b;
        }
        return result;
    }

    public static int ScintificCalculator(int a, int b, String op) {
        int result = 0;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
            case "^":
                result = (int) Math.pow(a, b);
                break;
            case "sqrt":
                result = (int) Math.sqrt(a);
                break;
            case "cbrt":
                result = (int) Math.cbrt(a);
                break;
            case "log":
                result = (int) Math.log(a);
                break;
            case "sin":
                result = (int) Math.sin(a);
                break;
            case "cos":
                result = (int) Math.cos(a);
                break;
            case "tan":
                result = (int) Math.tan(a);
                break;
            default:
                System.out.println("Invalid operator");
        }
        return result;
    }

    public static void getArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number: ");
            arr[i] = input.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("Enter the operator: ");
        String op = input.next();
        int result = calculator(a, b, op);
        System.out.println(a + " " + op + " " + b + " = " + result);
        int result2 = ScintificCalculator(a, b, op);
        System.out.println(a + " " + op + " " + b + " = " + result2);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        getArray(arr);
        printArray(arr);

    }

}
