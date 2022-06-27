public class Person {
    private String message = "Hello world";

    public class Student {
        void greeting() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        Student student = person.new Student();
        student.greeting();
    }
}
