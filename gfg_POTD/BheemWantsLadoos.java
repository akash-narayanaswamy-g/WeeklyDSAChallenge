package gfg_POTD;
import java.util.*;

//Bheem Wants Ladoos
class Node13{
    int data;
    Node13 left;
    Node13 right;
    Node13(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class BheemWantsLadoos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int ladoos(Node13 root, int home, int k){
        Map<Node13,Node13> pMap=new HashMap<>();
        fillParentMap(pMap,null,root);
        
        Node13 targetNode=Node13(root,home);
        
        return bfsTraversal(new HashSet<>(),pMap,targetNode,k);
        
    }
    private static Node13 Node13(Node13 root, int home) {
		// TODO Auto-generated method stub
		return null;
	}

	static void fillParentMap(Map<Node13,Node13> pMap,Node13 parent,Node13 root){
        if(root==null){
            return;
        }
        pMap.put(root,parent);
        fillParentMap(pMap,root,root.left);
        fillParentMap(pMap,root,root.right);
    }
    
    static Node13 searchNode(Node13 root,int target){
        if(root==null || root.data==target){
            return root;
        }
        Node13 left=searchNode(root.left,target);
        if(left!=null){
            return left;
        }
        return searchNode(root.right,target);
    }
    
    static int bfsTraversal(Set<Node13> vis,Map<Node13,Node13>pMap,Node13 root,int k){
        int sum=0;
       
        Queue<Node13> q=new LinkedList<>();
        q.add(root);
        vis.add(root);
        
        while(q.size()>0 && k-->=0){
            int size=q.size();
            
            while(size-->0){
            	Node13 curr=q.remove();
                
            	Node13 par=pMap.get(curr);
            	Node13 left=curr.left;
            	Node13 right=curr.right;
                
                sum+=curr.data;
                if(par!=null && vis.contains(par)==false){
                    vis.add(par);
                    q.add(par);
                }
                
                if(left!=null && vis.contains(left)==false){
                    vis.add(left);
                    q.add(left);
                }
                
                if(right!=null && vis.contains(right)==false){
                    vis.add(right);
                    q.add(right);
                }
            }
        }
        
        return sum;
    }

}
