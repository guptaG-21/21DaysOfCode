

//approach-> just looping through all elements and taking sum and the putting on the array
//note-> you may take new array to store the new array which include sum
class Solution {
     public int[] runningSum(int[] nums) {
		 int sum =0;
		 for(int i=0i<nums.length;i++){
			 sum+=nums[i];
			 nums[i] = sum;
		 }
		 return nums;
    }
}
