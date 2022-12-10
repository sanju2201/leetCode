class Solution {
    public int uniqueMorseRepresentations(String[] words) {
      HashSet<String> set = new HashSet<>();
      String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
      for(String str : words){
         StringBuilder sb = new StringBuilder();
         for(char ch:str.toCharArray()){
             sb.append(morse[ch -'a']);
         }
         set.add(sb.toString());
      } 
      return set.size(); 
    }
}

// https://leetcode.com/problems/unique-morse-code-words/description/
