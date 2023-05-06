import java.util.*;

public class BitManipulation {
    // ===================================================================
    public static void checkODD(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("EVEN NUMBER");
        } else {
            System.out.println("ODD NUMBER");
        }
    }

    // =================================================================
    // GET iTH BIT

    public static int getIthbit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // =================================================================
    // SET iTH BIT

    public static int setIthbit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    // =================================================================
    // CLEAR iTH BIT

    public static int clearIthbit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    // =================================================================
    // UPDATE iTH BIT

    public static int updateIthbit(int n, int i, int newBit) {

        // if(newBit == 0)
        // {
        // return clearIthbit(n, i);
        // }
        // else
        // {
        // return setIthbit(n, i);
        // }

        int nn = clearIthbit(n, i);
        int bitMask = newBit << i;
        return (nn | bitMask);
    }

    // =================================================================
    // CLEAR LAST iTH BIT

    public static int clearBit(int n, int i) {
        int bitMask = (~0) << i;
        return (n & bitMask);
    }

    // =================================================================
    // CLEAR RANGE iTH BIT

    public static int clearBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return (n & bitMask);
    }

    // =================================================================
    // CHECK IF A NUMBER OF POWER OF 2 OR NOT

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1) == 0);
    }

    // =================================================================
    // COUNT SET BIT IN A NUMBER

    public static int countSet(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 1) // check LSB
            {
                count++;
            }
            n = n >> 1; // right shift
        }
        return count;
    }

    // =================================================================
    // FAST EXPONENTIATON

    public static int fastExponentiation(int a, int b) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    // =================================================================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Operation Element");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Operation Element");
        int b = sc.nextInt();
        System.out.println("Enter Element for ODD or EVEN Check");
        int n = sc.nextInt();
        System.out.println("Enter i for iTH Bit Check");
        int i = sc.nextInt();
        System.out.println("Enter i for iTH Update Bit Check");
        int newBit = sc.nextInt();
        System.out.println("Enter i for iTH Clear Bit range Check");
        int j = sc.nextInt();

        // AND
        System.out.println("AND");
        System.out.println((5 & 6));

        // OR
        System.out.println("OR");
        System.out.println((5 | 6));

        // XOR
        System.out.println("XOR");
        System.out.println((5 ^ 6));

        // BINARY 1's COMPLEMENT
        System.out.println("Binary 1's Complement");
        System.out.println((~5));

        // BINARY LEFT SHIFT
        // a<<b = a * (2^b)
        System.out.println("Binary Left Shift");
        System.out.println(a << b(2));

        // BINARY RIGHT SHIFT
        // a>>b = a / (2^b)
        System.out.println("Binary Left Shift");
        System.out.println(a >> b(2));

        // CHECK ODD OR EVEN
        System.out.println(checkODD(n));

        // GET iTH BIT
        System.out.println(getIthbit(n, i));

        // SET iTH BIT
        System.out.println(setIthbit(n, i));

        // CLEAR iTH BIT
        System.out.println(clearIthbit(n, i));

        // UPDATE iTH BIT
        System.out.println(updateIthbit(n, i, newBit));

        // CLEAR LAST iTH BIT
        System.err.println(clearBit(n, i));

        // CLEAR RANGE iTH BIT
        System.err.println(clearBits(n, i, j));

        // CHECK IF A NUMBER OF POWER OF 2 OR NOT
        System.err.println(isPowerOfTwo(n));

        // COUNT SET BIT IN A NUMBER
        System.err.println(countSet(n));

        // FAST EXPONENTIATON
        System.err.println(fastExponentiation(a, b));
    }
}
