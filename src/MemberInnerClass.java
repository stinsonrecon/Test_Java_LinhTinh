public class MemberInnerClass {
    private String message = "Hello world";

    public class Student { // member inner class (cái này thì dùng nhiều này)
        void greeting() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        MemberInnerClass person = new MemberInnerClass();
        Student student = person.new Student();
        student.greeting();
    }
}
