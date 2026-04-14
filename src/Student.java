/**
 * The student class represent the single student in the enrolment system
 * this class uses a encapsulation feature of OOP by keeping attributes like studentId, name and email private
 */

public class Student {
    //this attributes handles unique Id for student, name and email.
    private String studentId;
    private String name;
    private String email;

    /**
     * constructor to create a new student object.
     * This ensures every student has valid data when created.
     * @param studentId
     * @param name
     * @param email
     */
    public Student(String studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    //Getter methods which give direct access to private attributes and restrict modification of origin
    //It demonstrates the true features of encapsulation
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    /**
     * Display the student information.
     * Can be useful if users want to see enrollment details
     */
   /** public void displayInfo() {
        System.out.println("Student ID: " + studentId +
                ", Name: " + name +
                ", Email: " + email);
    }
    */

   public void displayInfo() {
       String line = "┌─────────────────────────────────────────┐";
       String mid = "├─────────────────────────────────────────┤";
       String end = "└─────────────────────────────────────────┘";

       System.out.println("\n" + line);
       System.out.println("│           📋 STUDENT DETAILS            │");
       System.out.println(mid);
       System.out.printf("│ %-12s: %-25s │%n", "Student ID", studentId);
       System.out.printf("│ %-12s: %-25s │%n", "Name", name);
       System.out.printf("│ %-12s: %-25s │%n", "Email", email);
       System.out.println(end);
       System.out.println();
   }
}