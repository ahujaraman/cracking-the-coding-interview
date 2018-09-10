


/*
 * Rotate a matrix 90 degree in place. Leet-code Question
 * */

public class Question7 {
public void rotate(int[][] matrix) {
       
        
        /* First Transpose the matrix
        */ 
        int n = matrix.length;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        
        /* Once the transpose is done , flip the matrix horizontally, i.e we reverse each row by row
        */
        
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        
    }

}
