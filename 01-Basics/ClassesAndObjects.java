public class ClassesAndObjects {

    String name;
    int age;

    ClassesAndObjects(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ClassesAndObjects student =
                new ClassesAndObjects("Sai Kiran Reddy", 18);

        student.displayDetails();
    }
}
