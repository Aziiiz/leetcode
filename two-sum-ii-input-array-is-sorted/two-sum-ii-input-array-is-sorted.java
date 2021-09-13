class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a1 = 0;
        int a2 = numbers.length -1;
        while(a1<a2) {
            if(numbers[a1]+ numbers[a2] == target) {
                return new int[]{a1+1, a2+1};
            }else if(numbers[a1] + numbers[a2] < target) {
                a1++;
            }else {
                a2--;
            } 
                
        }
        return null;
    }
}
