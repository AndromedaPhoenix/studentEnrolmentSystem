import java.time.LocalDate;

public class Enrolment {
    private Student student;
    private Course course;
    private LocalDate enrolDate;

    public Enrolment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.enrolDate = LocalDate.now();
    }

    public void displayEnrolmentDetails() {
        System.out.println("Enrolment: " + student.getName() +
                " → " + course + " on " + enrolDate);
    }
}