import java.util.*;
import java.io.*;
//there are two thread the first thread is for withdrawal and the second thread is for deposit apply inter thread communication to solve the problem.if withdrawalaamout is greater than the balance then the withdrawal thread should wait for the deposit thread to deposit the amount and then withdrawal thread should complete the withdrawal process.

class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {

        System.out.println("Going to Withdraw...");
        if (this.amount < amount) {
            System.out.println("Less balance;\n waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.amount -= amount;
        System.out.println("Withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("Going to Deposit...");
        this.amount += amount;
        System.out.println("Deposit Completed... ");
        notify();
    }
}

public class JavaLab9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter to Bank Services");
        System.out.println("1. Withdrawal");
        System.out.println("2. Deposit");
        System.out.println("3. Exit");
        System.out.println("Your Current Balance is 10000");
        System.out.println("Enter your choice: ");
        Customer c = new Customer();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the amount to withdraw: ");
                int amount = sc.nextInt();
                c.withdraw(amount);
                System.out.println("Your Current Balance is " + c.amount);
                break;
            case 2:
                System.out.println("Enter the amount to deposit: ");
                amount = sc.nextInt();
                c.deposit(amount);
                System.out.println("Your Current Balance is " + c.amount);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice");
        }

        // write a java program to create a new arraylist add some colors (string) and
        // print out the collection using for each loop

        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("Enter the number of colors: ");
        int n = sc.nextInt();
        System.out.println("Enter the colors: ");
        for (int i = 0; i < n; i++) {
            String color = sc.next();
            colors.add(color);
        }
        System.out.println("The colors are: ");
        for (String color : colors) {
            System.out.println(color);
        }
        colors.get(1);
        System.out.println("The second color is: " + colors.get(1));

        sc.close();
    }
}
