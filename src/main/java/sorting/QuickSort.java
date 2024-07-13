package sorting;

class QuickSort {
    // The entry point of the program
    public static void main(String[] args) {
        // Initialize an array with some integers
        int[] arr = {23, 13, 43, 33, 54, 44, 65, 34};
        // Call the quickSort method to sort the array
        quickSort(arr, 0, arr.length - 1);
        // Iterate over the array and print each element
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Method to perform the quicksort algorithm
    private static void quickSort(int[] arr, int start, int end) {
        // Base condition: if the start index is less than the end index
        if (start < end) {
            // Partition the array and get the pivot index
            int pi = partition(arr, start, end);
            // Recursively sort the elements before and after the pivot
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }

    // Method to swap two elements in an array
    static void swap(int[] arr, int i, int j) {
        // Store the value at index i in a temporary variable
        int temp = arr[i];
        // Assign the value at index j to index i
        arr[i] = arr[j];
        // Assign the value stored in the temporary variable to index j
        arr[j] = temp;
    }

    // Method to partition the array and find the pivot index
    private static int partition(int[] arr, int start, int end) {
        // Choose the last element as the pivot
        int pivot = arr[end];
        // Initialize the smaller element index to start - 1
        int i = start - 1;
        // Iterate over the array from start to end - 1
        for (int j = start; j < end; j++) {
            // If the current element is less than the pivot
            if (arr[j] < pivot) {
                // Increment the smaller element index
                i++;
                // Swap the current element with the element at the smaller element index
                swap(arr, i, j);
            }
        }
        // Swap the pivot element with the element at the smaller element index + 1
        swap(arr, i + 1, end);
        // Return the pivot index
        return i + 1;
    }
}
