package week_2_2D_Arrays;

//240. Search a 2D Matrix II
public class Searcha2DMatrixII {

	public static void main(String[] args) {
		int matrix[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, target = 5;
		System.out.println(searchMatrix(matrix, target));

	}
	
	 public static boolean searchMatrix(int[][] matrix, int target) {
		 int r=matrix.length-1,c=0;
		 while(r>=0 && c<matrix[0].length) {
			 if(matrix[r][c]==target)
				 return true;
			 else if(matrix[r][c]<target)
				 c++;
			 else
				 r--;
		 }
		 return false;
	   }

}
