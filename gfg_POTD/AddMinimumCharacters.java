package gfg_POTD;

//Add Minimum Characters
public class AddMinimumCharacters {

	public static void main(String[] args) {
		String str = "ABCD";
		System.out.println(addMinChar(str));

	}
	
	public static int addMinChar(String str){
		int ans =0, l=0, r=str.length()-1;
        while(l<=r) {
            if(str.charAt(l++)!=str.charAt(r--)) {
                ans++;
                l=0;
                r=str.length()-1-ans;
            }
        }
        return ans;
	}

}
