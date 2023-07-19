


class Solution {
    public int[] shuffle(int[] nums, int n) {
		int[] array = new int[nums.length]
        int i =0;
		int j=0;
		while(i<n){
			//in the below code i am taking care of odd indexes and putting all the values in the array
			array[j] = nums[i];
			i++;
			j++
			//doing for even indexses
			array[j] = nums[n];
			j++;
			n++;
		}
		return nums;
    }
}
