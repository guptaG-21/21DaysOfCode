

class solution{
	public int removeDuplicate(int[] arr){
		int n = arr.length;
		int count = 1;
		//checking ith and i-1 element 
		for(int i =1;i<n;i++){
			if(nums[i]!=nums[i-1]){
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}
}