import java.util.Scanner;

class employee {
    static Scanner sc = new Scanner(System.in);

    int pan;
    String name;
    double taxincome;
    double tax;

    public employee(int pan, String name, double taxincome) {
        this.pan = pan;
        this.name = name;
        this.taxincome = taxincome;
    }

    public void input() {
        System.out.println("Enter the name of the employee");
        name = sc.nextLine();
        System.out.println("Enter the pan number of the employee");
        pan = sc.nextInt();
        System.out.println("Enter the taxable income of the employee");
        taxincome = sc.nextDouble();
    }

    public void calculateTax() {
        if (taxincome < 100000) {
            tax = taxincome * 0.1;
        } else if (taxincome >= 100000 && taxincome < 150000) {
            tax = taxincome * 0.2;
        } else if (taxincome >= 150000 && taxincome < 2500000) {
            tax = taxincome * 0.3;
        }
    }

    public void display() {
        System.out.println(pan + " " + name + " " + taxincome + " " + tax);
    }

}

public class bank {
    public static void main(String[] args) {
        employee e = new employee(0, "", 0);
        e.input();
        e.calculateTax();
        e.display();
    }
}