
/*
* given an array arr[], which contains integers of length N, find the prod of the sum of all the numbers larger than that number with the sum of all the numbers less than that number for each number in the array;
* example-> arr[] = [8,4,5,3,2,6,9,1]
* ans-> 189,120,90,45,15,9,0,0
*
*explaination-> element would be 8 for first iteration ->
*               smaller than 8, elements sum-> 4+5+3+2+1+6= 21
*               larger than 9, elements sum -> 9=9
*               prod of both = 21*9=> 189
* this will be repeated for all the elements
* */

//i have used the extra space you may modify the existing one
public class arraySum {
    public static void main(String[] args) {
        int[] arr = {8,4,5,3,2,6,9,1};
        System.out.println(helper(arr));
    }
    public static List<Integer> helper(int[] array){
        int prod = 0;
        int sum1 = 0;
        int sum2 = 0;
        int k = 0;
        List<Integer> li = new ArrayList<>();
        while(k<array.length){
            int num = array[k];
            for (int i = k+1; i <array.length ; i++) {
                //largest number than the existing one
                if(num < array[i]){
                    sum1+=array[i];
                }else{
                    sum2+=array[i];
                }
            }
            k++;
            prod = sum1*sum2;
            li.add(prod);
            sum1=0;
            sum2=0;
            prod=0;
        }

        return li;
    }
}