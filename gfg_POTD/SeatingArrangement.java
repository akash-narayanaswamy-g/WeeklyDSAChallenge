package gfg_POTD;

//Seating Arrangement
public class SeatingArrangement {

	public static void main(String[] args) {
		int n = 2,m = 7,seats[] = {0, 0, 1, 0, 0, 0, 1};
		System.out.println(is_possible_to_get_seats(n, m, seats));
	}
	
	public static boolean is_possible_to_get_seats(int n, int m, int[] arr) {
		
	      if(m==1 && arr[0]==0 && n==1)return true; 
	      if(m==1 && arr[0]==1 && n==0)return true; 
	      
	      
	      if(arr[0] ==0 && arr[1] ==0){
	          arr[0] =1; 
	          n--;
	      }
	      
	      for(int i = 1; i<m-1; i++){
	          if(arr[i-1]==0 && arr[i]==0 && arr[i+1]==0){
	              arr[i] = 1; 
	              n--; 
	          }
	          
	      }
	      
	      if(arr[m-1]==0 && arr[m-2]==0)n--; 
	      
	      return n<=0; 
    }

}
