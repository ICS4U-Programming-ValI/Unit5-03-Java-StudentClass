import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Read the file
        String filePath = "input.txt";
        File inputFile = new File(filePath);
        List<Student> students = new ArrayList<>();
        int counter = 0;
        // make output.txt
        File outputFile = new File("output.txt");
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        // make file writer
        try {
            fileWriter = new FileWriter(outputFile);
            printWriter = new PrintWriter(fileWriter);

            try {
                Scanner scanner = new Scanner(inputFile);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] items = line.split(" ");
                    Student student1 = null;

                    try {
                        if (items.length == 5) {
                            student1 = new Student(items[0], items[1].substring(0, 1), items[2],
                                    Integer.parseInt(items[3]), items[4].substring(0, 1));
                            student1.printStudents(student1, printWriter);
                        } else if (items.length == 4) {
                            student1 = new Student(items[0], items[1],
                                    Integer.parseInt(items[2]), items[3].substring(0, 1));
                            student1.printStudents(student1, printWriter);
                        } else if (items.length == 3) {
                            student1 = new Student(items[0], items[1], Integer.parseInt(items[2]));
                            student1.printStudents(student1, printWriter);
                        } else {
                            printWriter.println("Invalid input format");
                            printWriter.println("");
                            continue;
                        }

                    } catch (NumberFormatException ex) {
                        printWriter.println("Invalid input data: " + line);
                        printWriter.println("");
                    }
                    counter++;
                }
                // Print the number of students
                printWriter.println("Number of students: " + counter);

                // close the scanner
                scanner.close();
            } catch (FileNotFoundException ex) {
                System.out.println("File not found: " + filePath);
                return;
            }

            // close the file writer
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error creating output file: " + e.getMessage());
        }

    }
}
