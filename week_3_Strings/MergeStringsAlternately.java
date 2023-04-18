package week_3_Strings;

//1768. Merge Strings Alternately
public class MergeStringsAlternately {

	public static void main(String[] args) {
		String word1 = "abc", word2 = "pqr";
		System.out.println(mergeAlternately(word1, word2));
	}
	
	public static String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
			if(i<word1.length())
				ans.append(word1.charAt(i));
			if(i<word2.length())
				ans.append(word2.charAt(i));
		}
        return ans.toString();
    }

}
