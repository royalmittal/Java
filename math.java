import java.util.*;

class calculator {
    Scanner sc = new Scanner(System.in);
    int num1, num2, ans;
    char op;

    public calculator() {
        System.out.println("Welcome to the Calculator");
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
        System.out.println("Enter the second number");
        num2 = sc.nextInt();
        System.out.println("Enter the operator");
        op = sc.next().charAt(0);
    }

    public void calculate() {
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            case '%':
                ans = num1 % num2;
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }

    public void display() {
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
    }

}

public class math {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.calculate();
        c.display();
    }
}
