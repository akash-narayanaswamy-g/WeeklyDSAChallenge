package week_2_2D_Arrays;

import java.util.Iterator;

//https://www.geeksforgeeks.org/program-to-print-the-diagonals-of-a-matrix/
public class DiagonalsofaMatrix {

	public static void main(String[] args) {
		 int a[][] = { { 1, 2, 3, 4 },
                 { 5, 6, 7, 8 },
                 { 1, 2, 3, 4 },
                 { 5, 6, 7, 8 }
                };
		 
		 printDiagonals(a);
	}

	private static void printDiagonals(int[][] a) {
		
		System.out.println("prinicipal diagonal");
		//prinicipal diagonal
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==j)
					System.out.print(a[i][j]+" ");
			}
		}
		
		System.out.println("\nsecondary Diagonal");
		
		//secondary Diagonal
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if((i+j)==a[i].length-1)
					System.out.print(a[i][j]+" ");
			}
		}
		
	}

}
