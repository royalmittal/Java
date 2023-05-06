import java.util.*;

public class pattern{
    // ===============================================================
    // CHARACTER PATTERN

    // A
    // AB
    // ABC
    // ABCD
    // ABCDE
    public static void chracaterPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    // ===============================================================
    // HALF NUMBER PYRAMID

    // 1
    // 12
    // 123
    // 1234
    // 12345
    public static void HalfNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    // ===============================================================
    // FULL NUMBER PYRAMID

    // 1
    // 121
    // 12321
    // 1234321
    // 123454321
    public static void FullNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
    // ===============================================================
    // Hollow Rectangle

    // ********
    // * *
    // * *
    // * *
    // ********

    public static void hollowRectangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // ===============================================================
    // INVERTED AND ROTATED HALF PYRAMID
    // *
    // **
    // ***
    // ****
    // *****

    public static void invertedHalfPyramid(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (c - i); j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }
        }
    }
    // ===============================================================

    // INVERTED HALF PYRAMID WITH NUMBERS
    // 12345
    // 1234
    // 123
    // 12
    // 1

    public static void invertedHalfPyramidNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // ===============================================================
    // INVERTED FULL PYRAMID
    // *
    // ***
    // *****
    // *******
    // *********

    public static void invertedFullPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // ===============================================================
    // FLOYD'S TRIANGLE
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15

    public static void floydsTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    // ===============================================================
    // 0 - 1 PATTERN TRIANGLE
    //
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

    public static void zeroOnePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    // ===============================================================
    // PASCAL'S TRIANGLE
    // 1
    // 1 1
    // 1 2 1
    // 1 3 3 1
    // 1 4 6 4 1

    public static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void pascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoeff(i, j) + " ");
            }
            System.out.println();
        }
    }
    // ===============================================================
    // BUTTERFLY PATTERN
    // * *
    // ** **
    // *** ***
    // **** ****
    // **********
    // **********
    // **** ****
    // *** ***
    // ** **
    // * *

    public static void butterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * n - 2 * i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * n - 2 * i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ===============================================================
    // DIAMOND PATTERN
    // *
    // ***
    // *****
    // *******
    // *********
    // *******
    // *****
    // ***
    // *

    public static void diamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ===============================================================
    // HOLLOW DIAMOND PATTERN
    // *
    // * *
    // * *
    // * *
    // * *
    // * *
    // * *
    // * *
    // *

    public static void hollowDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (i == n || k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (i == n || k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    // ===============================================================
    // Solid Rhombus Pattern
    // *****
    // *****
    // *****
    // *****

    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ===============================================================

    // HOLLOW RHOMBUS PATTERN
    // *****
    // * *
    // * *
    // *****

    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                if (i == 1 || i == n || k == 1 || k == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // =================================================================================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Character Pattern: ");
        chracaterPattern(n);
        System.out.println("Half Pyramid: ");
        HalfNumberPyramid(n);
        System.out.println("Full Pyramid: ");
        FullNumberPyramid(n);
        System.out.println("Hollow Rectangle: ");
        hollowRectangle(n);
        System.out.println("Inverted Half Pyramid: ");
        System.out.println("Enter the Number of Rows and Columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        invertedHalfPyramid(r, c);
        System.out.println("Inverted Half Pyramid with Numbers: ");
        invertedHalfPyramidNumbers(n);
        System.out.println("Inverted Full Pyramid: ");
        invertedFullPyramid(n);
        System.out.println("Floyd's Triangle: ");
        floydsTriangle(n);
        System.out.println("0 - 1 Pattern: ");
        zeroOnePattern(n);
        System.out.println("Pascal's Triangle: ");
        pascalsTriangle(n);
        System.out.println("Butterfly Pattern: ");
        butterflyPattern(n);
        System.out.println("Diamond Pattern: ");
        diamondPattern(n);
        System.out.println("Hollow Diamond Pattern: ");
        hollowDiamond(n);
        System.out.println("Solid Rhombus Pattern: ");
        solidRhombus(n);
        System.out.println("Hollow Rhombus Pattern: ");
        hollowRhombus(n);
    }
}
