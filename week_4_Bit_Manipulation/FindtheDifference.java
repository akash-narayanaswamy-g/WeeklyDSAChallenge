package week_4_Bit_Manipulation;

//389. Find the Difference
public class FindtheDifference {

	public static void main(String[] args) {
		String s = "abcd", t = "abcde";
		System.out.println(findTheDifference(s, t));
	}
	
	public static char findTheDifference(String s, String t) {
		if(s.length()<1)return t.charAt(0);
		char ans=s.charAt(0);
        s+=t;
        for(int i=1;i<s.length();i++){
            ans^=s.charAt(i);
        }
        return ans;
    }

}
