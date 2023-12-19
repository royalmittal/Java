// Program to calculate interest using method overriding
//Banking System

import java.util.*;
import javax.sound.midi.SysexMessage;

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 4.5f;
    }
}

class HDFC extends Bank {
    float getRateOfInterest() {
        return 4f;
    }
}

class PNB extends Bank {
    float getRateOfInterest() {
        return 5f;
    }
}

// program to calculate distance between two points

abstract class Point {

    float x1, y1, x2, y2, dist;

    public Point() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.dist = 0;
    }

    public Point(float x1, float y1, float x2, float y2, float dist) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.dist = dist;
    }

    public void showValue() {
        System.out.println("X1: " + x1);
        System.out.println("Y1: " + y1);
        System.out.println("X2: " + x2);
        System.out.println("Y2: " + y2);
    }
}

class Distance extends Point {
    public Distance() {
        super();
    }

    public Distance(float x1, float y1, float x2, float y2, float dist) {
        super(x1, y1, x2, y2, dist);
    }

    public void calculateDistance() {
        dist = (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public void showValue() {
        System.out.println("Distance: " + dist);
    }
}

class FindMidPont extends Point {
    public FindMidPont() {
        super();
    }

    public FindMidPont(float x1, float y1, float x2, float y2, float dist) {
        super(x1, y1, x2, y2, dist);
    }

    public void calculateMidPoint() {
        x1 = (x1 + x2) / 2;
        y1 = (y1 + y2) / 2;
    }

    public void showValue() {
        System.out.println("Mid Point: " + x1 + ", " + y1);
    }
}

public class JavaLab6 {
    public static void main(String[] args) {
        Bank b;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Choose Bank: ");
        // System.out.println("1. SBI");
        // System.out.println("2. HDFC");
        // System.out.println("3. PNB");
        // int choice = sc.nextInt();
        // System.out.println("You have chosen: " + choice);
        // System.out.println("Enter Principal Amount: ");
        // float p = sc.nextInt();
        // System.out.println("Enter Time Period: ");
        // float t = sc.nextInt();
        // switch (choice) {
        // case 1:
        // b = new SBI();
        // System.out.println("Interest: " + b.getRateOfInterest() * (1 + p * t));
        // break;
        // case 2:
        // b = new HDFC();
        // System.out.println("Interest: " + b.getRateOfInterest() * (1 + p * t));
        // break;
        // case 3:
        // b = new PNB();
        // System.out.println("Interest: " + b.getRateOfInterest() * (1 + p * t));
        // break;
        // default:
        // System.out.println("Invalid Choice");
        // }

        System.out.println("Enter Coordinates of Point 1: ");
        float x1 = sc.nextInt();
        float y1 = sc.nextInt();
        System.out.println("Enter Coordinates of Point 2: ");
        float x2 = sc.nextInt();
        float y2 = sc.nextInt();
        Distance d = new Distance(x1, y1, x2, y2, 0);
        FindMidPont f = new FindMidPont(x1, y1, x2, y2, 0);
        ;
        d.calculateDistance();
        f.calculateMidPoint();
        d.showValue();
        f.showValue();
    }
}
