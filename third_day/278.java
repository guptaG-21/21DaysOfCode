que->278 on leetcode 
	link-> https://leetcode.com/problems/first-bad-version/


class Solution{
//using completely binary search code here 
	public int firstBadVersion(int n){
		int start = 1;
		int end = n;
//to store true values
		int ans = -1;
		while(start<=end){
			int mid = start + (end-start)/2;
			if(isBadVersion(mid){
				ans = mid;
				end = mid-1;
			}else{
				start = mid+1;
			}	
		}
	return ans;
	}
}