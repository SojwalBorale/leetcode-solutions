class Solution {
    public void sortColors(int[] nums) {
     int low = 0, mid = 0, high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    }

  

// Brute force: just sort the array using built-in sort
//        Arrays.sort(nums);             time complexity - O(nlogn)



//   int count=0, count1=0, count2=0;

//       for(int i=0;i<nums.length;i++){
//         if(nums[i]==0){
//             count++;
//             }else if(nums[i]==1){
//                 count1++;
//             }else count2++;
//       }

//       int index=0;
//       for(int i=0;i<count;i++) nums[index++]=0;
//        for(int i=0;i<count1;i++) nums[index++]=1;                  time complexity - O(n)
//         for(int i=0;i<count2;i++) nums[index++]=2;