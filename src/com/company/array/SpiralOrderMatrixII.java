package com.company.array;

public class SpiralOrderMatrixII {
    public static void main(String[] args) {
        int n=4;

        int[][] spiralMatrix = generateSpiralMatrix(n);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                System.out.print(spiralMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int [][] generateSpiralMatrix(int n){

        int matrix[][] = new int[n][n];
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;
        int k=1;
        while(rowStart<=rowEnd && colStart<=colEnd) {

            for(int i=colStart;i<=colEnd;i++){
                matrix[rowStart][i] = k;
                k++;
            }
            rowStart++;

            for (int i = rowStart; i <=rowEnd; i++) {
                matrix[i][colEnd] = k;
                k++;
            }
            colEnd--;

            for(int i=colEnd;i>=colStart;i--){
                matrix[rowEnd][i]=k;
                k++;
            }
            rowEnd--;

            for(int i=rowEnd;i>=rowStart;i--){
                matrix[i][colStart]=k;
                k++;
            }
            colStart++;

        }//end of while loop
        return matrix;
    }
}
