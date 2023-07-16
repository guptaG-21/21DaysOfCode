

class solution{
	//moores vooting algorithm
	 public int majorityElement(int[] nums) {
       int num = 0;
       int count = 0;
       for(int number:nums){
           if(count == 0){
               num = number;
           }
           if(number == num){
               count++;
           }else{
               count--;
           }
       }
       return num;
    }
}