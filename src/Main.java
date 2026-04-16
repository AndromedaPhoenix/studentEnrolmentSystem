public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("S123", "Padam", "padam@email.com");
        Student s2 = new Student("S124", "Sugal", "sugal@email.com");
        Student s3 = new Student("S125", "Pranita", "pranita@email.com");

        Course c1 = new Course("ITS206", "Software Construction", 2);
        Course c2 = new Course("ITS205", "Software Engineering", 2);

        c1.enrolStudent(s1);
        c1.enrolStudent(s2);
        c1.enrolStudent(s3); // goes to waitlist

        System.out.println("\nProcessing waitlist...");
        c1.processWaitlist();

        //testing displayInfo method
        s1.displayInfo();
        s2.displayInfo();

        //testing display course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        //testing enrolmentDisplay details :

        Enrolment e1 = new Enrolment(s1,c1);
        Enrolment e2 = new Enrolment(s2,c1);
        Enrolment e3 = new Enrolment(s3,c1); // seeing whether this method shows faulty details or not.

        e1.displayEnrolmentDetails();
        e2.displayEnrolmentDetails();
        e3.displayEnrolmentDetails();

    }
}