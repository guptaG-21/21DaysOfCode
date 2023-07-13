

class SelectionSort{
	//we have max selected element in the array and swap it with the end
	public void Selection(int[] arr){
		for(int i=0;i<arr.length;i++){
			int end = arr.lenght-i-1;
			int maxItem = getMaxElement(arr,0,end);
			swapElement(arr,maxItem,end);
		}
		
	}
	//checking the max element in the array
	int getMaxElement(int[] arr,int start, int end){
		int max = start;
		for(int i =start;i<=end;i++){
			if(arr[max]<arr[i]){
				max = i;
			}
		}
		return max;
	}
	//just simple swap
	void swapElement(int[] arr, int first,int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}