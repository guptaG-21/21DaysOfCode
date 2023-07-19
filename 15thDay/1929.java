class Solution {
    public int[] getConcatenation(int[] nums) {
        int i =0 ;
        //doubled the array length and made a ans where we will be storing ans
        int[] ans = new int[2*(nums.length)];
        //looping through the ans array and putting the elments at each position
        while(i<ans.length){
            if(i<nums.length){
                //when it runs i=0 t0 i<3
                ans[i] = nums[i];
                i++;
            }else{
                //when i become more tha 3 then (i-nums.length)-> when i =3 -> (3-3)=0 index when i become 4 (4-3)->1st index and then second
                ans[i] = nums[i-nums.length];
                i++;
            }
        }
        return ans;
    }
}