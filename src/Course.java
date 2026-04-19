import java.util.ArrayList;

/**
 * This class represents a single course in enrolment system.
 * this class is important for main class to perform all the enrolment operations.
 * This class is also responsible for checking the capacity and interact with waitlist class if course is full
 */
public class Course {
    private String courseCode;
    private String courseName;
    private int maxCapacity;

    //List of students currently enrolled in the course
    private ArrayList<Student> enrolledStudents;

    //A separate waitlist to store the students if the current course is full
    private waitlist waitlist;


    /**
     * Constructor initilises a new course with it's given details.
     * @param courseCode
     * @param courseName
     * @param maxCapacity
     */
    public Course(String courseCode, String courseName, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
        this.waitlist = new waitlist();
    }
   //adding toString() to convert course attribute from enrolment class to redable format
   @Override
   public String toString() {
       return courseCode + " - " + courseName;
   }
    // adding getter for waitlist to display waitlist
    public waitlist getWaitlist() {
        return waitlist;
    }

    //Display course details with it's name, code and capacity
   /** public void displayCourseDetails() {
        System.out.println(courseCode + " - " + courseName +
                " (Capacity: " + maxCapacity + ")");
    }
    */
   // customise output
   public void displayCourseDetails() {
       System.out.println("┌──────────────────────────────────┐");
       System.out.println("│          COURSE DETAILS          │");
       System.out.println("├──────────────────────────────────┤");
       System.out.println("│ Code     : " + courseCode);
       System.out.println("│ Name     : " + courseName);
       System.out.println("│ Capacity : " + maxCapacity);
       System.out.println("└──────────────────────────────────┘");
   }
    /**
     * special modified methods which enrolled the students according to criteria.
     * If space is avaiable, the student is enrolled.
     * if not student is added to the waitlist.
     * @param student
     */
   /** public void enrolStudent(Student student) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(student);
            System.out.println(student.getName() + " successfully enrolled.");
        } else {
            System.out.println("Course full! Adding to waitlist...");
            waitlist.addToWaitlist(student);
        }
    }
    */
   public void enrolStudent(Student student) {
       if (enrolledStudents.size() < maxCapacity) {
           enrolledStudents.add(student);
           System.out.println("┌──────────────────────────────────┐");
           System.out.println("│        ENROLMENT SUCCESS         │");
           System.out.println("├──────────────────────────────────┤");
           System.out.println("│ Student : " + student.getName());
           System.out.println("│ Status  : Enrolled");
           System.out.println("└──────────────────────────────────┘");
       } else {
           System.out.println("┌──────────────────────────────────┐");
           System.out.println("│          COURSE IS FULL          │");
           System.out.println("├──────────────────────────────────┤");
           System.out.println("│ Student : " + student.getName());
           System.out.println("│ Status  : Added to Waitlist");
           System.out.println("└──────────────────────────────────┘");
           waitlist.addToWaitlist(student);
       }
   }

    /**
     * This method put back waiting student to the course if the sit is available
     */
    public void processWaitlist() {
        if (enrolledStudents.size() < maxCapacity && !waitlist.isEmpty()) {
            Student next = waitlist.getNextStudent();
            enrolledStudents.add(next);
            System.out.println(next.getName() + " moved from waitlist to enrolled.");
        }
    }
}