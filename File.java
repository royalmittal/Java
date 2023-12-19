import java.util.*;
import java.io.*;

public class File {

    // Create a program to count number of character, words and lines in a file.

    public static LinkedList<String> readFile(String fileName) {
        LinkedList<String> lines = new LinkedList<String>();
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lines;
    }

    //Create a Program to demonstrate Object Serialization and Object De-serialization.
    //explain

    public static Object deserialize(String fileName) {
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return obj;
    }

    public static void serialize(Object obj, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> lines = readFile("File.java");
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        for (String line : lines) {
            lineCount++;
            String[] words = line.split(" ");
            wordCount += words.length;
            for (String word : words) {
                charCount += word.length();
            }
        }
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);

        serialize(new Student("Rahul", 20), "student.ser");
        Student s = (Student) deserialize("student.ser");
        System.out.println(s.name + " " + s.age);

        
    }
}
