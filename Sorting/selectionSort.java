public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2};

        for (int i = 0; i < arr.length; i++) {

            int maxIndex = 0;

            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap maximum element with last element
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}