// wap in java to apply funtns on string "Java" 
// 1 try to cincatenate welcoe...and write down your observation
// 2 find character at index i
// 3 find the character of java to another string "JAVA"
// 4 compare string Java to JAVA ignoring the case sys
// 5 find the index of first a from last 
// ============================================
// apply following funts stringbuffer object - "HELLO"

// append java
// insert java at index 1
// replace with java the characters btw index 1 to 2 
// delete the char btw  index 1 & 2 
// reverse the string HELLO
// convert the string into lower case

// ===================================
// find out longest word in a string 
// input = india is my country 
// output = 7

import java.util.*;
import java.io.*;

class JavaLab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Java";
        System.out.println("Concatenation");
        str = str.concat(" Welcomes You...!");
        System.out.println(str);
        System.out.println("Enter The Finding Index");
        int i = sc.nextInt();
        System.out.println(str.charAt(i));
        System.out.println("First Occurance of a is at index -> " + str.indexOf('a'));
        String str2 = "JAVA";
        System.out.println("Does JAVA is Equal to Java -> " + str.equals(str2));
        System.out.println("Does JAVA is Equal to Java by , Ignoring Case -> " + str.equalsIgnoreCase(str2));
        System.out.println("Index of 'a' from Last -> " + str.lastIndexOf("a"));
        StringBuffer sb = new StringBuffer("HELLO");
        System.out.println("String Buffer Append -> " + sb.append(" Java"));
        System.out.println("Insert at index 1 -> " + sb.insert(1, "JAVA"));
        System.out.println("Replace -> " + sb.replace(1, 2, "JAVA"));
        System.out.println("Delete at index 1 -> " + sb.delete(1, 5));
        System.out.println("Reverse -> " + sb.reverse());
        System.out.println("Lower Case -> " + sb.toString().toLowerCase());

        // LONGEST WORD IN A STRING
        String s = "India Is My Nation";
        String[] words = s.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest Word is -> " + longestWord);
        System.out.println("Length of Longest Word is -> " + longestWord.length());
        // int count = 0, max = 0;
        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == ' ' && str.charAt(str.length() - 1) != ' ') {
        // if (count > max) {
        // max = count;

        // }
        // count = 0;
        // } else {
        // count++;
        // }
        // }
        // System.out.println("Length of Longest Word is -> " + max);

    }
}
