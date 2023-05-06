import java.util.*;

public class Maths {
    public static int calculateSum(int a, int b) {
        System.out.println("Sum");
        int sum = a + b;
        return sum;
    }

    public static int calculateProduct(int a, int b) {
        System.out.println("Product");
        int product = a * b;
        return product;
    }

    public static int calculateDifference(int a, int b) {
        System.out.println("Difference");
        int difference = a - b;
        return difference;
    }

    public static int calculateQuotient(int a, int b) {
        System.out.println("Quotient");
        int quotient = a / b;
        return quotient;
    }

    public static int calculateRemainder(int a, int b) {
        System.out.println("Remainder");
        int remainder = a % b;
        return remainder;
    }

    public static int factorial(int a) {
        System.out.println("Factorial");
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int power(int a, int b) {
        System.out.println("Power");
        int power = 1;
        for (int i = 1; i <= b; i++) {
            power = power * a;
        }
        return power;
    }

    public static int gcd(int a, int b) {
        System.out.println("GCD");
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int kaprekar(int a) {
        System.out.println("Kaprekar");
        int square = a * a;
        int count = 0;
        while (square != 0) {
            count++;
            square = square / 10;
        }
        int square1 = a * a;
        int r = square1 % (int) Math.pow(10, count / 2);
        int l = square1 / (int) Math.pow(10, count / 2);
        int sum = l + r;
        return sum;
    }

    public static int uglynumber(int a) {
        System.out.println("Ugly Number");
        int ugly = 1;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                ugly = i;
            }
        }
        return ugly;
    }

    public static int MaximizeAction(int a, int b) {
        System.out.println("Maximize Action");
        int max = 0;
        int count = 0;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a - b;
                count++;
            } else {
                b = b - a;
                count++;
            }
        }
        max = count;
        return max;
    }

    public static int lcm(int a, int b) {
        System.out.println("LCM");
        int lcm = (a * b) / gcd(a, b);
        return lcm;
    }

    public static int binomial(int n, int r) {
        System.out.println("Binomial");
        int n1 = factorial(n);
        int r1 = factorial(r);
        int k = (n - r);
        int binomial = n / (r * k);
        return binomial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println(sum);
        int product = calculateProduct(a, b);
        System.out.println(product);
        int difference = calculateDifference(a, b);
        System.out.println(difference);
        int quotient = calculateQuotient(a, b);
        System.out.println(quotient);
        int remainder = calculateRemainder(a, b);
        System.out.println(remainder);
        int fact = factorial(a);
        System.out.println(fact);
        int power = power(a, b);
        System.out.println(power);
        int gcd = gcd(a, b);
        System.out.println(gcd);
        int lcm = lcm(a, b);
        System.out.println(lcm);
        int binomial = binomial(a, r);
        System.out.println(binomial);
        int kaprekar = kaprekar(a);
        System.out.println(kaprekar);
        int ugly = uglynumber(a);
        System.out.println(ugly);
        // int m=MaximizeAction(a,b);
        // System.out.println(m);
    }
}