que->69 on leetcode 
	link-> https://leetcode.com/problems/sqrtx/


class Solution{
//using completely binary search code here 
	public int findSquareRoot(int x){
		int start = 1;
		int end = x;
		while(start<=end){
			int mid = start + (end-start)/2;
//assume mid=x/mid-> (mid*mid = x) try to understand it
			if(mid==(x/mid))return mid;
//here if mid is greater then decrease end by one in mid
			if(mid<(x/mid)){
				end = mid-1;
			}else{
				start = mid+1;
			}	
		}
//debug to understand why end , not start?
	return end;
	}
}