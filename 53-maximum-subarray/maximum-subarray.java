class Solution {
    public int maxSubArray(int[] nums) {
       int maxSum = Integer.MIN_VALUE;
       int currentSum = 0;
       for(int i=0;i<nums.length;i++){
         currentSum += nums[i];

        maxSum = Math.max(maxSum,currentSum);

        if(currentSum < 0){
            currentSum = 0;
        }
       }
       return maxSum;
    }
}

//  int maxSum = 0; 
//         for(int st=0;st<nums.length;st++){
//             int currentSum = 0;
//             for(int en=st;en<nums.length;en++){
//                       currentSum += nums[en];
//                       maxSum = Math.max(maxSum,currentSum);
//             }
//         }
//         return maxSum;                        O(n^2) - time complexity