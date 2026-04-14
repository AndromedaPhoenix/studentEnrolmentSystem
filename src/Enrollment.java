
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represents the enrollment relationship between a Student and a Course,
 * including the date of enrollment.
 */
public class Enrollment {
    private student student;
    private Course course;
    private LocalDate enrollmentDate;

    // Constructor automatically sets the enrollment date to today
    public Enrollment(student student, Course course) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = LocalDate.now();
    }

    // Getters and Setters
    public student getStudent() {
        return student;
    }

    public void setStudent(student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    /**
     * Displays enrollment details (student, course, date).
     */
    public void displayEnrollmentDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Enrollment: " + student.getName() +
                " (" + student.getStudentId() + ") in " +
                course.getCourseCode() + " on " +
                enrollmentDate.format(formatter));
    }
}