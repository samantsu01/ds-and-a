package sorting;

class SortingAlgorithm {
    public static void main(String[] args) {

        System.out.println("bubble");
        int[] bubble = {3, 5, 2, 7, 1, 9, 2};
        bubbleSort(bubble, bubble.length);
        for (int i = 0; i < bubble.length - 1; i++) {
            System.out.println(bubble[i]);
        }

        System.out.println("Selection");

        int[] selection = {7, 5, 2, 7, 1, 9, 2};
        selectionSort(selection, selection.length);
        for (int i = 0; i < selection.length - 1; i++) {
            System.out.println(selection[i]);
        }

        System.out.println("insertion");

        int[] insertion = {23, 1, 10, 5, 2};
        insertionSort(insertion, insertion.length);
        for (int i = 0; i < insertion.length; i++) {
            System.out.println(insertion[i]);
        }
    }

    private static void bubbleSort(int[] arr, int right) {
        boolean swap = false;
        int i, j, temp;
        for (i = 0; i < right - 1; i++) {
            for (j = 0; j < right - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }

            }
            if (swap == false) {
                break;
            }
        }
    }

    private static void selectionSort(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    private static void insertionSort(int[] arr, int length) {
        /* Starts from the second element (i = 1) and iterates through the array to the last element (i < length).
         */
        for (int i = 1; i < length; i++) {
            // Index of last portion of sorted array
            int j = i - 1;
            //key: The element currently being compared and placed into its correct position.
            int key = arr[i];


            /*
             * Find the correct position for key
             */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


}
