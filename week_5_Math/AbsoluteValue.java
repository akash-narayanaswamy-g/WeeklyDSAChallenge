package week_5_Math;

//Absolute Value
public class AbsoluteValue {

	public static void main(String[] args) {
		int I = -32;
		System.out.println(absolute(I));
	}
	
	public  static int absolute(int I) {
        if(I<0)
            I*=-1;
        return I;
    }

}
