package sliding_window;

public class MinSubArraySum {


    public static void main(String[] args) {
        int[] array = {2,3,1,2,4,3};
        int target = 7;

        int result = minSubArrayLen(array, target);
        System.out.println(result);
    }

    private static int minSubArrayLen(int[] array, int target) {
        int minLength = Integer.MAX_VALUE;


        for (int i = 0; i < array.length; i++){
            int sum = 0;
            for (int j = i; j < array.length; j++){
                sum = sum + array[j];
                minLength = Integer.min(minLength, j - i + 1);
                break;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
