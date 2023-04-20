package week_3_Strings;

import java.util.*;

//Substring Reverse Pattern
public class SubstringReversePattern {

	public static void main(String[] args) {
		String str = "first" ;
		System.out.println(patterRevere(str));
	}

	private static ArrayList<String> patterRevere(String str) {
		ArrayList<String> ans=new ArrayList<>();
		char[] c=str.toCharArray();
		int s=0,e=str.length()-1;
		while(s<e) {
			swap(c,s++,e--);
		}
		
		s=0;e=str.length()-1;
		while (s<e)
	    {
	        c[e] = c[s] = '*';
	        ans.add(Arrays.toString(c));
	        s++;
	        e--;
	    }
		return ans;
	}

	private static void swap(char[] c, int i, int j) {
		char t=c[i];
		c[i]=c[j];
		c[j]=t;
		
	}

}
