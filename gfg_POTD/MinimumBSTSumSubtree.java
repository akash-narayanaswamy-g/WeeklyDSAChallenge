package gfg_POTD;

//Minimum BST Sum Subtree
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

public class MinimumBSTSumSubtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int minSubtreeSumBST(int target, Node root) {
        min=Integer.MAX_VALUE;
       helper(root,target);
       return min==Integer.MAX_VALUE?-1:min;
   }
   static int min=Integer.MAX_VALUE;
   static int[]helper(Node root,int target)
   {
       if(root==null)
           return new int[]{0,0,0,0};
           
       int[]left=helper(root.left,target);
       int[]right=helper(root.right,target);
       
       int data=root.data;
       if((left[2]==0 || Math.max(left[1],left[0])<data) &&( right[2]==0 || Math.min(right[0],right[1])>data))
       {
           int sum=left[3]+right[3]+data;
           if(sum==target)
           {
               min=Math.min(min,left[2]+right[2]+1);
           }
           if(left[2]==0)left[0]=data;
           if(right[2]==0)right[1]=data;
           return new int[]{left[0],right[1],left[2]+right[2]+1,sum};
       }
       return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,-1,0};
   }

}
