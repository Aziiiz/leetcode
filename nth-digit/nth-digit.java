class Solution {
    public int findNthDigit(int n) {
        int digit = 1;
        long counter = 9; 
        
        
        while(n - digit * counter > 0) {
            n -= digit * counter; 
            digit++;
            
            counter *= 10;
                
        }
        int basenumber = (int) Math.pow(10, digit -1);

        
        int number = (n-1) / digit + basenumber;
        int mod = (n-1) % digit;

        
        return String.valueOf(number).charAt(mod) - '0';
        
    }
}