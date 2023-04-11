package week_2_2D_Arrays;

public class Rotate180 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3},
	            { 4,5,6 },
	            { 7,8,9 },};
		rotate180(arr);
		printMatrix(arr);

	}
	
	private static void rotate180(int[][] arr) {
		transpose(arr);
		reverseColumns(arr);
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

	public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

}
