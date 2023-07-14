class InsertionSort{
	void swap(int[] arr, int first,int second){
		int tmp = arr[first];
		arr[first] = arr[second];
		arr[second] = tmp;
	}
	//insertion sort algo
	void insertion(int[] arr){
		for(int i = 0;i<arr.lenght-1;i++){
			for(int j = i+1;j>0;j--){
				if(arr[j]<arr[j-1]){
					swap(arr,j,j-1);
				}else{
					break;
				}
		}
	}
}