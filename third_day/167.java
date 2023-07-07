que->167 on leetcode 
	link-> https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/


class Solution{
//using completely binary search code here 
	public int[] twoSum(int[] nums, int target){
		int start = 0;
		int end = nums.length-1;
//to store indexes
		int[] ans = {-1,-1};
//pay attention here we do not do equals here, reason start can not be less than end
		while(start<end){
			int sum = nums[start]+nums[end];
			if(sum==target){
				ans[0] = start+1;
				ans[1] = end+1;
			}else if(sum>target){
				end--;
			}else{
				start++;
			}	
		}
	return ans;
	}
}