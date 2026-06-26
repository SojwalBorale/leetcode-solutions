class Solution {
    public int maxArea(int[] height) {
    int maxwater = 0;
    int left = 0;
    int right = height.length-1;
    while(left<right){
        int width = right-left;
        int h = Math.min(height[left],height[right]);
        maxwater = Math.max(maxwater,width*h);
         if(height[left]<height[right]){
            left++;
         }else{
            right--;
         }
    }
    return maxwater;
            }
}
    // int maxwater = 0;
    // for(int i=0;i<height.length;i++){
    //     for(int j=i+1;j<height.length;j++){
    //         int width = j-i;
    //         int h = Math.min(height[i],height[j]);
    //         int area = width*h;
    //         maxwater = Math.max(maxwater,area);
    //     }
    // }
    // return maxwater;           time complexity = O(n^2)


    // int left = 0;
    //     int right = height.length-1;
    //     int maxArea = 0;
        
    //     while(left<right){
    //         int width = right-left;
    //         int h = Math.min(height[left],height[right]);

    //         maxArea = Math.max(maxArea,width*h);
    //         if(height[left]<height[right]){
    //             left++;
    //         }else{
    //             right--;
    //         }
    //     }
    //     return maxArea;