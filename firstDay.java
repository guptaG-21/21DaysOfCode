class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
//finding the indexes seperatly, for true its first position and false last occurence of the target value.
        ans[0] = findFandLposition(nums,target,true);
        ans[1] = findFandLposition(nums,target,false);
        return ans;
    }
    //its  a simply binary search code which is having complexity O(log(n))
    int findFandLposition(int[] arr,int target,boolean firstPosition){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
//calculating mid value 
            int mid = start + (end - start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                ans = mid;
//main points to find first and last occurence of the target 
                if(firstPosition){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}