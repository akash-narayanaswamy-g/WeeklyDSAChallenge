package week_5_Math;

//62. Unique Paths
public class UniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int uniquePaths(int m, int n) {
        int N = n+m-2;
        int r = m-1;
        double res=1;
        for(int i=1;i<=r;i++){
            res = res * (N - r + i) / i;
            
        }
        return (int)res;
    }

}
