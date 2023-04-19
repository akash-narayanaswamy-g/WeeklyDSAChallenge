package gfg_POTD;

//Wifi Range
public class WifiRange {

	public static void main(String[] args) {
		int N = 3, X = 0;
		String S = "010";
		System.out.println(wifiRange(N, S, X));
	}
	
	static boolean wifiRange(int N, String S, int X) 
    { 
        int flag = 0;
        for(int i=0; i<N; i++){
            if(S.charAt(i)=='0'){
                flag--;
            }else{
                if(flag>=-X) flag = X;
                else return false;
            }
        }
        return (flag<0)?false:true;
    }

}
