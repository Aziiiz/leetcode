class Solution {
    public String[] findWords(String[] words) {
        
        //A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z.
        int[] rows = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        List<String> list = new ArrayList<String>();
        for(int i=0; i<words.length; i++) {
            boolean isValid = true;
            String str = words[i].toLowerCase();
            int row = rows[str.charAt(0) - 'a'];
            for(int j=1; j<str.length(); j++) {
                if(rows[str.charAt(j)- 'a'] != row){ 
                    isValid = false;
                    break;
                }
            }
            if(isValid) list.add(words[i]);
        }
       return list.toArray(new String[0]); 
    }
}
