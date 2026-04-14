import java.util.LinkedList;
import java.util.Queue;

public class waitlist {
    private Queue<Student> queue = new LinkedList<>();

    public void addToWaitlist(Student student) {
        queue.add(student);
        System.out.println(student.getName() + " added to waitlist.");
    }

    public Student getNextStudent() {
        return queue.poll(); // returns and removes first student
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayWaitlist() {
        System.out.println("Waitlist:");
        for (Student s : queue) {
            System.out.println("- " + s.getName());
        }
    }
}