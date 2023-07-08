que-> 33 on leetcode
	link-> https://leetcode.com/problems/search-in-rotated-sorted-array/description/
Note-> its a conceptual question, has many way to solve but my i am using the one which divide this question in three part----------------------->>>>>>>>>>
1-> find maximum number-> pivot
2-> find target in left sorted one 
3-> find in right sorted one


class Solution{
	public int findTarget(int[] arr){
		int pivot = findPivot(arr);
//what if pivot return -1 means the array is not rotated
		if(pivot == -1){
			return binarySearch(arr,target,0,arr.length-1);
		}
//if pivot is same as target 
		if(arr[pivot]==target){
			return pivot;
		}
//just this about this little bit if the array is sorted and rotated the it is pretty //obvious that after pivot all the elements will be small than the start element 
//for example [4,5,6,7,0,1,2,3],   and equals when start = end = element value
//	       ^     ^       ^
//	     start   pivot   target

		else if(arr[0]>=target){
			return binarySearch(arr,target,0,pivot-1);
		}
		return binarySearch(arr,target,pivot+1,arr.length-1);
	}
	//simply finding pivot or can say the maxmum value in sorted and rotated array
	int findPivot(int[] arr){
		int start = 0;
		int end = arr.length-1;
		while(start<=end){
			int mid = start + (end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) return mid;
			if(mid>start && arr[mid]<arr[mid-1])return mid-1;
			if(arr[mid<arr[start]){
				end = mid-1;
			}else{
				start = mid+1;
			}
			
		}
	return -1;
	}
//simple binary search
	int binarySearch(int[] arr,int target,int start,int end){
		int mid = start + (end-start);
		while(start<=end){
			if(arr[mid]==target)return mid;
			if(arr[mid]>target){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
	return -1;
	}
}