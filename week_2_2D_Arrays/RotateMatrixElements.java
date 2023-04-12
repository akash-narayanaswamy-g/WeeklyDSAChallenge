package week_2_2D_Arrays;

import java.util.Arrays;

//Rotate matrix elements clockwise
public class RotateMatrixElements {

	public static void main(String[] args) {
		int a[][] = { {1, 2, 3, 4},
                {5, 6, 7, 8},
              {9, 10, 11, 12},
              {13, 14, 15, 16} }; 
		int M=2,N=3;
		rotatematrix(M, N, a);
		System.out.println(Arrays.deepToString(a));

	}
	
	 static void rotatematrix(int M,int N, int arr[][]){
		 int r=0,c=0,mr=M-1,mc=N-1;

	        while(r<mr && c<mc){

	            int prev=arr[r+1][c];

	            for(int i=c;i<=mc;i++){

	                int cur=arr[r][i];

	                arr[r][i]=prev;

	                prev=cur;

	            }

	            for(int i=r+1;i<=mr;i++){

	                 int cur=arr[i][mc];

	                arr[i][mc]=prev;

	                prev=cur;

	            }

	            for(int i=mc-1;i>=c;i--){

	                 int cur=arr[mr][i];

	                arr[mr][i]=prev;

	                prev=cur;

	            }

	            for(int i=mr-1;i>r;i--){

	                 int cur=arr[i][c];

	                arr[i][c]=prev;

	                prev=cur;

	            }

	            r++;

	            c++;

	            mr--;

	            mc--;

	        }

		 }
	 }

