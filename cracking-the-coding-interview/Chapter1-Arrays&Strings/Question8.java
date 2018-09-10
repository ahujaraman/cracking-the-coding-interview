


/*
 * My solution uses O(m+n) space extra, to keep track of ows and columns to be flagged as 1. 
 * We can avoid this by using first row and column for the same purpose. O(1)
 */
public class Question8 {
public void setZeroes(int[][] matrix) {
        
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        
        
        for(int i=0; i<matrix.length; i++){
            for(int j =0; j< matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        
        for(int i =0; i< row.length; i++){
            if(row[i] == 1){
                for(int p = 0; p< matrix[i].length; p++){
                    matrix[i][p] = 0;
                } 
            }
        }
        
        
         for(int j =0; j< col.length; j++){
            if(col[j] == 1){
                for(int p = 0; p< matrix.length; p++){
                    matrix[p][j] = 0;
                }
            }
        }

    }

}
