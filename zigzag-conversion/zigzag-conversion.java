class Solution {
    public String convert(String s, int numRows) {
        if(numRows < 2) return s;
        int n = numRows*2 -2;
        int move = n;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numRows; i++) {
            conversion(i, n, move, sb, s);
            move = move - 2;
        }
                
        return sb.toString();
    }
    
    
    private void conversion(int i, int n, int move, StringBuilder sb, String s) {
        while(i<s.length()) {
            if(move == 0) {
                move = n;
            }
            sb.append(s.charAt(i));
            i = i+ move;
            move = n - move;
        }
    }
}