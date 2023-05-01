package gfg_POTD;
import java.util.*;

//Subtree In N-ary Tree

class t{
	int data;
	static List<t> children;
	t(int val){
		this.data=val;
		this.children=new ArrayList<>();
	}
}
public class SubtreeInN_aryTree {

	public static void main(String[] args) {

	}
	
	public int duplicateSubtreeNaryTree(t root){
	       Map<String, Integer> subtreeMap = new HashMap<>();

	        constructSubtreeString(root, subtreeMap);

	        int count = 0;
	        for (int freq : subtreeMap.values()) {
	            if (freq > 1) {
	                count++;
	            }
	        }

	        return count;
	    }

	    private String constructSubtreeString(t node, Map<String, Integer> subtreeMap) {
	        StringBuilder sb = new StringBuilder();
	        sb.append(node.data).append(":");

	        List<String> childSubtrees = new ArrayList<>();
	        for (t child : t.children) {
	            childSubtrees.add(constructSubtreeString(child, subtreeMap));
	        }

	        Collections.sort(childSubtrees);

	        for (String childSubtree : childSubtrees) {
	            sb.append(childSubtree).append(",");
	        }

	        String subtreeString = sb.toString();
	        subtreeMap.put(subtreeString, subtreeMap.getOrDefault(subtreeString, 0) + 1);

	        return subtreeString;
	    }

}
