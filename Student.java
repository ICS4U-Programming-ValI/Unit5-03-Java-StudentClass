import java.io.PrintWriter;

public class Student {
    public String firstName;
    public String middleInitial;
    public String lastName;
    public int grade;
    public boolean iep;

    public Student(String firstName, String middleInitial, String lastName,
             int grade, String iep) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.grade = grade;
        if (iep.toLowerCase().equals("y") || iep.toLowerCase().equals("t")) {
            this.iep = true;
        } else {
            this.iep = false;
        }
    }
    public Student(String firstName, String lastName, int grade, String iep) {
        this.firstName = firstName;
        this.middleInitial = "";
        this.lastName = lastName;
        this.grade = grade;
        if (iep.toLowerCase().equals("y") || iep.toLowerCase().equals("t")) {
            this.iep = true;
        } else {
            this.iep = false;
        }
    }

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.middleInitial = "";
        this.lastName = lastName;
        this.grade = grade;
        this.iep = false;
    }
    // Print all students
    public void printStudents(Student student, PrintWriter printWriter) {
        printWriter.println("First Name: " + student.firstName);
        printWriter.println("Middle Initial: " + student.middleInitial);
        printWriter.println("Last Name: " + student.lastName);
        printWriter.println("Grade: " + student.grade);
        printWriter.println("IEP: " + student.iep);
        printWriter.println("");
    }


}