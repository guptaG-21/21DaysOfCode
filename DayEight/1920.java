

class solution{
	public int findPermu(int[] nums){
		int n = nums.length;
		int count = 1;
		/*
		assume-> a = 3 b = 4 , length of arr n = 6
		nums[i] = a+(a%n)*n;
		nums[i] = 3+(3)*6
		->nums[i]= 21;
		
		*/
		for(int i =0;i<n;i++){
			nums[i] = nums[i]+((nums[nums[i]]%n)*n);
		}
		//nums[i] = 21/6-> 3
		//same for other elements as well
		
		for(int i =0;i<n;i++){
			nums[i] = nums[i]/n;
		}
		return nums;
	}
}