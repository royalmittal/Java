import java.util.*;

class employee {
    String empname;
    int empcode;
    double basicpay;

    public employee() {
        this.empname = null;
        this.empcode = 0;
        this.basicpay = 0;
    }

    public employee(String n, int p, double q) {
        this.empname = n;
        this.empcode = p;
        this.basicpay = q;
    }

    public void display() {
        System.out.println("Employee Name: " + this.empname);
        System.out.println("Employee Code: " + this.empcode);
        System.out.println("Basic Pay: " + this.basicpay);
    }

    public double salaryCalc() {
        double salary;
        salary = this.basicpay + (this.basicpay * 0.4) + (this.basicpay * 0.3);
        if (salary < 2500) {
            if (empcode <= 15 && salary <= 15000) {
                salary = salary + 0.2 * salary;
            } else {
                salary = salary + 1000;
            }
        }
        return salary;
    }
}

class Product {
    String name;
    int code;
    double amount;

    public Product() {
        this.name = null;
        this.code = 0;
        this.amount = 0;
    }

    public Product(String n, int p, double q) {
        this.name = n;
        this.code = p;
        this.amount = q;
    }

    public void display() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Product Code: " + this.code);
        System.out.println("Product Amount: " + this.amount);
    }
}

class Sales extends Product {
    int day;
    double fine, tax, totamt;

    public Sales() {
        this.day = 0;
        this.tax = 0;
        this.totamt = 0;
    }

    public Sales(String n, int p, double q, int d) {
        super(n, p, q);
        this.day = d;
    }

    public void compute() {
        double serviceTax;
        serviceTax = this.amount * 1.24;
        if (day > 30) {
            fine = this.amount * 0.25;
        } else {
            fine = 0;
        }
        this.tax = serviceTax + fine;
        this.totamt = this.amount + this.tax;
    }

    public void display() {
        super.display();
        System.out.println("Day: " + this.day);
        System.out.println("Tax: " + this.tax);
        System.out.println("Total Amount: " + this.totamt);
        System.out.println("Fine: " + fine);
    }
}

class shape {
    double area;

    public shape() {
        this.area = 0;
    }

    public void display() {
        System.out.println("Area: " + this.area);
    }
}

class square extends shape {
    double side;

    public square() {
        this.side = 0;
    }

    public square(double s) {
        this.side = s;
    }

    public void area() {
        this.area = this.side * this.side;
    }

    public void display() {
        super.display();
    }
}

class rectangle extends shape {
    double length, breadth;

    public rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public void area() {
        this.area = this.length * this.breadth;
    }

    public void display() {
        super.display();
    }
}

class circle extends shape {
    double radius;

    public circle() {
        this.radius = 0;
    }

    public circle(double r) {
        this.radius = r;
    }

    public void area() {
        this.area = 3.14 * this.radius * this.radius;
    }

    public void display() {
        super.display();
    }
}

public class JavaLab5 {
    public static void main(String[] args) {
        System.out.println("Employee:");
        employee e = new employee("Kushagra Mittal", 10, 25000);
        e.display();
        System.out.println("Salary: " + e.salaryCalc());
        System.out.println();
        System.out.println("Sales:");
        Sales s = new Sales("Laptop", 1, 25000, 31);
        s.compute();
        s.display();
        System.out.println("Shape:");
        square sq = new square(5);
        sq.area();
        sq.display();
        rectangle r = new rectangle(5, 10);
        r.area();
        r.display();
        circle c = new circle(5);
        c.area();
        c.display();
    }
}