import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter The Operator: ");
        char op = sc.next().charAt(0);
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        System.out.println("The Result is: " + result);
    }
}
