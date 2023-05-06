import java.util.*;

public class String {
    // ==================================================================================================
    public static void concatination(String str, String str1) {
        String str2 = str + str1;
        System.out.println("Concatination of two strings is: " + str2);
    }

    // ==================================================================================================

    public static void palindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("String is not palindrome");
                break;
            } else {
                System.out.println("String is palindrome");
                break;
            }
        }
    }

    // ==================================================================================================

    public static void reverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    // ==================================================================================================

    public static void substring(String str) {
        System.out.println("Enter the starting index:");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("Enter the ending index:");
        int end = sc.nextInt();
        String str1 = str.substring(start, end);
        System.out.println("Substring is: " + str1);
    }
    // ==================================================================================================

    public static void replace(String str) {
        System.out.println("Enter the character to be replaced:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("Enter the character to be replaced with:");
        char ch1 = sc.next().charAt(0);
        String str1 = str.replace(ch, ch1);
        System.out.println("Replaced String is: " + str1);
    }

    // ==================================================================================================

    public static void compare(String str, String str1) {
        if (str.equals(str1)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        String newStr = new nextLine();
        if (str.compareTo(str1) > 0) {
            System.out.println("String 1 is greater than String 2");
        } else if (str.compareTo(str1) < 0) {
            System.out.println("String 1 is less than String 2");
        } else {
            System.out.println("String 1 is equal to String 2");
        }
    }

    // ==================================================================================================

    public static void split(String str) {
        String[] str1 = str.split(" ");
        for (String s : str1) {
            System.out.println(s);
        }
    }

    // ==================================================================================================

    public static LargestStringPrint(String str) 
    {
        String Dishes = { "Biryani", "Kabab", "Chapati", "Dal", "Rice" };
        String largest = Dishes[0];
        for (int i = 1; i < Dishes.length; i++) 
        {
            if (Dishes[i].length() > largest.length()) 
            {
                largest = Dishes[i];
            }
        }
        System.out.println("Largest String is: " + largest);
    }

    // ==================================================================================================

    public static string conversion(String str) {
        String sentence = "hi,i am ram bhakta";
        StringBuilder.sb = new StringBuilder();
        char ch = Character.conversion(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == " " && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.conversion(str.charAt(i)));
            } else
                sb.append(str.charAt(i));
        }
    }

    // ===================================================================================================

    public static String compressed(String str) {
        String newStr = " ";
        Integer count = 1;
        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    // ==================================================================================================

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String:");
        String str = sc.nextLine();
        System.err.println("Inputed String:");
        System.out.println(str);
        System.out.println("Enter The String for contatinating:");
        String str1 = sc.nextLine();
        concatination(str, str1);
        int len = str.length();
        System.out.println("Length of the string is: " + len);
        palindrome(str);
        System.out.println("Reverse of the string is:");
        reverse(str);
        substring(str);
        replace(str);
        System.out.println("Enter the string to be compared:");
        String str2 = sc.nextLine();
        compare(str, str2);
        split(str);
        LargestStringPrint(str);

        // ==================================================================================================
        // String Builder
        System.out.println("String Builder");
        StringBuilder sb = new StringBuilder(" ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println("CONVERSION:");
        conversion(str);
        System.out.println("COMPRESSION:");
        compressed(str2);

    }
}