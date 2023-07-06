que-> 744 0n leetcode

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int N = letters.length;
        int start = 0 ;
        int end = letters.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(letters[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
//here i am dividing the start with the length of the array 
//try to debug to understand this logic properly
        return letters[start % N];
    }
}