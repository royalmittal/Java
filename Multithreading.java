import java.lang.Runnable;
import java.lang.Thread;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getId() + " is running");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getId() + ", Count: " + i);
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        Thread thread3 = new MyThread();
        Thread thread4 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
