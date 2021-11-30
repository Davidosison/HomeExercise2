import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your phone number: ");
        String number = scanner.nextLine();
        System.out.println(phoneNumber(number));

    }
    public static int phoneNumber(String phoneNumber) {
        int rightNumber = 2;
        String number = phoneNumber;
        int length = number.length();

        switch (rightNumber){
            case 1://0501234567
                do {
                    System.out.println("05" + number.charAt(2) + "-" + number.charAt(3) + number.charAt(4)+ number.charAt(5)
                            + number.charAt(6)+ number.charAt(7)+ number.charAt(8)+ number.charAt(9));
                }while (length == 10);
                break;

            case 2://050-1234567
                return rightNumber;

            case 3: //972501234567
                do {
                    System.out.println("05" + number.charAt(4) + "-" + number.charAt(5) + number.charAt(6)+ number.charAt(6)
                            + number.charAt(7)+ number.charAt(8)+ number.charAt(9)+ number.charAt(10)
                            + number.charAt(11)+ number.charAt(12));
                }while (length == 12);
                break;
            default:
                System.out.println("There is no match");
        }
        return rightNumber;
    }
}

