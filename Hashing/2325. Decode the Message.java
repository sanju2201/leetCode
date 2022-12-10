class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        char ch = 'a';
        String key1 = key.replaceAll("\\s","");

        for(int i=0;i<key1.length();i++){
            if(!map.containsKey(key1.charAt(i))){
                map.put(key1.charAt(i),ch++);
            }
        }
        String ans="";
        for(int i=0;i<message.length();i++){
           if(map.containsKey(message.charAt(i))){
               ans += map.get(message.charAt(i));
           }
           if(message.charAt(i)==' '){
               ans += ' ';
           }
        }
        return ans;
    }
}

// https://leetcode.com/problems/decode-the-message/description/
