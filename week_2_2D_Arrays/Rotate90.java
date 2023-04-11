package week_2_2D_Arrays;

import java.util.Arrays;

//Rotate a 2D array without using extra space
public class Rotate90 {

	public static void main(String[] args) {
		int Arr[][] = {{1,  2,  3},
        {4,  5,  6},
        {7,  8,  9}};
		
		rotateMatrix(Arr);
		System.out.println(Arrays.deepToString(Arr));

	}
	
	static void  rotateMatrix(int arr[][]) {
	       transpose(arr);
			reverseColumns(arr);
			
	    }
	    
	    private static void transpose(int[][] arr) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr[i].length; j++) {
					int t=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=t;
				}
			}
			
		}
		
		public static void reverseColumns(int[][] arr) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0,k=arr.length-1; j < k; j++,k--) {
					int t=arr[j][i];
					arr[j][i]=arr[k][i];
					arr[k][i]=t;
				}
			}
		}

}
