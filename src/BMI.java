import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight,height,bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng (kg):");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao (mét):");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);

        System.out.printf("%-20s%s", "BMI", "Phân loại\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Gầy");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Béo");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo phì");
    }
}
