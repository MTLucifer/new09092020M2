import java.util.Scanner;

public class CurrencyRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập USD: ");
        double USD = scanner.nextDouble();
        double VND = USD * 23000;
        System.out.printf("VND: %5.3f",VND);
    }
}
