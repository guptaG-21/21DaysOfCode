que-> 81 on leetcode


class Solution {

    public boolean search(int[] nums, int target) {
        int pivot = findPivotDuplicate(nums);
        if(pivot == -1){
            return binarySearch(nums, target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return true;
        }
        if(nums[0]<=target){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums, target,pivot+1,nums.length-1);
        
    }

    boolean binarySearch(int[] nums, int target,int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                return true;
            }
        } 
        return false;
    }




    int findPivotDuplicate(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid < end && nums[mid]>nums[mid+1]){
                 return mid;
            }else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                if(start<end && nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(end > start && nums[end-1]>nums[end]){
                    return end-1;
                }
                end--;
            }else if(nums[mid]>nums[start] || nums[mid]==nums[start] && nums[mid]>nums[end]){
                    start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}