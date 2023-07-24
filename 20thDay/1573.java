


/*

*/

class Solution {
    public int numWays(String s)  {
		//10 power 9 +7
		int mod = (int)1e9+7;
		int n = s.length(),sum=0;
		char[] arr = s.toCharArray();
		for(char ch:arr){
			sum+=ch-'0';
		}
		if(sum%2 != 0){
			return 0;
		}
		sum = sum/3;
		
		if(sum == 0){
			return (int)((((long)(n-2)*(n-1))/2)%mod);
		}
		
		int si=0,s1=0,s2=0;
		
		for(char ch:arr){
			si+=ch-'0';
			if(si==sum){
				s1++;
			}
			if(si == 2*sum){
				s2++;
			}
		}
		return (int)((((long)(s1)*(s2))/2)%mod);
	}
	
}