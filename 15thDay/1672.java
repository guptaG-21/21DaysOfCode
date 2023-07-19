

//approach-> just runing two loops where first loop is for row and second for colums in colum i will check all the money that a individual is keeping.

class Solution {
     public int maximumWealth(int[][] arr) {
		 int max = 0;
		for(int i=0;i<arr.length;i++){
			//making sum for every new person money
			int sum = 0;
			for(int j=0;j<arr[o].length;j++){
				sum+=arr[i][j];
			}
			//if have more than the previous
			if(sum>max){
				max = sum;
			}
		}
		return max;
    }
}
