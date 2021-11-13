class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=2*n-1; i>=0; i--) {
            while(!stack.empty() && stack.peek() <= nums[i%n]) stack.pop();
            
            ans[i%n] = stack.empty() ? -1 : stack.peek();
            stack.push(nums[i%n]);
        }
        return ans;
    }
}