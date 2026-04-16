import java.time.LocalDate;

/**
 * Enrolment class make a realtionship between student and course. It contains details such as course, date and student
 * name.
 */
public class Enrolment {
    //each attribute is the refrence to the  single student, course and date or enrolment.
    private Student student;
    private Course course;
    private LocalDate enrolDate;

    /**
     * Constructor create a new records of enrolment while keeping original attribute capsulated.
     * @param student
     * @param course
     */
    public Enrolment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.enrolDate = LocalDate.now();
    }

    /**
     * Display the details of enrolment.
     */
   /** public void displayEnrolmentDetails() {
        System.out.println("Enrolment: " + student.getName() +
                " → " + course + " on " + enrolDate);
    }
    */
   public void displayEnrolmentDetails() {
       System.out.println("====================================");
       System.out.println("          ENROLMENT DETAILS         ");
       System.out.println("====================================");
       System.out.println("Student        : " + student.getName());
       System.out.println("Course         : " + course);
       System.out.println("Enrolment Date : " + enrolDate);
       System.out.println("====================================");
   }
}