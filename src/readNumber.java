import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc");
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = number / 10;
        int ten = number - 10;
        String writeHundred = "";
        String writeTens = "";
        String writeTen = "";
        String writeOne = "";

//        String writeOne;
//        public static double check(ones)

        if (number < 10 && number > 0) {
            switch (number) {
                case 1:
                    writeOne = "one";
                    break;
                case 2:
                    writeOne = "two";
                    break;
                case 3:
                    writeOne = "three";
                    break;
                case 4:
                    writeOne = "four";
                    break;
                case 5:
                    writeOne = "five";
                    break;
                case 6:
                    writeOne = "six";
                    break;
                case 7:
                    writeOne = "seven";
                    break;
                case 8:
                    writeOne = "eight";
                    break;
                case 9:
                    writeOne = "nine";
                    break;
            }
            System.out.println(writeOne);
        }
        if (number < 20 && number > 9) {
            switch (ten) {
                case 0:
                    writeTen = "ten ";
                    break;
                case 1:
                    writeTen = "eleven ";
                    break;
                case 2:
                    writeTen = "twelve ";
                    break;
                case 3:
                    writeTen = "thirteen ";
                    break;
                case 4:
                    writeTen = "fourteen ";
                    break;
                case 5:
                    writeTen = "fifteen ";
                    break;
                case 6:
                    writeTen = "sixteen ";
                    break;
                case 7:
                    writeTen = "seventeen ";
                    break;
                case 8:
                    writeTen = "eighteen ";
                    break;
                case 9:
                    writeTen = "nineteen ";
                    break;
            }
            System.out.println(writeTen+writeOne);
        }
        if (number < 100 && number > 19) {
            switch (tens) {
                case 2:
                    writeTens = "twenty ";
                    break;
                case 3:
                    writeTens = "thirty ";
                    break;
                case 4:
                    writeTens = "forty ";
                    break;
                case 5:
                    writeTens = "fifty ";
                    break;
                case 6:
                    writeTens = "sixty ";
                    break;
                case 7:
                    writeTens = "seventy ";
                    break;
                case 8:
                    writeTens = "eighty ";
                    break;
                case 9:
                    writeTens = "ninety ";
                    break;
            }
            System.out.println(writeTens+writeTen+writeOne);
        }

        if (number < 1000 && number > 99) {
            switch (hundreds) {
                case 1:
                    writeHundred = "one hundred and ";
                    break;
                case 2:
                    writeHundred = "two hundred and ";
                    break;
                case 3:
                    writeHundred = "three hundred and ";
                    break;
                case 4:
                    writeHundred = "four hundred and ";
                    break;
                case 5:
                    writeHundred = "five hundred and ";
                    break;
                case 6:
                    writeHundred = "six hundred and ";
                    break;
                case 7:
                    writeHundred = "seven hundred and ";
                    break;
                case 8:
                    writeHundred = "eight hundred and ";
                    break;
                case 9:
                    writeHundred = "nine hundred and ";
                    break;
            }
            System.out.println(writeHundred+writeTens+writeTen+writeOne);
        }




    }
}

//        double ones = number / 1 > 1;
//        if (hundreds)
//        System.out.print(true);
//        else
//            System.out.print(false);

