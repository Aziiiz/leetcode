class Solution {
    public int maxArea(int[] height) {

        
        int left = 0;
        int right = height.length - 1;
        
        int maxWater = 0;
        
        while(left < right){
            int leftWall = height[left];
            int rightWall = height[right];
            
            int minHeight = Math.min(leftWall,rightWall);
            int depth = right - left;
            
            maxWater = Math.max(maxWater, minHeight*depth);
            
            if(leftWall < rightWall){
                left++;
            }else{
                right--;
            }
            
        }
        
        return maxWater;
    }
}