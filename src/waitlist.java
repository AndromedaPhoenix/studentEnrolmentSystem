import java.util.LinkedList;
import java.util.Queue;

/**
 * the waitlist class manages student who cannot be enrolled in selected course.
 * The main program use this class whenever the course is full and a seat becomes available.
 */
public class waitlist {
    //Que structure ensures waitlist behaviour
    private Queue<Student> queue = new LinkedList<>();

    /**
     * adds a student to the waitlist
     * @param student
     */
    public void addToWaitlist(Student student) {
        queue.add(student);
        System.out.println(student.getName() + " added to waitlist.");
    }
//
    public Student getNextStudent() {
        return queue.poll(); // returns and removes first student
    }
//Check if the waitlist is empty.
    public boolean isEmpty() {
        return queue.isEmpty();
    }
//Display all the student currently in the waitlist.
   /** public void displayWaitlist() {
        System.out.println("Waitlist:");
        for (Student s : queue) {
            System.out.println("- " + s.getName());
        }
    }
    */
   public void displayWaitlist() {
       System.out.println("====================================");
       System.out.println("             WAITLIST               ");
       System.out.println("====================================");

       if (queue.isEmpty()) {
           System.out.println("No students in waitlist.");
       } else {
           for (Student s : queue) {
               System.out.println("• " + s.getName());
           }
       }

       System.out.println("====================================");
   }
}