import java.util.ArrayList;

public class Collections {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // Adding students
        students.add("Sai Kiran Reddy");
        students.add("Rahul");
        students.add("Arjun");
        students.add("Priya");

        System.out.println("Students:");

        for (String student : students) {
            System.out.println(student);
        }

        // Accessing an element
        System.out.println("\nFirst Student: " + students.get(0));

        // Removing a student
        students.remove("Rahul");

        System.out.println("\nAfter removing Rahul:");

        for (String student : students) {
            System.out.println(student);
        }

        // Number of students
        System.out.println("\nTotal Students: " + students.size());
    }
}
