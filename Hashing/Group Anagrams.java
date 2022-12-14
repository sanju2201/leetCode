class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        
        for(String st:strs){
            char [] ch= st.toCharArray();
            Arrays.sort(ch);
             String key = String.valueOf(ch);
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(st);
        }
        return new ArrayList<>(map.values());
        
    }
}
