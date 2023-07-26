import java.util.*;
import java.io.*;

public class Streams {

    static Scanner sc = new Scanner(System.in);

    public static void PrintWriter() {
        System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(0);
        }
        PrintWriter pw = new PrintWriter(file);
        pw.write(100);
        pw.println("Hello World");
        pw.close();
        System.out.println("File created successfully");
    }

    public static void main(String[] args) {
        PrintWriter();
    }
}
