class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int negcount =0;
        int minneg = Integer.MAX_VALUE;
        long sum =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              sum+=Math.abs(matrix[i][j]);
               minneg = Math.min(minneg,Math.abs(matrix[i][j]));
              if(matrix[i][j]<0){
                    negcount++;
                 }
            }
        }
        if(negcount%2==0){return sum;}
        else{return sum-2*minneg;}
    }
}