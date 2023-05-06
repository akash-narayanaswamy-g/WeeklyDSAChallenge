package gfg_POTD;

import java.util.*;

//Another Coin Change Problem
public class AnotherCoinChangeProblem {

	public static void main(String[] args) {
		int n = 5, k = 3, target = 11,coins[] = {1, 10, 5, 8, 6};
		System.out.println(makeChanges(n, k, target, coins));
	}
	
	public static boolean makeChanges(int N, int K, int target, int[] coins) {
        
        Boolean[][] dp= new Boolean[target+1][K+1];
       
       for(int i=0;i<target+1;i++) Arrays.fill(dp[i],null);

       dp[0][0]=true;
       
       return makeChangesReal(N,K,target,coins,dp);
       
   }
   
   public static boolean makeChangesReal(int N, int K, int target, int[] coins,Boolean[][] dp) {
       
       if(K==0 && target==0) return true;
       
       if(K<=0 || target <=0) return false;
       
       boolean ans=false;
       for(int i=0;i<N;i++){
           if(target>=coins[i] && (K-1) >=0){
               if(dp[target-coins[i]][K-1]!=null) ans= ans || dp[target-coins[i]][K-1];
               else ans = ans || makeChangesReal(N,K-1,target-coins[i],coins,dp); 
           }
           
       }
       dp[target][K]= ans;
       
       return ans;
   }

}
