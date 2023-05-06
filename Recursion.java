import java.util.*;

public class Recursion {
    // ==================================================================================
    // PRINT IN DECREASING ORDER
    // f(n) = n + f(n-1)
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n - 1);
    }

    // ==================================================================================
    // PRINT IN INCREASING ORDER
    // f(n) = f(n-1) + n
    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n - 1);
        System.out.println(n + " ");
    }
    // ==================================================================================
    // FACTORIAL OF N
    // fact(n)= n*fact(n-1)

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * factorial(n - 1);
        return fn;
    }
    // ==================================================================================
    // SUM OF FIRST N NATURAL NUMBERS

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int sumnm1 = sum(n - 1);
        int sumn = n + sumnm1;
        return sumn;
    }

    // ==================================================================================
    // PRINT NTH FIBONACCI NUMBER
    // 0 1 1 2 3 5 8 13 21...................
    // fib(n+2) = fib(n+1) + fib(n)

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    // ==================================================================================
    // CHECK THAT ARRAY IS SORTED OR NOT

    public static boolean isSorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] > arr[idx + 1]) {
            return false;
        }
        boolean isSmallerSorted = isSorted(arr, idx + 1);
        return isSmallerSorted;
    }

    // ==================================================================================
    // FIRSTOCCURRENCE OF X IN AN ARRAY

    public static int firstOcc(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        }
        int fiisa = firstOcc(arr, idx + 1, x);
        return fiisa;
    }

    // ==================================================================================
    // LASTOCCURRENCE OF X IN AN ARRAY

    public static int lastOcc(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        int isfound = lastOcc(arr, idx + 1, x);
        if (isfound == -1 && arr[idx] == x) {
            return idx;
        }
        return isfound;
    }

    // ==================================================================================
    // PRINT X^N

    public static int optimisedpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        //int halfpowersq = optimisedpower(x, n / 2) * optimisedpower(x, n / 2);
        int halfpower = optimisedpower(x, n / 2);
        int halfpowersq = halfpower * halfpower;
        if (n % 2 == 0) {
            return halfpowersq;
        } else {
            return halfpowersq * x;
        }
    }

    // ==================================================================================
    // REMOVE DUPLICATES FROM A STRING

    Public static String removeDuplicates(String str, int idx,stringBuilder newStr, boolean map[]) {
        if(idx == str.length()){
            System.out.println(newStr);
        }
        char currchar = str.charAt(idx);
        if(map [currchar - 'a'] == true)
        {
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            //not duplicate
            map[currchar - 'a'] = true;
            //newStr.append(currchar);
            removeDuplicates(str, idx+1, newStr, map);
        }
    }

    // ==================================================================================
    // BINARY STRING PROBLEM

    public static void printBinString(int n,int lastPlace, String str)
    {
        if(n == 0)
        {
            System.out.println(str);
            return;
        }
        printBinString(n-1,0, str+"0");
        if(lastPlace != 1)
        {
            printBinString(n-1,1, str+"1");
        }
    }

    // ==================================================================================

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sn.nextInt();
        System.out.println("The Number is: " + n);
        System.out.println("Increasing Order");
        printDec(n);
        System.out.println("Decreasing Order");
        printInc(n);
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        factorial(n);
        System.out.println("Sum of " + n + " natural numbers is: " + sum(n));
        sum(n);
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
        fib(n);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {arr[i] = sc.nextInt();}
        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("Is the array sorted: " + isSorted(arr, 0));
        isSorted(arr, 0);
        System.out.println("Enter the element to find first occurence");
        int x = sc.nextInt();
        System.out.println("The first occurence of " + x + " is: " + firstOcc(arr, 0, x));
        firstOcc(arr, 0, x);
        System.out.println("Enter the element to find last occurence");
        int y = sc.nextInt();
        System.out.println("The last occurence of " + y + " is: " + lastOcc(arr, 0, y));
        lastOcc(arr, 0, y);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("The value of " + x + "^" + n + " is: " + optimisedpower(x, n));
        optimisedpower(x, n);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("The string is: " + str);
        System.out.println("The string without duplicates is: " + removeDuplicates(str, 0, new StringBuilder(), new boolean[26]));
        removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("The binary strings are: ");
        printBinString(n, 0, "");
        

    }

}
