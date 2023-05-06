import java.util.*;

public class ArraySearching {
    // LINEAR SEARCH IN NUMERICAL ARRAY

    public static int markSearch(int marks[], int key) {
        for (int i = 0; i <= marks.length; i++) {
            if (marks[i] == key)
                return i;
        }
        return -1;
    }

    // LINEAR SEARCH IN STRING ARRAY

    public static int nameSearch(String names[], String child) {
        for (int i = 0; i <= names.length; i++) {
            if (names.equals(child))
                return i;
        }
        return -1;
    }

    // BINARY SEARCH IN NUMERICAL ARRAY

    public static int binarySearch(int marks[], int key) {
        int start = 0;
        int end = marks.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (marks[mid] == key) {
                return mid;
            } else if (marks[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Students: ");
        int n = sc.nextInt();
        String names[] = new String[n];
        int marks[] = new int[n];
        // System.out.println("Enter The Names: ");
        // for (int i = 0; i < names.length; i++) {
        // names[i] = sc.nextLine();
        // }
        System.out.println("Enter The Marks: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter The Marks To Search: ");
        int key = sc.nextInt();
        // int index1 = markSearch(marks, key);
        // if (index1 == -1) {
        // System.out.println("The Key is not found");
        // } else {
        // System.out.println("The Key is found at index: " + index1);
        // }
        int searched = binarySearch(marks, key);
        if (searched == -1)
            System.out.println("NOT FOUND");
        else
            System.out.println("The Key is found at index: " + searched);
        // System.out.println("Enter The Name To Search: ");
        // String child = sc.nextLine();
        // int index2 = nameSearch(names, child);
        // if (index2 == -1) {
        // System.out.println("The Name is not found");
        // } else {
        // System.out.println("The Name is found at index: " + index2);
        // }
    }
}
