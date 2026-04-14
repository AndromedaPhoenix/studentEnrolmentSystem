import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private int maxCapacity;

    private ArrayList<Student> enrolledStudents;
    private waitlist waitlist;

    public Course(String courseCode, String courseName, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
        this.waitlist = new waitlist();
    }

    public void displayCourseDetails() {
        System.out.println(courseCode + " - " + courseName +
                " (Capacity: " + maxCapacity + ")");
    }

    public void enrolStudent(Student student) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(student);
            System.out.println(student.getName() + " successfully enrolled.");
        } else {
            System.out.println("Course full! Adding to waitlist...");
            waitlist.addToWaitlist(student);
        }
    }

    public void processWaitlist() {
        if (enrolledStudents.size() < maxCapacity && !waitlist.isEmpty()) {
            Student next = waitlist.getNextStudent();
            enrolledStudents.add(next);
            System.out.println(next.getName() + " moved from waitlist to enrolled.");
        }
    }
}