class RandomizedSet {
    Set<Integer> set = new HashSet<Integer>();
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(set.contains(val)) return false;
        set.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!set.contains(val)) return false;
        set.remove(val);
        return true;
    }
    
    public int getRandom() {
          Integer[] arrayNumbers = set.toArray(new Integer[set.size()]);
          Random rndm = new Random();
          int rndmNumber = rndm.nextInt(set.size());
          return arrayNumbers[rndmNumber];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */