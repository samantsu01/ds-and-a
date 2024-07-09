package coding.pattern;

/**
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
 *
 * You must do it in place.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 * Example 2:
 *
 *
 * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */
public class SetMatrixZeros {

    public static void setZeroes(int[][] matrix) {

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] zeroRow = new boolean[m];
        boolean[] zeroColumn = new boolean[n];

        // Identify row and column to be zero

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ; j++){
                if(matrix[i][j] == 0){
                    zeroRow[i] = true;
                    zeroColumn[j] = true;
                }
            }
        }


        // Set column and row to be zero
        for(int i = 0;  i < m ; i ++){
            for(int j = 0; j < n; j++){
                if(zeroRow[i] || zeroColumn[j]){
                    matrix[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix1);
        printMatrix(matrix1);

    }

    private static void printMatrix(int[][] matrix1) {

        for(int[] row : matrix1){
            for (int value : row){
                System.out.println(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
