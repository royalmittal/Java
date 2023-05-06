import java.util.Scanner;

public class java1 {

    public static void main(String arg[]) {
        int a = 10;
        int b = 90;
        String name = "Kushagra Mittal";
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        a = b;
        System.out.println(a);
        byte a = 10;
        System.out.println(a);
        char ch = 'a'; // char is a single character
        System.out.println(ch);
        boolean b = true;
        System.out.println(b);
        float f = 10.5f;
        System.out.println(f);
        double d = 10.5;
        System.out.println(d);
        String name = "Kushagra Mittal";
        System.out.println(name);
        int i = 100;
        System.out.println(i);
        long l = 1000000000000000000L;
        System.out.println(l);
        short s = 100;
        System.out.println(s);
        int a = 10;
        byte b = 90;
        float f = 56.09f;
        double d = 666;
        double ans = a + b + f + d;
        System.out.println(ans);
        byte b = 5;
        b = (byte) (b * 5);
        System.out.println(b);
        int a;
        System.out.println("Enter the value of a");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a > 0) {
            System.out.println("The number is positive");
        } else if (a < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }System.out.println("Enter the value of a");

    Scanner sc = new Scanner(System.in);a=sc.nextInt();switch(a)
    {
            case 1:
            System.out.println("The number is one");
            break;
            case 2:
            System.out.println("The number is two");
            break;
            case 3:
            System.out.println("The number is three");
            break;
            default:
            System.out.println("The number is not one, two or three");
        }
}}