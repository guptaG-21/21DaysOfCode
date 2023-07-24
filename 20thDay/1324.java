


/*

*/

class Solution {
    public static List<String> printVertically(String s) {
		String[] words = s.split(" ");
		int longestString = getMaxLength(words);
		
		List<String> str = new ArrayList<>();
		StringBuilder string;
		//settling the words after rearrangement
		for(int i =0;i<longestString;i++){
			string = new StringBuilder();
			for(int j=0;j<words.length;j++){
				if(i>=words[j].length()){
					string.append(' ');
				}else{
					string.append(words[j].charAt(i));
				}
			}
			str.add(trimString(string.toString()));
		}
		return str;
    }
	//trimming the right section of the string
	public String trimRight(String res){
		int i = res.length()-1;
		while(i>=0 && res.charAt(i) == ' '){
			i--;
		}
		return res.substring(0,i+1);
	}
	
	
	
	//finding the maxLength of the string before every space
	public int getMaxLength(String[] words){
		int maxLength;
		for(int i =0;i<words.length;i++){
			if(maxLength < words[i].length()){
			maxLength = words[i].length();
			}
		}
		return maxLength;	
	}
	
}