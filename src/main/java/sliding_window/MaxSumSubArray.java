package sliding_window;


public class MaxSumSubArray {

    public static int maxSumSubArray(int[] arr, int target){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < target; i++){
            currentSum += arr[i];
        }

        maxSum = Integer.max(maxSum, currentSum);

        for (int i = target; i < arr.length; i++){
            currentSum = currentSum - arr[i - target] + arr[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int target = 3;
        int result = maxSumSubArray(arr, target);
        System.out.println("MAX SUM OF SUB ARRAY OF SIZE " + target + ": " + result);
    }
}
