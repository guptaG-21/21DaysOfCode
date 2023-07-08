class duplicatePivot{
    public static void main(String[] args) {
        int[] array = {2,2,9,4,3,2,2};
        System.out.println(duplicatePivotAns(array));
    }
    public static int duplicatePivotAns(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                if(start<end && arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(end > start && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}