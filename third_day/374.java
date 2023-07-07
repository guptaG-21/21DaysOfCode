que->374 on leetcode 
	link-> https://leetcode.com/problems/guess-number-higher-or-lowe/


class Solution{
//using completely binary search code here 
	public int guessNumber(int n){
		int start = 1;
		int end = n;
		while(start<=end){
			int mid = start + (end-start)/2;
			if(guess(mid)==0))return mid;
//here if mid is greater then decrease end by one in mid
			if(guess(mid)==-1){
				end = mid-1;
			}else{
				start = mid+1;
			}	
		}
//debug to understand why start , not end?
	return start;
	}
}