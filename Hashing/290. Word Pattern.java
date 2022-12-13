class Solution {
    public boolean wordPattern(String pattern, String s) {
      String []arr= s.split(" ");
      int n1= pattern.length();
      int n2 = arr.length;
      if(n1 != n2){
          return false;
      }  
      HashMap<Character,String> map = new HashMap<>();
      for(int i=0;i<n1;i++){
          if(!map.containsKey(pattern.charAt(i))){
            if(map.containsValue(arr[i])){
             return false;
            }      
              map.put(pattern.charAt(i),arr[i]);
          }
          else{
              if(!map.get(pattern.charAt(i)).equals(arr[i])){
                  return false;
              }
          }
      }
      return true;
    }
}

// https://leetcode.com/problems/word-pattern/description/
