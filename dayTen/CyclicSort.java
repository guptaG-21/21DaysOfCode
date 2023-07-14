class CyclicSort{
	void swap(int[] arr, int first,int second){
		int tmp = arr[first];
		arr[first] = arr[second];
		arr[second] = tmp;
	}
	//cyclic sort algo
	void cyclic(int[] arr){
		int index=0;
		while(index<arr.length){
			int correctIndex = arr[i]-1;
			if(arr[i]!=arr[correctIndex]){
				swap(arr,i,correctIndex);
			}else{
				i++;
			}
		}
	}
}