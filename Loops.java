import java.util.*;

public class Loops {
    // ===============================================================
    public static void whileLoop(int n, int range) {
        while (n < range) {
            System.out.println("Jai Shree Ram");
            n++;
        }
    }

    // ===============================================================
    public static void sumOfNaturalNumbers(int n, int range) {
        int sum = 0;
        int i = 1;
        while (i <= range) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of Natural Numbers: " + sum);
    }

    // ===============================================================

    public static void doWhileLoop(int n, int range) {
        do {
            System.out.println("Jai Shree Ram");
            n++;
        } while (n < range);
    }

    // ===============================================================
    public static void forLoop(int n, int range) {
        for (int i = n; i < range; i++) {
            System.out.println("Jai Shree Ram");
        }
    }

    // ===============================================================

    public static void reverseNumber(int reverse, int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        System.out.println("Reverse Number: " + rev);
    }
    // ===============================================================

    // BREAK AND CONTINUE

    public static void breakAndContinue(int n) {
        do {
            System.out.println("Enter Number");
            int num = sc.nextInt();
            if (num < 0) // NEGATIVE NUMBER
            {
                break;
            } else if (num % 10 == 0) // MULTIPLE OF 10
            {
                continue;
            }
            System.out.println(num);
        } while (true); // INFINITE LOOP
    }

    // ===============================================================

    public static void checkPrimeOrNot(int n) {
        int i = 2;
        if (n == 1) {
            System.out.println("Not Prime");
        } else if (n == 2) {
            System.out.println("Prime");
        } else {

            boolean isPrime = true;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
                if (isPrime == true) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not Prime");
                }
            }

            // while (i < n) {
            // if (n % i == 0) {
            // System.out.println("Not Prime");
            // break;
            // }
            // i++;
            // }
            // if (i == n) {
            // System.out.println("Prime");
            // }
        }
    }

    // ================================================
    public public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to Counting: ");
        int n = sc.nextInt();
        System.out.println("Enter to Counting range: ");
        int range = sc.nextInt();
        System.err.println("While Loop: ");
        whileLoop(n, range);
        System.err.println("Do While Loop: ");
        doWhileLoop(n, range);
        System.err.println("For Loop: ");
        forLoop(n, range);
        System.err.println("Enter the Number for sumation: ");
        sumOfNaturalNumbers(n, range);
        System.out.println("Enter Number to Reverse: ");
        int reverse = sc.nextInt();
        reverseNumber(reverse, n);
        breakAndContinue(n);
        System.err.println("Enter Number to Check Prime or Not: ");
        int n = sc.nextInt();
        checkPrimeOrNot(n);

    }
}
