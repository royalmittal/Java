import java.util.*;
// //P8 task 1

// class animal {
// public void eat() {
// System.out.println("Animal is eating");
// }
// }

// class mammal extends animal {
// public void eat() {
// System.out.println("Mammal is eating");
// }
// }

// // p8 task 2
// // constructor call in Multi Level Inheritance

// class A {
// int i = 10;

// public A(int i) {
// this.i = i;
// }
// }

// class B extends A {
// int j = 20;

// public B(int i, int j) {
// super(i);
// this.j = j;
// }
// }

// class C extends B {
// int k = 30;

// public C(int i, int j, int k) {
// super(i, j);
// this.k = k;
// }
// }

// // polymorphism in java

// class ABC {
// public void show() {
// System.out.println("In ABC");
// }
// }

// class CBA extends ABC {
// public void show() {
// System.out.println("In CBA");
// }

// // overloading
// public void show(int i) {
// System.out.println("In CBA with i = " + i);
// }

// // overriding
// public void show(String s) {
// System.out.println("In CBA with s = " + s);
// }
// }

// public class Java {

// // static and non-static methods
// public static void staticMethod() {
// System.out.println("Static Method");
// }

// public void nonStaticMethod() {
// System.out.println("Non Static Method");
// }

// public static void main(String[] args) {
// // p8 task 1
// mammal m = new mammal();
// m.eat();

// // p8 task 2
// C c = new C(1, 2, 3);
// System.out.println();
// System.out.println(c.i + " " + c.j + " " + c.k);

// // p9 task 1
// // jagged array
// System.out.println("\nJagged Array");
// int[][] arr = new int[3][];
// arr[0] = new int[3];
// arr[1] = new int[4];
// arr[2] = new int[5];
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// arr[i][j] = i + j;
// }
// }
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }

// // p9 task 3
// System.out.println("\nStatic and Non Static Methods");
// Java.staticMethod();
// Java j = new Java();
// j.nonStaticMethod();

// // p10 task 1
// System.out.println("\nPolymorphism");
// ABC a = new ABC();
// a.show();
// CBA b = new CBA();
// b.show();
// b.show(10);
// b.show("Hello");
// }
// }

// interface in java

interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("In B");
    }
}

class C implements A {
    public void show() {
        System.out.println("In C");
    }
}

// swift number

public class Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Swift Number");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is a Swift Number");
        } else {
            System.out.println(n + " is not a Swift Number");
        }

        // interface in java

        A a = new B();
        a.show();
        a = new C();
        a.show();
    }
}