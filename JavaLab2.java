import java.util.*;

public class JavaLab2 {

    static Scanner input = new Scanner(System.in);

    private int studentID;
    private String studentName, studentAddress, campus;
    private double studentGPA;

    public void getData() {
        System.out.println("Enter Student ID: ");
        studentID = input.nextInt();
        System.out.println("Enter Student Name: ");
        studentName = input.nextLine();
        System.out.println("Enter Student Address: ");
        studentAddress = input.nextLine();
        System.out.println("Enter Student Campus: ");
        campus = input.next();
        System.out.println("Enter Student GPA: ");
        studentGPA = input.nextDouble();
    }

    public void displayData() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Address: " + studentAddress);
        System.out.println("Student Campus: " + campus);
        System.out.println("Student GPA: " + studentGPA);
    }

    public static void banking() {
        int choice;
        System.out.println("WELOCME TO TCS BANKING SYSTEM");
        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        int amt = 0;

        switch (choice) {
            case 1:
                System.out.println("Enter amount for deposite");
                int depo = input.nextInt();
                amt += depo;
                System.out.println("Amount Deposited");
                System.out.println("Your current balance is: " + amt);
                break;
            case 2:
                System.out.println("Enter amount for withdraw");
                int wid = input.nextInt();
                if (amt > wid) {
                    amt -= wid;
                    System.out.println("Amount Withdrawn");
                    System.out.println("Your current balance is: " + amt);
                } else {
                    System.out.println("Tum Gareeb ho!!!");
                }
                break;
            case 3:
                System.out.println(amt);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void main(String[] args) {
        // JavaLab2 student = new JavaLab2();
        // student.getData();
        // student.displayData();
        banking();
    }
}
