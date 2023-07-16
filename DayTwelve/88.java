

class solution{
	 public void merge(int[] num1, int m, int[] num2, int n) {
        int num1Length = m-1;
        int num2Length = n-1;
        //settling the elements from the last->
        while(num1Length >= 0 && num2Length >= 0){
            //if num1 array has greater then will go into num1[5] for the initial
            if(num1[num1Length] > num2[num2Length]){
                num1[num1Length+num2Length+1] = num1[num1Length];
                num1Length--;
            }else{
                //if equal to or num2 is greater, this will work
                num1[num1Length+num2Length+1] = num2[num2Length];
                num2Length--;
            }
        }
        //if num2 has elements
        while(num2Length >= 0){
            num1[num2Length] = num2[num2Length];
            num2Length--;
        }
    }
}