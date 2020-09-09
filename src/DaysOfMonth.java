import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bạn kiểm tra số ngày tháng nào: ");
        byte month = scanner.nextByte();
        String days;
        switch (month){
            case 2:
                days = "có 28 hoặc 29 ngày.";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = "có 31 ngày.";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = "có 30 ngày.";
                break;
            default:
                days = "";
                break;
        }
        if (days != "")
            System.out.printf("Tháng %d %s",month,days);
        else
            System.out.print("Không có tháng này");
    }
}
