public class StaticInnerClass {
    static String message = "Tien";

    static class Info {
        void msg() {
            System.out.println("My name is " + message);
        }
    }

    static class StaticInfo {
        static void msg() {
            System.out.println("My name is " + message + " and this is how static used");
        }
    }

    public static void main(String[] args) { // dùng cách nào cũng được, cũng khá phổ biến, hay dùng
        Info info = new Info();
        info.msg();

        StaticInfo.msg();
    }
}
