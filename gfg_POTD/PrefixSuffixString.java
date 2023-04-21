package gfg_POTD;

public class PrefixSuffixString {

	public static void main(String[] args) {
		String [] s1 = {"cat", "catanddog", "lion"},s2 = {"cat", "dog", "rat"};
		System.out.println(prefixSuffixString(s1, s2));
	}
	
	public static int prefixSuffixString(String s1[],String s2[])
    {
        int count = 0;
        for (String s : s2) {
            for (String word : s1) {
                if (word.startsWith(s) || word.endsWith(s)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
