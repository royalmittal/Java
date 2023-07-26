import java.util.*;

// class OverloadingCalculation3 {
//     void sum(int a, long b) {
//         System.out.println("a method invoked");
//     }

//     void sum(long a, int b) {
//         System.out.println("b method invoked");
//     }
// }

// class Alpha {
//     static String s = " ";

//     protected Alpha() {
//         s += "alpha ";
//     }
// }

// class SubAlpha extends Alpha {
//     private SubAlpha() {
//         s += "sub ";
//     }
// }

// public class SubSubAlpha extends Alpha {
//     private SubSubAlpha() {
//         s += "subsub ";
//     }
// }

// class First {
//     void display() {
//         System.out.println("Inside First");
//     }
// }

// class Second extends First {
//     void display() {
//         System.out.println("Inside Second");
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         First obj1 = new First();
//         Second obj2 = new Second();
//         First ref;
//         ref = obj1;
//         ref.display();
//         ref = obj2;
//         ref.display();
//     }
// }

// Write a program to accept a date in the string format dd/mm/ yyyy and accept the name of
// the day on the 1st of January of the corresponding year. Find the day for the given date.
// Example:
// Input:
// Date: 5/7/2001
// Day on 1st January: MONDAY
// Output :
// Day on 5/7/2001 : THURSDAY
// Run the program on the following inputs:
// Input Date Day on 1st January Output day for
// 04/9/1998 THURSDAY FRIDAY
// 31/8/1999 FRIDAY TUESDAY
// 06/12/2000 SATURDAY WEDNESDAY
// The program should include the part for validating the inputs namely the date and day on the
// 1st January of that year.

class Date {
    int day;
    int month;
    int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Day {
    String day;

    Day(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}

// Define a base class and a derived class to find the HCF and LCM of two
// numbers.
// The details of both the classes are given below:
// Class name : Base
// Data members/instance variables:
// n1, n2 : integers whose hcf and lcm is to be determined.
// Member functions/methods:
// void accept () : To accept integers n1 and n2.
// void display () : To display n1 and n2 with suitable messages.
// Class name : Derive
// Data members/instance variables:
// hc, Ic : Integers to store hcf and lcm.
// Member functions/methods:
// void Swap() : To interchange values of n1 and n2 if n1 < n2.
// void findHcf() : To find and store hcf of n1, n2 in hc
// To find hcf make use of following method:
// (i) Decide greater and smaller numbers out of two.
// (ii) Divide the greater number by smaller number, if remainder
// is zero (0), then divisor would be the hcf, otherwise
// (iii) Store divisor as dividend (number) and remainder as
// divisor then repeat steps from (ii).
// void find Lcm() : To find lcm of n1 and n2 by making use of hcf
// which has already been calculated
// lcm = Product of numbers/hcf
// void show() : To display values of n1 and n2 by invoking suitable function
// and display hcf and lcm along with suitable message.
// (a) Specify the class Base giving details of functions void accept () and
// void display ().
// (b) Using concept of inheritance, specify the class Derive, giving details of
// the functions
// void Swap(), void findLcm() and void show(). Also, define the main method and
// display
// the hcf and lcm of two numbers as given by user.

class Base {
    int n1;
    int n2;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        n2 = sc.nextInt();
    }

    void display() {
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
    }
}

class Derive extends Base {
    int hc;
    int lc;

    void Swap() {
        if (n1 < n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
    }

    void findHcf() {
        int dividend = n1;
        int divisor = n2;
        int remainder = dividend % divisor;
        while (remainder != 0) {
            dividend = divisor;
            divisor = remainder;
            remainder = dividend % divisor;
        }
        hc = divisor;
    }

    void findLcm() {
        lc = (n1 * n2) / hc;
    }

    void show() {
        display();
        System.out.println("HCF: " + hc);
        System.out.println("LCM: " + lc);
    }
}

public class Assignment2 {
    public static void main(String args[]) {
        // OverloadingCalculation3 obj = new OverloadingCalculation3();
        // obj.sum(20, 20);
        // new SubSubAlpha();
        // System.out.println(s);
        // StringBuffer str1 = new StringBuffer("java");
        // StringBuffer str2 = str1;
        // str1.append("assignment");
        // System.out.println(str1 + " " + str2 + " " + (str1 == str2));
        // Date date = new Date(5, 7, 2001);
        // Day day = new Day("MONDAY");
        // System.out.println("Day on " + date.getDay() + "/" + date.getMonth() + "/" +
        // date.getYear() + " : " + getDay(date, day));
        Derive obj = new Derive();
        obj.accept();
        obj.Swap();
        obj.findHcf();
        obj.findLcm();
        obj.show();
    }
}