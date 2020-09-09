import java.util.Scanner;

public class sayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.next();

        System.out.printf("Xin chào %s",name);
    }
}
