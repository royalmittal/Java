import java.util.*;

    class Pen {
        String color;
        int tip;

        void setColor(String newColor) {
            color = newColor;
            this.color = newColor;
        }

        void setTip(int newTip) {
            tip = newTip;
            this.tip = newTip;
        }

        String getColor() {
            return this.color;
        }

        String getTip() {
            return this.tip;
        }

    }

    class Student {
        String name;
        int roll;
        float percentage;

        void calpercentage(int phy, int math, int chem) {
            percentage = (math + phy + chem) / 3;
        }
    }

    class BankAccount {
        public String username;
        private String password;

        public void setpwd(String pwd) {
            password = pwd;
        }
    }

    public class OOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(3);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        BankAccount myAcc = new BankAccount();
    }
}
