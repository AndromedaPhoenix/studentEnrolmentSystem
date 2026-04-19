import java.rmi.StubNotFoundException;

public class Main {
    public static void main(String[] args) {
/**
 * I have added two student group for easier navigation of course enrolment and waitlist feature
 * enrolment are in sytematic order first come first serve.
 * This program doesn't automatically reenroll student in waitlist because enrolled student don't have finish time.
 * other extra testing was done to analyse out put.
 */
       //group 1 student
        Student s1 = new Student("S123", "Padam", "padam@email.com");
        Student s2 = new Student("S124", "Sugal", "sugal@email.com");
        Student s3 = new Student("S125", "Pranita","pranita@email.com");

        // group 2 Studnet
        Student s4 = new Student("S126", "Hari", "Hari@email.com");
        Student s5 = new Student("127","Sita", "Sita@email.co");
        Student s6 = new Student ("128","laxman","Laxman@email.com");

        //two courses for two student group
        Course c1 = new Course("ITS206", "Software Construction and Development", 2);
        Course c2 = new Course("ITS205", "Software Engineering", 2);

        //enrolling student in c1 and testing wheather waitlist feature works or not
        c1.enrolStudent(s1);
        c1.enrolStudent(s2);
        c1.enrolStudent(s3); // goes to waitlist

        //Enrolling student in c2 and testing wheater waitlist feature works or not
        c2.enrolStudent(s4);
        c2.enrolStudent(s5);
        c2.enrolStudent(s6);

        //incase if the course is full this line will be activated.
        System.out.println("\n┌──────────────────────────────────┐");
        System.out.println("│        PROCESSING WAITLIST       │");
        System.out.println("├──────────────────────────────────┤");
        c1.processWaitlist();
        System.out.println("└──────────────────────────────────┘\n");

        //testing display waitlist method
         c1.getWaitlist().displayWaitlist(); // first it will get waitlist from course 1 and display it.
         c2.getWaitlist().displayWaitlist(); // for course two

        //testing displayInfo method
        s1.displayInfo();
        s2.displayInfo();

        //testing display course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        /**
         * Testing displayEnrolemntdetails method.
         * Creating a enrolement details of student for single course.
         */

        Enrolment e1 = new Enrolment(s1,c1);
        Enrolment e2 = new Enrolment(s2,c1);
        Enrolment e3 = new Enrolment(s3,c1); // seeing whether this method shows faulty details or not.

        e1.displayEnrolmentDetails();
        e2.displayEnrolmentDetails();
        e3.displayEnrolmentDetails();


    }
}