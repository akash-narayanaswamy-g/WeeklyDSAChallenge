package week_2_2D_Arrays;

public class uniqueElement {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 20 },
                { 5, 6, 20, 25 },
                { 1, 3, 5, 6 },
                { 6, 7, 8, 15 } };
		unique(mat);
	}

	private static void unique(int[][] mat) {
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				max=Math.max(max, mat[i][j]);
			}
		}
		
		int arr[]=new int[max+1];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				arr[mat[i][j]]++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1)
				System.out.print(i+" ");
		}
	}

}
