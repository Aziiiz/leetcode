class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stk = new Stack<Integer>();
        for(int i = temperatures.length -1; i>= 0; i--) {
            while(!stk.empty() && temperatures[stk.peek()] <= temperatures[i]) {
                stk.pop();
            }
            ans[i] = stk.empty() ? 0 : (stk.peek() - i);
            stk.push(i);
        }
        return ans;
    }
}