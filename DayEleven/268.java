class Solution{
	void swap(int[] arr, int first,int second){
		int tmp = arr[first];
		arr[first] = arr[second];
		arr[second] = tmp;
	}
	int missingNumber(int[] arr){
		int index=0;
		while(index<arr.length){
			int correctIndex = arr[index]-1;
			if(arr[index]!=arr[correctIndex]){
				swap(arr,index,correctIndex);
			}else{
				index++;
			}
		}
		for(int j=0;j<arr.length;j++){
			if(arr[j] != j){
				return j;
			}
		}
		return nums.length;
	}
}