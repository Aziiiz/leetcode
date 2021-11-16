class Solution {
    public boolean judgeCircle(String moves) {
       int up = 0;
       int dn = 0;
       int lf = 0;
       int rt = 0;
        
       for(int i=0; i<moves.length(); i++){
           if(moves.charAt(i) == 'U') up++;
           else if(moves.charAt(i) == 'D') dn++;
           else if(moves.charAt(i) == 'L') lf++;
           else rt++;
       }
       if(up == dn && lf == rt) return true;
       return false; 
    }
}
