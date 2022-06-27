interface IStudent {
    void message();

    interface Action {
        void greeting();
    }
}

public class NestedInterfaceClass implements IStudent.Action, IStudent {
    @Override
    public void greeting() {
        System.out.println("Hello world");
    }

    @Override
    public void message() {
        System.out.println("This is some kind of message"); // cái thg cha của nó là IStudent thì hay dùng để làm repository,
                                                            // service thôi chứ cái thg Action thì chả dùng lồng kiểu này bao giờ
    }

    public static void main(String[] args) {
        IStudent iStudent = new NestedInterfaceClass();
        iStudent.message();

        IStudent.Action action = new NestedInterfaceClass();
        action.greeting();
    }
}
