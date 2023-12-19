import java.util.*;
import java.io.*;

//GRAPHICS
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// JDBC
import java.sql.*;

// class Graphics implements ActionListener {

//     TextField textField;

//     void check() {
//         Frame f = new Frame("hello frame");
//         textField = new TextField();
//         textField.setBounds(60, 50, 180, 25);
//         Button button = new Button("click Here");
//         button.setBounds(100, 120, 80, 30);
//         button.addActionListener(this);

//         f.add(textField);
//         f.add(button);
//         f.setSize(400, 400);
//         f.setVisible(true);
//         f.setLayout(null);
//     }

//     public void actionPerformed(ActionEvent e) {
//         textField.setText("I AM IN A CLASS!");
//     }
// }

// Create a Login form having User-Id and Password fields. After submitting the
// form matches the user-id and password with existing user-id and password. If
// user-id and password match a welcome message should be appear.

// class NextPage extends JFrame {
//     NextPage() {
//         JFrame frame = new JFrame("Welcome");
//         JLabel label = new JLabel("Welcome");
//         frame.add(label);
//         frame.setSize(400, 400);
//         frame.setLayout(null);
//         frame.setVisible(true);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }

// class Login extends JFrame implements ActionListener {
//     JLabel l1, l2, l3;
//     JTextField tf1;
//     JButton btn1;
//     JPasswordField p1;

//     Login() {
//         JFrame frame = new JFrame("Login Form");
//         l1 = new JLabel("Login Form");
//         l1.setForeground(Color.blue);
//         l1.setFont(new Font("Serif", Font.BOLD, 20));

//         l2 = new JLabel("Enter Email:");
//         l3 = new JLabel("Enter Password:");
//         tf1 = new JTextField();
//         p1 = new JPasswordField();
//         btn1 = new JButton("Submit");

//         l1.setBounds(100, 30, 400, 30);
//         l2.setBounds(80, 70, 200, 30);
//         l3.setBounds(80, 110, 200, 30);
//         tf1.setBounds(300, 70, 200, 30);
//         p1.setBounds(300, 110, 200, 30);
//         btn1.setBounds(150, 160, 100, 30);

//         frame.add(l1);
//         frame.add(l2);
//         frame.add(tf1);
//         frame.add(l3);
//         frame.add(p1);
//         frame.add(btn1);

//         frame.setSize(400, 400);
//         frame.setLayout(null);
//         frame.setVisible(true);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public void actionPerformed(ActionEvent e) {
//         String s1 = tf1.getText();
//         String s2 = p1.getText();
//         if (s1.equals("admin") && s2.equals("admin")) {
//             NextPage page = new NextPage();
//             page.setVisible(true);
//             JLabel label = new JLabel("Welcome:" + s1);
//             page.getContentPane().add(label);
//         } else {
//             JOptionPane.showMessageDialog(this, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
//         }
//     }
// }

// // Store some country names and their capitals. Ask the user to select a country
// // and its capital from given two lists. If the match is correct, display
// // “Correct answer”, otherwise display error message and tell the correct
// // answer.

// class WrongGK extends Exception {
//     WrongGK(String s) {
//         super(s);
//     }

//     // printing message
//     public String toString() {
//         return "Wrong Answer";
//     }
// }

// class Country extends JFrame implements ActionListener {
//     JTextField tf1;
//     JButton btn1;
//     JLabel l1, l2, l3;
//     JComboBox<String> cb1, cb2;

//     Country() {
//         JFrame frame = new JFrame("Country");
//         l1 = new JLabel("Country");
//         l2 = new JLabel("Capital");
//         l3 = new JLabel("Result");
//         tf1 = new JTextField();
//         btn1 = new JButton("Submit");
//         String country[] = { "India", "USA", "UK", "China", "Japan" };
//         String capital[] = { "Delhi", "Washington", "London", "Beijing", "Tokyo" };
//         cb1 = new JComboBox<>(country);
//         cb2 = new JComboBox<>(capital);

//         l1.setBounds(80, 70, 200, 30);
//         l2.setBounds(80, 110, 200, 30);
//         l3.setBounds(80, 150, 200, 30);
//         tf1.setBounds(300, 150, 200, 30);
//         btn1.setBounds(150, 200, 100, 30);
//         cb1.setBounds(300, 70, 200, 30);
//         cb2.setBounds(300, 110, 200, 30);

//         frame.add(l1);
//         frame.add(l2);
//         frame.add(l3);
//         frame.add(tf1);
//         frame.add(btn1);
//         frame.add(cb1);
//         frame.add(cb2);

//         btn1.addActionListener(this); // Registering the ActionListener

//         frame.setSize(400, 400);
//         frame.setLayout(null);
//         frame.setVisible(true);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         try {
//             String s1 = cb1.getSelectedItem().toString();
//             String s2 = cb2.getSelectedItem().toString();
//             String s3 = tf1.getText();
//             if (s1.equals(s2) && s2.equals(s3)) {
//                 JOptionPane.showMessageDialog(this, "Correct Answer", "Result", JOptionPane.INFORMATION_MESSAGE);
//             } else {
//                 JOptionPane.showMessageDialog(this, "Incorrect Answer", "Result", JOptionPane.ERROR_MESSAGE);
//             }
//         } catch (WrongGK ex) {
//             System.out.println(ex);
//         }
//     }
// }

// Create a program to display the records from employees table who were working
// in the department as entered by the user.

class Record extends JFrame {
    Record() {
        JFrame frame = new JFrame("Record");
        JLabel l1 = new JLabel("Department");
        JTextField tf1 = new JTextField();
        JButton btn1 = new JButton("Submit");
        l1.setBounds(80, 70, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        btn1.setBounds(150, 200, 100, 30);
        frame.add(l1);
        frame.add(tf1);
        frame.add(btn1);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// class Drawing extends JPanel {
// public void paintComponent(Graphics g) {
// super.paintComponent(g);
// g.setColor(Color.yellow);
// g.fillOval(100, 100, 200, 200);
// g.setColor(Color.black);
// g.fillOval(155, 175, 10, 20);
// g.fillOval(230, 175, 10, 20);
// g.drawArc(150, 150, 100, 100, 180, 180);
// }
// }

// class Graphics implements ActionListener {

// JTextField textField1, textField2, textField3;
// JButton button1, button2;

// void check() {
// JFrame f = new JFrame("hello frame");
// textField1 = new JTextField();
// textField1.setBounds(60, 50, 200, 30);
// textField2 = new JTextField();
// textField2.setBounds(60, 150, 200, 30);
// textField3 = new JTextField("Result");
// textField3.setBounds(60, 200, 200, 30);

// button1 = new JButton("ADD");
// button1.setBounds(60, 250, 100, 100);
// button2 = new JButton("SUB");
// button2.setBounds(60, 400, 100, 100);

// button1.addActionListener(this);
// button2.addActionListener(this);
// f.add(textField1);
// f.add(textField2);
// f.add(textField3);
// f.add(button1);
// f.add(button2);
// f.setSize(500, 500);
// f.setVisible(true);
// }

// public void actionPerformed(ActionEvent e) {
// int n1 = Integer.parseInt(textField1.getText());
// int n2 = Integer.parseInt(textField2.getText());
// if (e.getSource() == button1) // getSource()
// textField3.setText(String.valueOf(n1 + n2));
// else if (e.getSource() == button2)
// textField3.setText(String.valueOf(n1 - n2));
// }
// }

// Design an application that display all the records of Department table (DEPT)
// one by one.

class Department extends JFrame implements AWTEventListener {
    Department() {
        JLabel Jl, Jl2, Jl3;
        JTextField Jt, Jt2, Jt3;
        JButton Jb, jb2, jb3, jb4;
        JFrame frame = new JFrame("Department");
        Jl = new JLabel("Department Number");
        Jl2 = new JLabel("Department Name");
        Jl3 = new JLabel("Department Location");
        Jt = new JTextField();
        Jt2 = new JTextField();
        Jt3 = new JTextField();
        Jb = new JButton("First");
        jb2 = new JButton("Next");
        jb3 = new JButton("Previous");
        jb4 = new JButton("Last");
        Jl.setBounds(80, 70, 200, 30);
        Jl2.setBounds(80, 110, 200, 30);
        Jl3.setBounds(80, 150, 200, 30);
        Jt.setBounds(300, 70, 200, 30);
        Jt2.setBounds(300, 110, 200, 30);
        Jt3.setBounds(300, 150, 200, 30);
        Jb.setBounds(80, 200, 100, 30);
        jb2.setBounds(200, 200, 100, 30);
        jb3.setBounds(320, 200, 100, 30);
        jb4.setBounds(440, 200, 100, 30);
        frame.add(Jl);
        frame.add(Jl2);
        frame.add(Jl3);
        frame.add(Jt);
        frame.add(Jt2);
        frame.add(Jt3);
        frame.add(Jb);
        frame.add(jb2);
        frame.add(jb3);
        frame.add(jb4);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Jb) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
                        "oracle");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from dept");
                rs.next();
                Jt.setText(rs.getString(1));
                Jt2.setText(rs.getString(2));
                Jt3.setText(rs.getString(3));
                con.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if (e.getSource() == jb2) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
                        "oracle");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from dept");
                rs.next();
                Jt.setText(rs.getString(1));
                Jt2.setText(rs.getString(2));
                Jt3.setText(rs.getString(3));
                con.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if (e.getSource() == jb3) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
                        "oracle");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from dept");
                rs.next();
                Jt.setText(rs.getString(1));
                Jt2.setText(rs.getString(2));
                Jt3.setText(rs.getString(3));
                con.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if (e.getSource() == jb4) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
                        "oracle");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from dept");
                rs.next();
                Jt.setText(rs.getString(1));
                Jt2.setText(rs.getString(2));
                Jt3.setText(rs.getString(3));
                con.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}

public class Graphics {
    public static void main(String[] args) {
        // JFrame frame = new JFrame("Funny Face");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Drawing panel = new Drawing();
        // frame.add(panel);
        // frame.setSize(500, 500);
        // frame.setVisible(true);

        // Login login = new Login();
        // login.setVisible(true);

        // Country country = new Country();
        // country.setVisible(true);

        // Record record = new Record();
        // record.setVisible(true);
        // Graphics graphics = new Graphics();
        // graphics.check();

        Department department = new Department();
        department.setVisible(true);

    }

}
