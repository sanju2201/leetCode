class Solution {
    public List<Integer> intersection(int[][] nums) {
      int m = nums.length;
      int n = nums[0].length;
      List<Integer> list = new ArrayList<>();
      HashMap<Integer,Integer> map = new HashMap<>();
      int k=0;
      for(int j=0;j<n;j++){
          if(!map.containsKey(nums[k][j])){
              map.put(nums[k][j],1);
          }
      }

      for(int i=1;i<m;i++){
          for(int j=0;j<nums[i].length;j++){
              if(map.containsKey(nums[i][j])){
                  map.put(nums[i][j],map.get(nums[i][j])+1);
              }
            //   else{
            //       map.put(nums[i][j],1);
            //   }
          }
      }

      for(int x:map.keySet()){
          if(map.get(x)==m){
            list.add(x);
          }
      }
      Collections.sort(list);

       return list; 
    }
}

// https://leetcode.com/problems/intersection-of-multiple-arrays/
