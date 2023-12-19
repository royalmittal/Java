// import java.awt.*;
// import javax.Swing.*;
// import java.util.*;

// //CCreate a GUI for "Student Workshop for" taking all the relevant data of a student such as Name, Student id, Father's name, Mother's Name, Gender, Contact number, Email id, subject he/she is interested in, Complete address, is city, state, country. in java
// public class JavaLab9GUI {
//     public static void StudentWorkshop(){
//         JFrame frame = new JFrame("Student Workshop");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(500, 500);
//         frame.setVisible(true);
//     }
//     public static void main(String[] args) {
//         StudentWorkshop();
//     }
// }

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaLab9GUI extends JFrame {
    private JTextField nameField, studentIdField, fatherNameField, motherNameField, contactNumberField, emailField,
            subjectField;
    private JTextArea addressArea;
    private JComboBox<String> cityComboBox, stateComboBox, countryComboBox;
    private JButton submitButton;

    public JavaLab9GUI() {
        setTitle("GEU Student Workshop Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(12, 2, 10, 10));
        getContentPane().setBackground(Color.PINK);

        // Initialize components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel studentIdLabel = new JLabel("Student ID:");
        studentIdField = new JTextField();
        JLabel fatherNameLabel = new JLabel("Father's Name:");
        fatherNameField = new JTextField();
        JLabel motherNameLabel = new JLabel("Mother's Name:");
        motherNameField = new JTextField();
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        JLabel contactNumberLabel = new JLabel("Contact Number:");
        contactNumberField = new JTextField();
        JLabel emailLabel = new JLabel("Email ID:");
        emailField = new JTextField();
        JLabel subjectLabel = new JLabel("Interested Subject:");
        subjectField = new JTextField();
        JLabel addressLabel = new JLabel("Address:");
        addressArea = new JTextArea();
        JScrollPane addressScrollPane = new JScrollPane(addressArea);
        JLabel cityLabel = new JLabel("City:");
        cityComboBox = new JComboBox<>();
        cityComboBox.addItem("Dehradun");
        cityComboBox.addItem("Bhimtal");
        cityComboBox.addItem("Haldwani");
        JLabel stateLabel = new JLabel("State:");
        stateComboBox = new JComboBox<>();
        stateComboBox.addItem("Uttrakhand");
        stateComboBox.addItem("Uttar Pradesh");
        stateComboBox.addItem("Delhi");
        stateComboBox.addItem("Haryana");
        JLabel countryLabel = new JLabel("Country:");
        countryComboBox = new JComboBox<>();
        countryComboBox.addItem("India");
        countryComboBox.addItem("USA");
        countryComboBox.addItem("UK");
        countryComboBox.addItem("Australia");
        submitButton = new JButton("Submit");

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(studentIdLabel);
        add(studentIdField);
        add(fatherNameLabel);
        add(fatherNameField);
        add(motherNameLabel);
        add(motherNameField);
        add(genderLabel);
        add(genderPanel);
        add(contactNumberLabel);
        add(contactNumberField);
        add(emailLabel);
        add(emailField);
        add(subjectLabel);
        add(subjectField);
        add(addressLabel);
        add(addressScrollPane);
        add(cityLabel);
        add(cityComboBox);
        add(stateLabel);
        add(stateComboBox);
        add(countryLabel);
        add(countryComboBox);
        add(new JLabel()); // Empty label for spacing
        add(submitButton);

        // Submit button action listener
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get values from the form fields
                String name = nameField.getText();
                String studentId = studentIdField.getText();
                String fatherName = fatherNameField.getText();
                String motherName = motherNameField.getText();
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";
                String contactNumber = contactNumberField.getText();
                String email = emailField.getText();
                String subject = subjectField.getText();
                String address = addressArea.getText();
                String city = (String) cityComboBox.getSelectedItem();
                String state = (String) stateComboBox.getSelectedItem();
                String country = (String) countryComboBox.getSelectedItem();

                // Print the values (you can modify this to perform other actions)
                System.out.println("Name: " + name);
                System.out.println("Student ID: " + studentId);
                System.out.println("Father's Name: " + fatherName);
                System.out.println("Mother's Name: " + motherName);
                System.out.println("Gender: " + gender);
                System.out.println("Contact Number: " + contactNumber);
                System.out.println("Email ID: " + email);
                System.out.println("Interested Subject: " + subject);
                System.out.println("Address: " + address);
                System.out.println("City: " + city);
                System.out.println("State: " + state);
                System.out.println("Country: " + country);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JavaLab9GUI().setVisible(true);
            }
        });
    }
}
