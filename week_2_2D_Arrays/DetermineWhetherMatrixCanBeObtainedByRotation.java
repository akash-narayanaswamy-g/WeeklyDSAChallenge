package week_2_2D_Arrays;

import java.util.Arrays;

//1886. Determine Whether Matrix Can Be Obtained By Rotation
public class DetermineWhetherMatrixCanBeObtainedByRotation {

	public static void main(String[] args) {
		int[][] mat = {{0,0,0},{0,1,0},{1,1,1}}, target = {{1,1,1},{0,1,0},{0,0,0}};
		System.out.println(findRotation(mat, target));
	}
	
	public static boolean findRotation(int[][] mat, int[][] target) {
		int row = mat.length;
	       
	       for(int k=0;k<=3;++k){
	           int[][] r = new int[row][row];
	            for(int i =0;i<row;++i){
	            for(int j =0;j<row;++j){
	                r[j][row-1-i]=mat[i][j];
	            }
	             if(Arrays.deepEquals(r,target)){
	                 return true;
	             }
	        }
	        mat = r;
	       }
	       return false;
    }
	
	

}
