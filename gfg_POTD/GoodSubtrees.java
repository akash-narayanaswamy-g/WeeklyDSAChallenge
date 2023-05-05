package gfg_POTD;

import java.util.*;

//Good Subtrees
class n{
	int data;
	n left;
	n right;
	n(int data){
		this.data=data;
		left=null;
		right=null;
	}
}

public class GoodSubtrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static HashSet<Integer> solve(n root,int k,int[] ans)
    {
        if(root==null)
        {
            return new HashSet<>();
        }
        
        HashSet<Integer> left=solve(root.left,k,ans);
        HashSet<Integer> right=solve(root.right,k,ans);
        
        left.addAll(right);
        
        left.add(root.data);
        
        if(left.size()<=k)
            ans[0]++;
        
        return left;
    }
    public static int goodSubtrees(n root,int k)
    {
        int[] ans={0};
        solve(root,k,ans);
        
            return ans[0];
    }

}
