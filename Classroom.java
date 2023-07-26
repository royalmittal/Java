import java.util.*;
import java.lang.*;

public class Classroom {

    static Scanner sc = new Scanner(System.in);

    public static int bestScore(int[] scores) {
        int best = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        return best;
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

    public static int abundance(int a) {
        System.out.println("Abundance");
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        if (sum > a) {
            return 1;
        } else if (sum < a) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int perfect(int a) {
        System.out.println("Perfect");
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int deficient(int a) {
        System.out.println("Deficient");
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        if (sum < a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int perfectSquare(int a) {
        System.out.println("Perfect Square");
        int square = (int) Math.sqrt(a);
        if (square * square == a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int perfectCube(int a) {
        System.out.println("Perfect Cube");
        int cube = (int) Math.cbrt(a);
        if (cube * cube * cube == a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String piglatin(String str) {
        String[] words = str.split(" ");
        String pig = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String first = word.substring(0, 1);
            String rest = word.substring(1);
            String pigWord = rest + first + "ay";
            pig = pig + pigWord + " ";
        }
        return pig;
    }

    public static int countLargest(String stri) {
        // String[] words = stri.split(" ");
        int count = 0, max = 0, result = 0;
        int n = stri.length();
        for (int i = 0; i < stri.length(); i++) {
            if (stri.charAt(i) != ' ') {
                max++;
            } else {
                if (max > result) {
                    result = max;
                }
                max = 0;
            }
        }
        int a = Math.max(result, max);
        return a;
    }

    public static String acceptString() {
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        return str;
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
                    && str.charAt(i) != 'u') {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

    public static int evenVowel(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                if (i % 2 == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static int oddVowel(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                if (i % 2 != 0) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter the number of students: ");
        // int numStudents = input.nextInt();
        // int[] scores = new int[numStudents];
        // System.out.println("Enter " + numStudents + " scores: ");
        // for (int i = 0; i < numStudents; i++) {
        // scores[i] = input.nextInt();
        // }
        // int best = bestScore(scores);
        // System.out.println("The best score is " + best);
        // System.out.println("Enter a number: ");
        // int a = input.nextInt();
        // int sum = kaprekar(a);
        // System.out.println("The sum is " + sum);
        // System.out.println("Enter a number: ");
        // int b = input.nextInt();
        // int ugly = uglynumber(b);
        // System.out.println("The ugly number is " + ugly);
        // System.out.println("Enter a number: ");
        // int c = input.nextInt();
        // int abun = abundance(c);
        // if (abun == 1) {
        // System.out.println("Abundant");
        // } else if (abun == -1) {
        // System.out.println("Deficient");
        // } else {
        // System.out.println("Perfect");
        // }
        // System.out.println("Enter a number: ");
        // int d = input.nextInt();
        // int per = perfect(d);
        // if (per == 1) {
        // System.out.println("Perfect");
        // } else {
        // System.out.println("Not Perfect");
        // }
        // System.out.println("Enter a number: ");
        // int e = input.nextInt();
        // int def = deficient(e);
        // if (def == 1) {
        // System.out.println("Deficient");
        // } else {
        // System.out.println("Not Deficient");
        // }
        // System.out.println("Enter a number: ");
        // int f = input.nextInt();
        // int perS = perfectSquare(f);
        // if (perS == 1) {
        // System.out.println("Perfect Square");
        // } else {
        // System.out.println("Not Perfect Square");
        // }
        // System.out.println("Enter a number: ");
        // int g = input.nextInt();
        // int perC = perfectCube(g);
        // if (perC == 1) {
        // System.out.println("Perfect Cube");
        // } else {
        // System.out.println("Not Perfect Cube");
        // }
        // System.out.println("Enter a sentence: ");
        // String str = input.nextLine();
        // String pig = piglatin(str);
        // System.out.println(pig);
        // System.out.println("Enter a sentence: ");
        // String stri = input.nextLine();
        // int count = countLargest(stri);
        // System.out.println(count);
        // String str2 = acceptString();
        // System.out.println("Number of vowels: " + countVowels(str));
        // System.out.println("Number of consonants: " + countConsonants(str));
        // System.out.println("Number of digits: " + countDigits(str));
        // System.out.println("Number of spaces: " + countSpaces(str));
        // System.out.println("Number of words: " + countWords(str));

        String s = "kushagra";
        System.out.println(s.indent(20));

    }
}