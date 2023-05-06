import java.util.*;

public class FunctionsMethod {

    // ===============================================================

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static float sum(float a, float b) {
        float sum = a + b;
        return sum;
    }

    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    // ===============================================================

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // ===============================================================

    // BINOMIAL COEFFICIENT

    public static int binomialCoefficient(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n - r);
        int binomialCoefficient = factN / (factR * factNR);
        return binomialCoefficient;
    }
    // ===============================================================

    public static void isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("The Number is Prime");
        } else {
            System.out.println("The Number is not Prime");
        }
    }

    public static void primeRange(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i + "Prime");
            }
        }
    }

    // ===============================================================

    public static void BinaryToDecimal(int binNum) {
        int power = 0;
        int decimal = 0;
        while (binNum > 0) {
            int last_digit = binNum % 10;
            decimal = decimal + last_digit * (int) Math.pow(2, power);
            binNum = binNum / 10;
            power++;
        }
        System.out.println("Decimal Number is: " + binNum + decimal);
    }

    // ===============================================================

    public static void DecimalToBinary(int decNum) {
        int binary = 0;
        int power = 0;
        while (decNum > 0) {
            int last_digit = decNum % 2;
            binary = binary + last_digit * (int) Math.pow(10, power);
            decNum = decNum / 2;
            power++;
        }
        System.out.println("Binary Number is: " + decNum + binary);
    }

    // ===============================================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number: ");
        int c = sc.nextInt();
        // SUM
        System.out.println("The sum of two integer is " + sum(a, b));
        System.out.println("The sum of two float is " + sum(a, b));
        System.out.println("The sum of three integer is " + sum(a, b, c));
        // FACTORIAL
        System.out.println("The factorial of " + a + " is " + factorial(a));
        System.out.println("The factorial of " + b + " is " + factorial(b));
        // BINOMIAL COEFFICIENT
        System.out.println("The binomial coefficient of " + a + " and " + b + " is " + binomialCoefficient(a, b));
        System.out.println("The binomial coefficient of " + b + " and " + c + " is " + binomialCoefficient(b, c));
        // PRIME
        System.out.println("Enter the Number to check Prime or Not: ");
        int n = sc.nextInt();
        isPrime(n);
        System.out.println("Enter the Number to check Prime Range: ");
        int n = sc.nextInt();
        primeRange(n);
        // BINARY TO DECIMAL
        System.out.println("Enter the Binary Number: ");
        int binNum = sc.nextInt();
        BinaryToDecimal(binNum);
        // DECIMAL TO BINARY
        System.out.println("Enter the Decimal Number: ");
        int decNum = sc.nextInt();
        DecimalToBinary(decNum);

    }
}
