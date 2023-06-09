package gfg_POTD;
import java.util.*;

//Geek's Village and Wells
public class GeeksVillageAndWells {

	public static void main(String[] args) {

	}
	
private static final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    private static boolean areCoordinatesValid(int row, int col, int n, int m) {
        return row >= 0 && row < n && col >= 0 && col < m;
    }
    
    public static int[][] chefAndWells(int n,int m,char c[][])
    {
        
        int[][] output = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i=0; i < n; i++) {
            for (int j=0; j < m; j++) {
                if (c[i][j] == 'W') {
                    queue.offer(new int[]{0, i, j});
                }
            }
        }
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] curr = queue.poll();
                int row = curr[1];
                int col = curr[2];
                int dist = curr[0];
                
                for (int[] dir : dirs) {
                    int nRow = row + dir[0];
                    int nCol = col + dir[1];
                    
                    if (areCoordinatesValid(nRow, nCol, n, m) 
                     && output[nRow][nCol] == 0 && c[nRow][nCol] != 'N' && c[nRow][nCol] != 'W') {
                        
                        queue.offer(new int[]{dist + 1, nRow, nCol});
                        output[nRow][nCol] = dist + 1;
                        
                    }    
                }
            }
        }
        
        for (int i=0; i < n; i++) {
            for (int j=0; j < m; j++) {
                if (c[i][j] == '.') {
                    output[i][j] = 0;
                }
                else if (c[i][j] == 'H') {
                    if (output[i][j] == 0) {
                        output[i][j] = -1;
                    } else {
                        output[i][j] = 2 * output[i][j];
                    }
                } 
            }
        }
        
        return output;
        
    }

}
