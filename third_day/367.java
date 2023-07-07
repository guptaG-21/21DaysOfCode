que->367 on leetcode 
	link-> https://leetcode.com/problems/valid-perfect-square/


class Solution{
//using completely binary search code here 
	public boolean isPerfectSquare(int num){
		int start = 1;
		int end = num;
//pay attention here we do not do equals here, reason start can not be less than end
		while(start<=end){
			int mid = start + (end-start)/2;
			if((mid*mid)==num){
				return true;
			}else if(mid>(x/mid)){
				end = mid-1
			}else{
				start = mid+1;
			}	
		}
	return false;
	}
}