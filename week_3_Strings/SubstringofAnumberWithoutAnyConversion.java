package week_3_Strings;

import java.util.*;

//Print all substring of a number without any conversion
public class SubstringofAnumberWithoutAnyConversion {

	public static void main(String[] args) {
		int n=12345;
		System.out.println(substring(n));

	}

	private static ArrayList<Integer> substring(int n) {
		ArrayList<Integer> ans=new ArrayList<>();
		int outpower=(int)Math.pow(10, (int)Math.log10(n));
		int k=outpower;
		while(n>0) {
			while(outpower>0) {
				ans.add(n/outpower);
				outpower/=10;
			}
			n=n%k;
			k/=10;
			outpower=k;
		}
		return ans;
	}

}
