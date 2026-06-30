class Solution {
    public static boolean searchInRow(int[][] matrix, int target, int row){
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0, end = n-1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(target == matrix[row][mid]){
                return true;
            }else if(target > matrix[row][mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        } 
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
      int m = matrix.length;
      int n=matrix[0].length;

      int startRow = 0,  endRow = m-1;
      while(startRow <= endRow){
        int mid = startRow +(endRow-startRow)/2;

        if(target >= matrix[mid][0] && target <= matrix[mid][n-1]){
               return searchInRow( matrix, target,mid);
        }else if(target >= matrix[mid][n-1]){
            // down => right
            startRow = mid+1;
        }else{
            //up => left
            endRow = mid-1;
        }
      }
      return false;
    }
}
    



//   int m =  matrix.length;                     time - O(logM*n)
//         int n = matrix[0].length;

//         int low = 0;
//         int high = m*n-1;

//         while(low<=high){
//             int mid = low +(high-low)/2;

//             int row = mid/n;
//             int col = mid%n;

//             if(matrix[row][col]==target){
//                 return true;
//             }else if(matrix[row][col]<target){
//                 low = mid+1;
//             }else{
//                 high = mid-1;
//             }
//         }
//         return false;