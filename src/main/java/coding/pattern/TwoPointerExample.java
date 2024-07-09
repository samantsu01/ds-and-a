package coding.pattern;


/**
 * Given a sorted array of integers,
 * find a pair of numbers that sum up to a specific target value."
 *
 * {3, 7, 9, 10, 12, 13, 17, 19}
 * O/P - 25
 **/
public class TwoPointerExample {

    public static int[] findPairWithSum(int[] arr, int target){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i; j < arr.length - 1; j++){

                if(arr[i] + arr[j] == target){
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] result = findPairWithSum( new int[]{3, 7, 9, 10, 12, 13, 17, 19}, 30);
        for (int i : result){
            System.out.println(i);
        }
    }
}
