public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 1, 8, 9, 2, 1, 3, 8, 0, 1, 4, 0, 9};

        removeDuplicates(arr);
    }

    public static void removeDuplicates(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean duplicates = false;
            int j = 0;

            while(j < i){
                if (arr[i] == arr[j])
                    duplicates = true;
                j++;
            }
            if (duplicates == false)
                System.out.print(arr[i] + " ");
        }
    }
}

