import java.util.*;
import java.io.*;

// Write a class Display having synchronized void wish(String) method that
// wishes hello to given string name. Between printing hello and provided string
// name apply delay of 500 milliseconds. Suppose multiple threads are there and
// they are trying to access this wish() method concurrently on different
// objects then irregular output will be there. Write this application in such a
// way so that output becomes regular.

class Display {
    public synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Hello ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(name);
        }
    }
}

public class JavaLab8 {

    public static void main(String[] args) {

        // Thread Displaying 1 to 10
        // Thread thread1 = new Thread(() -> {
        // for (int i = 1; i <= 10; i++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // });
        // thread1.start();

        // Thread thread2 = new Thread(() -> {
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Jai Shree Ram");
        // }
        // });
        // thread2.start();

        // Thread thread3 = new Thread(() -> {
        // for (int i = 0; i < 10; i++) {
        // System.out.println("JAVA");
        // }
        // });
        // thread3.start();

        // Thread Displaying Hello World
        Display d1 = new Display();
        Display d2 = new Display();
        Thread thread1 = new Thread(() -> {
            d1.wish("Kushagra");
        });

        Thread thread2 = new Thread(() -> {
            d2.wish("Mittal");
        });

        thread1.start();
        thread2.start();
    }
}
