import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

public class Qsn {

    // P6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TASK 1 PALINDROME
        System.out.println("Palindrome");
        System.out.println("Enter The String");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // // TASK 2 COMPARE
        System.out.println("Compare");
        System.out.println("Enter The String");
        String str1 = sc.nextLine();
        System.out.println("Enter The String");
        String str2 = sc.nextLine();
        if (str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // // TASK 3 REVERSE
        System.out.println("Reverse");
        String str3 = sc.nextLine();
        System.out.println("Enter The String");
        String rev1 = "";
        for (int i = str3.length() - 1; i >= 0; i--) {
            rev1 = rev1 + str3.charAt(i);
        }
        System.out.println(rev1);

        // // TASK 4 Integer to Roman Numerals
        System.out.println("Integer to Roman Numerals");
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        String roman = "";
        while (num >= 100) {
            roman = roman + "C";
            num = num - 100;
        }
        while (num >= 90) {
            roman = roman + "XC";
            num = num - 90;
        }
        while (num >= 50) {
            roman = roman + "L";
            num = num - 50;
        }
        while (num >= 40) {
            roman = roman + "XL";
            num = num - 40;
        }
        while (num >= 10) {
            roman = roman + "X";
            num = num - 10;
        }
        while (num >= 9) {
            roman = roman + "IX";
            num = num - 9;
        }
        while (num >= 5) {
            roman = roman + "V";
            num = num - 5;
        }
        while (num >= 4) {
            roman = roman + "IV";
            num = num - 4;
        }
        while (num >= 1) {
            roman = roman + "I";
            num = num - 1;
        }
        System.out.println(roman);

        // // P5

        // // TASK 1 DUPLICATE

        // System.out.println("Duplicate");
        int arr[] = new int[10];
        System.out.println("Enter The Array");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element is " + arr[i]);
                }
            }
        }

        // TASK 2 LEFT ROTATION
        System.out.println("Left Rotation");
        int temp[] = new int[10];
        for (int i = 0; i < 2; i++) {
            temp[i] = arr[i];
        }
        for (int i = 2; i < 10; i++) {
            arr[i - 2] = arr[i];
        }
        for (int i = 0; i < 2; i++) {
            arr[i + 8] = temp[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        // TASK 3 REMOVE SPECIFIC ELEMENT
        System.out.println("Remove Specific Element");
        int e = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (arr[i] == e) {
                for (int j = i; j < 9; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i] + " ");
        }

        // TASK 4 Second Largest Element & Second Smallest Element
        System.out.println("Second Largest Element & Second Smallest Element");
        int max = arr[0];
        int min = arr[0];
        int max2 = arr[0];
        int min2 = arr[0];
        for (int i = 0; i < 10; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] > max2 && arr[i] < max) {
                max2 = arr[i];
            }
            if (arr[i] < min2 && arr[i] > min) {
                min2 = arr[i];
            }
        }
        System.out.println("Second Largest Element is " + max2);
        System.out.println("Second Smallest Element is " + min2);

        // TASK 5 insert

        System.out.println("Insert");
        System.out.println("Enter The Element");
        int e1 = sc.nextInt();
        System.out.println("Enter The Position");
        int p = sc.nextInt();
        for (int i = 9; i >= p; i--) {
            arr[i] = arr[i - 1];
        }
        arr[p - 1] = e1;
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
