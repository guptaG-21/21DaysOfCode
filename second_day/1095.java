//leetcode problem number-> 1095 
//we will be doing the problem in three parts 
//1st-> finding peak element 
//2nd-> finding in first half
//3rd-> finding in second half 

//read this carefully ->    * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * //interface MountainArray {
 *//     public int get(int index) {}
 * //    public int length() {}
 *// }
class Solution_for_1095{
// here i am finding the peak element in the array
	int peakElement(MountainArray mountainArr){
		int start = 0;
		int end = mountainArr.length()-1;
		while(start<=end){
			int mid = start + (end - start)/2;
			if(mountainArr.get(mid)>mountainArr.get(mid+1)){
				end = mid;
			}else{
				start = mid + 1;
			}
		}
	}

	public int findInMountainArray(int target, MountainArray mountainArr){
		int peakElement = findPeak(mountainArr);

		
		//finding in first half sorted array
		
		int start = 0;
		int end = peakElement - 1;
		while(start<=end){
			int mid = start + (end - start)/2;
			if(mountainArr(mid)==target) return mid;
			if(mountainArr.get(mid)>target){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}

		//finding in the second half
		
		int start =peakElement ;
		int end = mountainArr.length() - 1;
		while(start<=end){
			int mid = start + (end - start)/2;
			if(mountainArr(mid)==target) return mid;
			if(mountainArr.get(mid)>target){
				start = mid+1;
			}else{
				end = mid-1;
			}
		}		



		return -1;
	}
	
	
}
