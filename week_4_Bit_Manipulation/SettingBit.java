package week_4_Bit_Manipulation;

public class SettingBit {

	public static void main(String[] args) {
		int n=70,i=3;
		bitManipulation(n, i);
	}
	static void bitManipulation(int n, int i) {
	        int k=(1<<(i))-i;
	        System.out.print(((n&(1<<i-1))>>i-1)+" ");
	        System.out.print((n|(1<<i-1))+" ");
	        System.out.print((n&~(1<<i-1)));
	    }
	

}
