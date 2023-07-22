




class Solution {
    public boolean checkPalindromeFormation(String a, String b){
		return check(a,b) || check(b,a);
		
	}
	boolean check(String a, String b){
		int i =0,int j=a.length()-1;
		while(i<j && a.charAt(i) == b.charAt(j)){
			++i;
			--j;
		}
		return isPalindrome(a,i,j) || isPalindrome(b,i,j);
	}
	boolean isPalindrome(String a, int i,int j){
		while(i<j && a.charAt(i) == b.charAt(j)){
			++i;
			--j;
		}
		return i>=j;
	}
	
}