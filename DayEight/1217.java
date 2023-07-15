
//simple bubble sort where we check every adjacent element and swap the greater element with the small one.
class BubbleSort{
	public void bubble(int[] arr){
		//chdcking wheather the elements are sorted or not if not then will not run 2nd for loop
		boolean swap;
		for(int i =0;i<arr.length;i++){
			swap = false;
			for(int j=1;j<arr.length-i-1;j++){
				if(arr[j]<arr[j-1]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swap = true
				}
			}
		}
		if(!swap){
			break;
		}
}