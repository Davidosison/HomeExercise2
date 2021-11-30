public class Exercise5 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 11, 10, 9, 4, 2, 0};

        upDownArrayCheck(arr);
    }

    public static void upDownArrayCheck(int arr[]) {

        int max = arr[0];
        int index = 0;

            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    index = i;
                }
            }
            System.out.println("The index of the Maximum value in the array is  :  " + index);
        }
    }


