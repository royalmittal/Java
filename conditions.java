import java.util.*;

public class conditions {

    public static void vote(int age) {
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }
    }

    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        int num = sc.nextInt();
        checkNumber(num);
        vote(age);
    }

}
