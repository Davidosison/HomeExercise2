import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Please enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.println(stringCheck(str1, str2));
        }

    public static boolean stringCheck(String str1, String str2) {

        boolean stringInString = false;
        int count = 0;
        if (str2.length() < str1.length()){
            for (int i = 0; i < str1.length(); i++){
                if (count == str2.length()){
                    break;
                }else if (str2.charAt(count) == str1.charAt(i)){
                    count ++;
                }else{
                    count = 0;
                }
            }
        }
        if (count == str2.length()){
            stringInString = true;
        }
        return stringInString;
    }
}



