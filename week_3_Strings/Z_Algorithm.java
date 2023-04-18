package week_3_Strings;

public class Z_Algorithm {

	public static void main(String[] args) {
		 String text = "GEEKS FOR GEEKS";
	     String pattern = "GEEK";
	     search(text,pattern);
	}

	private static void search(String text, String pattern) {
		String t=pattern+"$"+text;
		int[] z=new int[t.length()];
		getZarr(t, z);
		for (int i = 1; i < z.length; i++) {
			if(z[i] == pattern.length()){
                System.out.println("Pattern found at index "+ (i - pattern.length() - 1));
            }
		}
		
	}
	
	   private static void getZarr(String str, int[] Z) {
		   
	        int n = str.length();
	         
	        int L = 0, R = 0;
	 
	        for(int i = 1; i < n; ++i) {
	            if(i > R){
	 
	                L = R = i;
	 
	                while(R < n && str.charAt(R - L) == str.charAt(R))
	                    R++;
	                 
	                Z[i] = R - L;
	                R--;
	 
	            }
	            else{
	 
	                int k = i - L;
	 
	                if(Z[k] < R - i + 1)
	                    Z[i] = Z[k];
	 
	                else{
	                    L = i;
	                    while(R < n && str.charAt(R - L) == str.charAt(R))
	                        R++;
	                     
	                    Z[i] = R - L;
	                    R--;
	                }
	            }
	        }

}}