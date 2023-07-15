class Solution{
	void swap(int[] arr, int first,int second){
		int tmp = arr[first];
		arr[first] = arr[second];
		arr[second] = tmp;
	}
	int findDuplicate(int[] arr){
		int index=0;
		while(index<arr.length){
			if(arr[i] != i+1){
				int correctIndex = arr[index]-1;
				if(arr[index]!=arr[correctIndex]){
					swap(arr,index,correctIndex);
				}else{
					return nums[i]
				}
			}else{
				i++;
			}
		}
		return -1;
	}
}