public class LocalInnerClass {
    private String message = "Hello World";

    void showMessage() { // Local inner class (chả dùng bao giờ vì nó cồng kềnh khó hiểu vl)
        class Person {
            void greeting(){
                System.out.println(message);
            }
        }

        Person person = new Person();
        person.greeting();
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.showMessage();
    }
}
