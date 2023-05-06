import java.util.*;
import java.util.ArrayList;

public class Arrays {
    // =======================================================================
    // SCANNING IN CHRACHTER ARRAY
    public static void getnames(String names[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
    }
    // ========================================================================
    // SCANNING IN NUMERICAL ARRAY

    public static void getmarks(int marks[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
    }
    // =========================================================================
    // PRINTING IN ARRAY

    public static void printinfo(String names[], int marks[]) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
    // ============================================================================
    // OPERATION IN ARRAY

    public static void updateinfo(String names[], int marks[]) {
        System.out.println("Addition of 1 in Marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        printinfo(names, marks);
        System.out.println("Subtraction of 1 in Marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] - 1;
        }
        printinfo(names, marks);
        System.out.println("Multiplication of 2 in Marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] * 2;
        }
        printinfo(names, marks);
        System.out.println("Division of 2 in Marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] / 2;
        }
        printinfo(names, marks);
    }
    // ===============================================================================
    // FINDING THE LARGEST NUMBER IN ARRAY

    public static int getLargest(int marks[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > largest) {
                largest = marks[i];
                i++;
            }
        }
        return largest;
    }
    // =================================================================================
    // FINDING THE SMALLEST NUMBER IN ARRAY

    public static int getSmallest(int marks[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < smallest) {
                smallest = marks[i];
                i++;
            }
        }
        return smallest;
    }
    // ====================================================================================
    // REVERSE OF AN ARRAY

    public static void reverse(int marks[]) {
        int start = 0;
        int end = marks.length - 1;
        while (start < end) {
            int temp = marks[start];
            marks[start] = marks[end];
            marks[end] = temp;
            start++;
            end--;
        }
    }
    // =======================================================================================
    // PAIRS IN AN ARRAY

    public static void pairs(int marks[]) {
        int n = marks.length;
        int total_pair = 0;
        for (int i = 0; i < n; i++) {
            int curr = marks[i];
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + curr + "," + marks[j] + ")");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + total_pair);
    }
    // ============================================================================================
    // SUBARRAYS IN AN ARRAY

    public static void subarrays(int marks[]) {
        int n = marks.length;
        int ts = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(marks[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total SubArrays=" + ts);
    }

    // ==========================================================================================

    public static List<Integer> findLeadersElement(int marks[], int n) {
        List<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (marks[i] <= marks[j]) {
                    break;
                }
                if (j == n) {
                    leaders.add(marks[i]);
                }
            }
        }
        return leaders;
    }

    // =========================================================================================
    // MAIN METHOD

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No. Of Students:");
        int n = sc.nextInt();
        String names[] = new String[n];
        int marks[] = new int[n];
        // System.out.println("Enter The Namess of Students: ");
        // getnames(names);
        // System.out.println("Enter The Marks of Students: ");
        // getmarks(marks);
        // System.out.println("Information of Students:");
        // printinfo(names, marks);
        // System.out.println("The Updated Information of Students: ");
        // updateinfo(names, marks);
        // System.out.println("The Largest Marks is: " + getLargest(marks));
        // System.out.println("The Smallest Marks is: " + getSmallest(marks));
        // System.out.println("The Reverse of Marks is: ");
        // reverse(marks);
        // System.out.println("The Pairs of Marks is: ");
        // pairs(marks);
        // System.out.println("The Subarrays of Marks is: ");
        // subarrays(marks);
        System.out.println("The Leaders of Marks is: ");
        for (int i : findLeadersElement(marks, n)) {
            System.out.println(i);
        }

    }
}