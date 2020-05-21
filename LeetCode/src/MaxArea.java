
public class MaxArea {

	
	 public static int maxArea(int[] height) {
	        int result = 0;
	        int last = height[height.length];
	        int first= 0;
	        for(int i=0; i<height.length ; i++) {
	        	if(last[j] > first[i]) {
	        		result = first[i] * height.length;
	        	}
	        	
	        			
	        }
	        
	        return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,8,6,2,5,4,8,3,7};
		int res = maxArea(arr);
		System.out.println(res);
	}

}
