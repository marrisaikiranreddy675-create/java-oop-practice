public class ArraysAndStrings {

    public static void main(String[] args) {

        // Array of marks
        int[] marks = {85, 90, 78, 92, 88};

        int total = 0;

        System.out.println("Marks:");

        for (int mark : marks) {
            System.out.println(mark);
            total += mark;
        }

        double average = (double) total / marks.length;

        // String operations
        String name = "Sai Kiran";

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Name Length: " + name.length());
        System.out.println("Uppercase Name: " + name.toUpperCase());
        System.out.println("First Character: " + name.charAt(0));
    }
}
