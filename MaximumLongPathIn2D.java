package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 21/11/17.
 */
public class MaximumLongPathIn2D {
    int[] dx = new int[]{-1,0,0,1};
    int[] dy = new int[]{0,1,-1,0};
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(matrix.length==0 || matrix[0].length==0) return 0;
        int len =0;
        int[][] matLen = new int[m+1][n+1];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                len = Math.max(len, DFS(matrix, matLen, i, j));
            }
        }
        return len;
    }

    int DFS(int[][] matrix, int[][] matLen, int i, int j){

        if(matLen[i][j]!= 0) return matLen[i][j];
        int m = matrix.length;
        int n = matrix[0].length;
        for(int k=0; k<4; k++){
            int x= i+dx[k];
            int y= j+dy[k];
            if(x>=0 && x<m && y>=0 && y<n && matrix[i][j] < matrix[x][y]){
                matLen[i][j] = Math.max(matLen[i][j],DFS(matrix, matLen, x, y));
            }
        }

        return ++matLen[i][j];

    }

    public static void main(String[] args){
        MaximumLongPathIn2D max = new MaximumLongPathIn2D();
        System.out.println(max.longestIncreasingPath(new int[][]{{9,9,4},{6,6,8},{2,1,1}}));
    }
}
