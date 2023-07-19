/*
Que-> No of ways to tile a wall ?
	problem statement-> 
						implement the following function
							int numberOfWays(int n,int m)
							
-> function accepts two integers as an argument and which are n, m -> 
	n and m represents a n*m wall and you have 1*m tile ->
	tile the wall?
	You may place tile in horizontal or vertical >>>
*/
Class Solution{
public int numberOfWays(int m ,int n){
	//storing the value at each row 
			int[] count = new int[n+1];
			count[0] = 0;
			for(int i=1;i<=n;i++){
			if(i<m){
				count[i] = 1;
			}else if(i == m){
				count[i] = 2;
			}else{
				count[i] = count[i-1] + count[i-m];
			}
		}
		return count[n];
	}
}