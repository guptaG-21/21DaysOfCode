
/*
Que-> You have given an array where you have to move all the zeros to the end
for example-> [2,4,1,0,8,,70,7,6,0,3]
			ans-> [2,4,1,8,70,7,6,3,0,0]
			
given-> array and its length n
			*/
			
Class Solution {
	puclic void moveZeros(int[] arr,n){
		int j=0;
		//looping from 0 to n and checking if there is element than zero then just move to the left and zeros to the right
		for(int i=0;i<n;i++){
			if(arr[i] != 0){
				arr[j]=arr[i];
				j++;
			}
		}
		//making all the zeros at jth position cause other than zero has been shifted to the left
		for(int i=j;i<n;i++ ){
			arr[j] = 0;
		}
	}
}
			
			