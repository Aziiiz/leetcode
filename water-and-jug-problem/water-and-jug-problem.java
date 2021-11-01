class Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if(jug1Capacity+jug2Capacity < targetCapacity) return false;
        while(jug2Capacity!= 0) {
            if(jug1Capacity>jug2Capacity) jug1Capacity-=jug2Capacity;
            else jug2Capacity-= jug1Capacity;
        }
            if(targetCapacity % jug1Capacity == 0) return true;
            
            return false;
    }
}