package week_1_Arrays;

import java.util.Arrays;

//344. Reverse String
public class ReverseString {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
		System.out.println(Arrays.toString(s));
	}
	
	public static void reverseString(char[] s) {
        int l=0,r=s.length-1;
        while(l<r)
        	swap(s,l++,r--);
    }

	private static void swap(char[] s, int i, int j) {
		char t=s[i];
		s[i]=s[j];
		s[j]=t;
		
	}

}
