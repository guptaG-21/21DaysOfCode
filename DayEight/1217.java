

class solution{
	public int minChip(int[] nums){
		int n = arr.length;
		int even = 0,odd=0;
		for(int num : nums){
			//counting odd and even values
			if(num%2==0){
				even++;
			}else{
				odd++;
			}
		}
		if(odd == n || even == n){
			return 0;
		}
		return Math.min(odd,even);
	}
}