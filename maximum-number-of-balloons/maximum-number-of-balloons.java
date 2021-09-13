class Solution {
    public int maxNumberOfBalloons(String text) {
        String word = "balloon";
        int[] arr = new int[word.length()];
        for(int i=0; i<word.length(); i++) {
            int count = text.length() - text.replaceAll(Character.toString(word.charAt(i)),"").length();
            if(count == 0) return 0;
            else if((word.charAt(i)=='o' || word.charAt(i)=='l') && count <2 ) return 0;
            arr[i] = count;
        }
        return Math.min(arr[0], Math.min(arr[2]/2, arr[4]/2));
    }
}