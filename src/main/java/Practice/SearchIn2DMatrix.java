package Practice;

public class SearchIn2DMatrix {


    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        String index = searchIn2DMatrx(mat, 15);
        System.out.println(index);
    }

    private static String searchIn2DMatrx(int[][] mat, int i) {


        for(int m=0; m < mat.length; m++){
            for (int n = 0; n < mat.length; n++){
                if(mat[m][n] == i){
                    return String.valueOf(m).concat(String.valueOf(n));
                }
            }

        }
        return "not available";
    }

    private static String searchIn2DMatrx1(int[][] mat, int i) {

        int row = 0;
        int column = mat.length;
        while (row <= mat.length && mat.length > 0){

            //

        }


        for(int m=0; m < mat.length; m++){
            for (int n = 0; n < mat.length; n++){
                if(mat[m][n] == i){
                    return String.valueOf(m).concat(String.valueOf(n));
                }
            }

        }
        return "not available";
    }
}
