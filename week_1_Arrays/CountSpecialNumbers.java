package week_1_Arrays;

import java.util.HashMap;

//Count Special Numbers
public class CountSpecialNumbers {

	public static void main(String[] args) {
		int N = 3,arr[] = {2, 3, 6};
		System.out.println(countSpecialNumbers(N, arr));
	}
	
	public static int countSpecialNumbers(int N, int arr[]) {
		HashMap<Integer,Boolean> map=new HashMap<>();
        
        boolean[] res=new boolean[N];
        
        for(int i=0;i<N;i++)
        {
            if(map.containsKey(arr[i])){ 
                res[i]=map.get(arr[i]);
                continue;
            }
            
            for(int j=0;j<N;j++)
            {
                if(i!=j && arr[i]%arr[j]==0){
                    res[i]=true;
                    break;
                }
            }
            
            map.put(arr[i],res[i]);
            
        }
    
    
        int ans=0;
        
        for(int i=0;i<N;i++)
        {
            if(res[i]) ans++;
        }
        
                return ans;
    }

}
