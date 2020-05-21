
public class DuplicateRemove {

	 public static int removeDuplicates(int[] nums) {
		 int result =1;
	     for(int i=0; i<nums.length-1; i++) {
	    	 if(nums[i] != nums[i+1]) {
	    		 result++;
	    	 }
	     }
	     
	     for(int j=0; j<nums.length; j++) {
				System.out.println(nums[j]);
			}
		 
		 return result;
	    }
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		int res = removeDuplicates(nums);
		System.out.println(res);
		
	}

}
