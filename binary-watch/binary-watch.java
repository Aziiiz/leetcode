class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
    
        List<String> ret = new ArrayList<>();
        for (int hour = 0; hour < 12; hour++) {
            for (int min = 0; min < 60; min++) {
                
                if (cal(hour) + cal(min) == turnedOn) {
                    
                    String s = "" + hour + ":" + (min <= 9 ? "0" + min : ("" + min));
                    ret.add(s);
                }
            }
        }
        
        return ret;
    }
    
    private int cal(int n) {
        
        int ret = 0;
        while (n > 0) {
            ret += n%2;
            n /= 2;
        }
        
        return ret;
    }
    
}