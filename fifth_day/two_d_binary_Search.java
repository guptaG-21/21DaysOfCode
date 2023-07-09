
public class sortedMatrixFindNumb {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10,11,12}
        };
        System.out.println(Arrays.toString(Search(arr, 12)));

    }
//    helper function to check target in sorted array
    public static int[] findBinary(int[][] matrix,int row,int sCol,int eCol,int target){
        while(sCol<=eCol){
            int mid = sCol + (eCol-sCol)/2;
            if(matrix[row][mid]==target)return new int[] {row,mid};
            if(matrix[row][mid]>target){
                eCol = mid-1;
            }else{
                sCol = mid+1;
            }
        }
        return new int[] {-1,-1};
    }
//    searching for the target value in the matrix
    public static int[] Search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(cols == 0){
            return new int[]{-1,-1};
        }
        if(rows == 1){
            return findBinary(matrix,0,0,cols-1,target);
        }
        int sRow = 0;
        int eRow = rows-1;
        int cMid = cols/2;
//        checking whether the matrix contains more than two rows
        while(sRow<(eRow-1)){
            int mid = sRow + (eRow-sRow)/2;
            if(matrix[mid][cMid]==target){
                return new int[] {mid,cMid};
            }
            if(matrix[mid][cMid]>target){
                eRow = mid;
            }else {
                sRow = mid;
            }
        }
//        if there are two rows left then we will be having four cases discussed below
        if(matrix[sRow][cMid]==target){
            return new int[] {sRow,cMid};
        }
        if(matrix[sRow+1][cMid]==target){
            return new int[] {sRow+1,cMid};
        }
        if(matrix[sRow][cMid-1]>=target){
            return findBinary(matrix,0,0,cMid-1,target);
        }
        if(matrix[sRow][cMid+1]<=target && target<=matrix[sRow][cols-1]){
            return findBinary(matrix,0,cMid+1,cols-1,target);
        }
        if(matrix[sRow+1][cMid-1]>=target){
            return findBinary(matrix,sRow+1,0,cMid-1,target);
        }else {
            return findBinary(matrix,sRow+1,cMid+1,cols-1,target);
        }
    }
}
