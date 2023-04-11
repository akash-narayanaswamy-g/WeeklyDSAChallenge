package gfg_POTD;

//Maximum Length
public class MaximumLength {

	public static void main(String[] args) {
		int a = 3, b = 3, c = 3;
		System.out.println(solve(a, b, c));
	}
	
	static int solve(int a, int b, int c) {
        int max=Math.max(a,b);
        max=Math.max(max,c);
        if(max<=(2*(a+b+c-max+1)))
            return a+b+c;
        else 
            return -1;
    }

}
