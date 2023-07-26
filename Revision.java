import java.util.*;
import java.lang.*;
import java.security.GuardedObject;
import java.io.*;
import javax.swing.*;
import javax.swing.plaf.multi.MultiMenuBarUI;
import java.awt.*;
import java.awt.event.*;

class solution {
    public static int[] performSurvey(String c1, String c2, String c3, String c4)
    {

    System.out.println("Enter 1st City: ");
    String c1 = sc.nextLine();
    System.out.println("Enter 2nd City: ");
    String c2 = sc.nextLine();
    System.out.println("Enter 3rd City: ");
    String c3 = sc.nextLine();
    System.out.println("Enter 4th City: ");
    String c4 = sc.nextLine();

    int maruti[] = new int[4];
    int zenAstelo[] = new int[4];
    int wagnor[] = new int[4];
    int marutisx[] = new int[4];

    System.out.println("Enter the number of people who like Maruti in " + c1 + ":
    ");
    maruti[0] = sc.nextInt();
    System.out.println("Enter the number of people who like Zen Astelo in " + c1
    + ": ");
    zenAstelo[0] = sc.nextInt();
    System.out.println("Enter the number of people who like Wagnor in " + c1 + ":
    ");
    wagnor[0] = sc.nextInt();
    System.out.println("Enter the number of people who like Maruti SX in " + c1 +
    ": ");
    marutisx[0] = sc.nextInt();

    System.out.println("Enter the number of people who like Maruti in " + c2 + ":
    ");
    maruti[1] = sc.nextInt();
    System.out.println("Enter the number of people who like Zen Astelo in " + c2
    + ": ");
    zenAstelo[1] = sc.nextInt();
    System.out.println("Enter the number of people who like Wagnor in " + c2 + ":
    ");
    wagnor[1] = sc.nextInt();
    System.out.println("Enter the number of people who like Maruti SX in " + c2 +
    ": ");
    marutisx[1] = sc.nextInt();

    System.out.println("Enter the number of people who like Maruti in " + c3 + ":
    ");
    maruti[2] = sc.nextInt();
    System.out.println("Enter the number of people who like Zen Astelo in " + c3
    + ": ");
    zenAstelo[2] = sc.nextInt();
    System.out.println("Enter the number of people who like Wagnor in " + c3 + ":
    ");
    wagnor[2] = sc.nextInt();
    System.out.println("Enter the number of people who like Maruti SX in " + c3 +
    ": ");
    marutisx[2] = sc.nextInt();

    System.out.println("Enter the number of people who like Maruti in " + c4 + ":
    ");
    maruti[3] = sc.nextInt();
    System.out.println("Enter the number of people who like Zen Astelo in " + c4
    + ": ");
    zenAstelo[3] = sc.nextInt();
    System.out.println("Enter the number of people who like Wagnor in " + c4 + ":
    ");
    wagnor[3] = sc.nextInt();
    System.out.println("Enter the number of people who like Maruti SX in " + c4 +
    ": ");
    marutisx[3] = sc.nextInt();

    int total[] = new int[4];
    total[0] = maruti[0] + zenAstelo[0] + wagnor[0] + marutisx[0];
    total[1] = maruti[1] + zenAstelo[1] + wagnor[1] + marutisx[1];
    total[2] = maruti[2] + zenAstelo[2] + wagnor[2] + marutisx[2];
    total[3] = maruti[3] + zenAstelo[3] + wagnor[3] + marutisx[3];

    System.out.println("Total number of people who like Maruti in " + c1 + " are:
    " + total[0]);
    System.out.println("Total number of people who like Zen Astelo in " + c1 + "
    are: " + total[1]);
    System.out.println("Total number of people who like Wagnor in " + c1 + " are:
    " + total[2]);
    System.out.println("Total number of people who like Maruti SX in " + c1 + "
    are: " + total[3]);

    }

    public static void getMatrix(int mat[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public static int rowSum(int mat[][], int row) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = sum + mat[row][i];
        }
        return sum;
    }

    public static int colSum(int mat[][], int col) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = sum + mat[i][col];
        }
        return sum;
    }

    public static int[][] printMatrixSum(int mat[][]) {
        int sum[][] = new int[4][4];
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                mat[i][j] = sc.nextInt();
                sum[0][3] = rowSum(mat, 0);
                sum[1][3] = rowSum(mat, 1);
                sum[2][3] = rowSum(mat, 2);
                sum[3][3] = rowSum(mat, 3);
                sum[3][0] = colSum(mat, 0);
                sum[3][1] = colSum(mat, 1);
                sum[3][2] = colSum(mat, 2);
                sum[3][3] = colSum(mat, 3);
            }
        }
        return sum;
    }

    public static void printMatrix(int sum[][]) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int MaxElement(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int MinElement(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void printMaxMin(int arr[][]) {
    int max = arr[0][0];
    int min = arr[0][0];
    int maxDay = 0;
    int minDay = 0;
    for (int i = 0; i < 4; i++) {
    max = MaxElement(arr[i]);
    min = MinElement(arr[i]);
    for (int j = 0; j < 4; j++) {
    if (arr[i][j] == max) {
    maxDay = j + 1;
    }
    if (arr[i][j] == min) {
    minDay = j + 1;
    }
    }
    System.out.println("Maximum Temperature is " + max + " on " + maxDay + " Day
    of this month in " + city[i]);
    System.out.println("Minimum Temperature is " + min + " on " + minDay + " Day
    of this month in " + city[i]);
    }
    }

    public static String permutation(String s) {
        if (s.length() == 0) {
            return "";
        }
        char ch = s.charAt(0);
        String ros = s.substring(1);
        String res = "";
        for (int i = 0; i <= ros.length(); i++) {
            res = res + permutation(ros.substring(0, i) + ch + ros.substring(i));
        }
        return res;
    }

    public static void duplicate(String s) {
        int count = 0;
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0") {
                System.out.println(words[i]);
            }
        }
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseWord(word);
            result.append(reversedWord).append(" ");
        }

        return result.toString().trim();
    }

    public static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }

        return reversed.toString();
    }

    public static void duplicate(String s) {
        int count = 0;
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0") {
                System.out.println(words[i]);
            }
        }
    }

    public static int occurence(String s) {
        int count = 0;
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0") {
                System.out.println(words[i]);
            }
        }
        return count;
    }

    // Write a program to calculate the sum of command line argument and also find
    // the invalid integers entered.

    public static void sum(String[] args) {
        int sum = 0;
        int invalid = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                sum = sum + Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                invalid++;
            }
        }
        System.out.println("Sum of valid integers is " + sum);
        System.out.println("Invalid integers are " + invalid);
    }

    // Write a program to create a dictionary from a string. Track the count of the
    // letters from the string.

    public static void dictionary(String s) {
        Map<Character, Integer> letterCountMap = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            letterCountMap.put(letter, letterCountMap.getOrDefault(letter, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            char letter = entry.getKey();
            int count = entry.getValue();
            System.out.println(letter + ": " + count);
        }
    }

    // Write a program to get the top three items in a shop.

    public static LinkedHashMap<String, Integer> topThreeItems(LinkedHashMap<String, Integer> items) {
        LinkedHashMap<String, Integer> topThreeItems = new LinkedHashMap<>();
        int count = 0;
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            if (count < 3) {
                topThreeItems.put(entry.getKey(), entry.getValue());
                count++;
            }
        }
        return topThreeItems;
    }

    // Write a program to remove duplicates from a list

    public static void removeDuplicates(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
    }
}

class parent {

    String name = "Parent";

    parent() {
        System.out.println("Parent class constructor");
    }

    public void display() {
        System.out.println("Parent class");
    }
}

class child extends parent {

    String name = "Child";

    child() {
        super();
        System.out.println("Child class constructor");
    }

    public void display() {
        super.display();
        System.out.println("Child class");
    }

    public void show() {
        System.out.println("Accessing parent class method->" + super.name);
    }
}

// Write a program to create a class named shape. In this class we have three
// sub classes circle, triangle and square each class has two member function
// named draw () and erase (). Create these using runtime polymorphism concepts.

class shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }

    public void erase() {
        System.out.println("Erasing Shape");
    }
}

class circle extends shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void erase() {
        System.out.println("Erasing Circle");
    }
}

class triangle extends shape {
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

class square extends shape {
    public void draw() {
        System.out.println("Drawing Square");
    }

    public void erase() {
        System.out.println("Erasing Square");
    }
}

class BankAccount {
    String name;
    int accno;
    String type;
    double balance;
    private int balance;

    BankAccount(String name, int accno, String type, double balance) {
        this.name = name;
        this.accno = accno;
        this.type = type;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Type: " + type);
        System.out.println("Balance: " + balance);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

}

// Define an exception class called “MyNationException” that is thrown when a
// string is not equal to “jai hind” or “JAI HIND”. Write a program that
// implements this exception.

class MyNationException extends Exception {
    MyNationException(String s) {
        super(s);
    }

    String.toString() {
        return "MyNationException: " + getMessage();
    }
}

public class ProducerConsumer {

    LinkedList<Integer> list = new LinkerList<Integer>();
    int capacity = 10;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == capacity)
                    wait();
                System.out.println("Producer produced-" + value);
                list.add(value++);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.size() == 0)
                    wait();
                int val = list.removeFirst();
                System.out.println("Consumer consumed-" + val);
                notify();
                Thread.sleep(1000);
            }
        }
    }

}

// Create a program to generate two threads, one thread will print odd numbers
// and second thread will print even numbers between 1 to 20 numbers.

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Thread: " + i);
            }
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Thread: " + i);
            }
        }
    }
}

// Demonstrate Checked & Unchecked Exception Propagation.

class TestExceptionPropagation1 {
    void m() {
        throw new java.io.IOException("device error");// checked exception
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }
}

// Suppose only one berth is available in a train and two passengers are asking
// for that berth in two different counters. The clerks at different counters
// sent a request to the server to allot that berth to their passengers. And
// only one passenger is eligible to get the berth in a train, another passenger
// get a message “Sorry Berth unavailable”. Solve this problem using
// synchronized keyword.

class Train {
    synchronized void book(String name) {
        System.out.println(name + " booked a ticket");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(name + " got a ticket");
    }
}

class MyThread1 extends Thread {
    Train t;

    MyThread1(Train t) {
        this.t = t;
    }

    public void run() {
        t.book("Rahul");
    }
}

public class Revision {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Enter the string: ");
        // String s = sc.next();

        // solution s = new solution();
        // s.duplicate(s);
        // s.occurence(s);
        // s.reverseWords(s);
        // s.permutation(s);
        // s.printMaxMin(s);
        // s.printMatrix(s);
        // s.rowSum(s);

        // BankAccount b = new BankAccount();
        // int bal = sc.nextInt();
        // b.setBalance(bal);
        // b.getBalance();
        // b.deposit(bal);
        // b.withdraw(bal);
        // b.getBalance();

        // child c = new child();
        // c.display();
        // c.show();

        // shape s = new shape();
        // s.draw();
        // s.erase();

        try {
            System.out.println("Enter the string: ");
            String s = sc.next();
            if (s.equals("jai hind") || s.equals("JAI HIND")) {
                System.out.println("Jai Hind");
            } else {
                throw new MyNationException("Not Jai Hind");
            }
        } catch (MyNationException e) {
            // TODO: handle exception
            System.out.println(e);
        }

        ProducerConsumer pc = new ProducerConsumer();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        TestExceptionPropagation1 obj = new TestExceptionPropagation1();
        obj.p();
        System.out.println("normal flow...");

        OddThread ot = new OddThread();
        EvenThread et = new EvenThread();

        ot.start();
        et.start();

        MyThread t = new MyThread();
        t.start();

        MyThread1 t1 = new MyThread1(new Train());
        MyThread1 t2 = new MyThread1(new Train());

        t1.start();
        t2.start();

    }
}