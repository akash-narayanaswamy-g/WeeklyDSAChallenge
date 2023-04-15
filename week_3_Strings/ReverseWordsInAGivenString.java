package week_3_Strings;


//Reverse words in a given string
public class ReverseWordsInAGivenString {

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		System.out.println(reverseWords(s));
	}
	
	static String reverseWords(String S)
    {
        String ans="",v="";
        for (int i = 0; i < S.length(); i++) {
			if(S.charAt(i)!='.')
				v+=S.charAt(i);
			else {
				ans=v+"."+ans;
				v="";
			}
				
		}
        ans=v+"."+ans;
        return ans.substring(0,ans.length()-1);
    }

}
