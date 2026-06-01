import java.util.*;


public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][] zeroTrack = new boolean[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    zeroTrack[i][j] = true;
                }
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(zeroTrack[i][j] == true) {
                    for(int k = 0; k<n; k++) {
                        matrix[i][k] = 0;
                    }
                    for(int k = 0; k<m; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
//        int[][] matrix = new int[3][3];

        int[][] matrix = {
                    {1, 1, 1},
                    {1, 0, 1},
                    {1, 1, 1}
                };

        setZeroes(matrix);

        for(int[] a:matrix) {
            for(int num:a) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
    }
}