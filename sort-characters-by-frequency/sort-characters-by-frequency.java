class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) +1);
            }else {
                map.put(s.charAt(i), 1);
            }
        }
        Map<Character, Integer> nMap = sortByValue(map);
        for (Map.Entry<Character, Integer> entry : nMap.entrySet()) {
            char[] repeat = new char[entry.getValue()];
            Arrays.fill(repeat, entry.getKey());
            sb.append(new String(repeat));
        }
        
        return sb.toString();
            
        
    }
    
     public  Map<Character, Integer> sortByValue(Map<Character, Integer> map) {

        return map.entrySet()
                .stream()
                .sorted((Map.Entry.<Character, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

}