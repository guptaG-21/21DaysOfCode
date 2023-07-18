
/*
Que-> 58 , finding the length of the last word
approach -> just split the string by " " (empty spaces) then calculate the length of new char array.length-1 
*/
			
Class Solution {
	//1st solution
	puclic int lengthOfLastWord(String str){
		//simplity split the string into char array
		char[] words = str.split(" ");
		//getting the last word
		int length = words[words.length-1];
		//returning the length
		return length.length();
	}
	//2nd solution 
	public int lengthOfLastWord(String str){
		boolean gap = false;
		int ans = 0;
		for(int i =str.length()-1;i>=0;i--){
			if(str.charAt(i) == ' '){
				if(gap){
					break;
				}
			}else{
				gap = true;
				ans++;
			}
		}
		return ans;
	}
}
			
			