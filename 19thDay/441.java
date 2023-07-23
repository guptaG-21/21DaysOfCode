


/*

*/

class Solution {
    public int arrangeCoins(int n){
		//using two pointers to keep watch at every step;
        long i=0;
		long j=n;
		long mid,k;
		//using binary search to find out the resultant
		while(i<=j){
			int mid = i + (j-i)/2;
			k = mid * (mid+1)/2;
			if(k == n)return (int)mid;
			if(k<n){
				i = mid+1;
			}else{
				j = mid-1;
			}
		}
		return (int)j;
    }
	
}