class Solution{
	void swap(int[] arr, int first,int second){
		int tmp = arr[first];
		arr[first] = arr[second];
		arr[second] = tmp;
	}
	List<Integer> findDisappearedNumbers(int[] arr){
		int index=0;
		while(index<arr.length){
			int correctIndex = arr[index]-1;
			if(arr[index]!=arr[correctIndex]){
				swap(arr,index,correctIndex);
			}else{
				index++;
			}
		}
		List<Integer> list = new ArrayList<>();
		for(int j=0;j<arr.length;j++){
			if(arr[j] != j+1){
				list.add(j+1);
			}
		}
		return list;
	}
}