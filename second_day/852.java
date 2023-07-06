ques-> 852 on leetcode
//finding the peak element 
//[1,2,3,4,5,6,7,5,4,3,2] -> assume this is the array and do dry run you will understand 
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return end;
        
    }
}