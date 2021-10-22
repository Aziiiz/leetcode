class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
      .boxed()
      .collect(Collectors.toList());
        TreeSet<Integer> set = new TreeSet<Integer>(list);
        if(set.size() < 3) return set.last();
        List<Integer> listNumbers = new ArrayList<Integer>(set);
        
        return listNumbers.get(listNumbers.size()-3);
    }
}