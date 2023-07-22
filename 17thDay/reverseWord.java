


/*
que-> reverse word
*/

class Solution {
    public static  String reverseW(String str){
        String st = "";
        String[] word = str.split(" ");
        for(int i=word.length-1;i>=0;i--){
            if(i == word.length-1){
                st = st+word[i];
            }else{
                st = st+ " "+word[i];
            }

        }
        return st;
    }
	
}