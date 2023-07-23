


/*
here in this question i am just checking the value with its index ,
and keeping a count variable to count the index
*/

class Solution {
    public int findKthPositive(int[] arr, int k){
		int i=0;
		int count=1;
		//you can keep count as 0 then you will return count only 
		while(k != 0){
			if(i<arr.length){
				if(arr[i] != count){
					count++;
					k--;
				}else{
					i++;
					count++;
				}
			}else{
				k--;
				count++;
			}
		}
		return count-1;
    }
	
}