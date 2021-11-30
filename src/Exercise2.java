import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 10 number: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        int num7 = scanner.nextInt();
        int num8 = scanner.nextInt();
        int num9 = scanner.nextInt();
        int num10 = scanner.nextInt();

        int arr[] = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
        int a = arr.length;
        printAboveAverage(arr, a);
    }

    public static void printAboveAverage(int arr[], int n){

        double avg = 0;
        for (int i = 0; i < n; i++)
            avg += arr[i];
        avg = avg / n;

        for (int i = 0; i < n; i++){
            if (arr[i] > avg)
                System.out.print(arr[i] + " ");
        }
    }
}
