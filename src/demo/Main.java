package demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        MessagesResponse msg = new MessagesResponse();
        try {
            System.out.print("x = ");
            x = scanner.nextInt();

            System.out.print("y = ");
            y = scanner.nextInt();

            msg.setMessage("Thành công");
            msg.setData("Phép chia lấy nguyên của x và y là: " + x/y);
        }
        catch (Exception e){
            msg.error(e);
        }

        System.out.println(msg);
    }
}
