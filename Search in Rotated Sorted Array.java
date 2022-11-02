class Solution {
    public int search(int[] nums, int target) {
        int n= nums.length;
        int l=0; int r=n-1;
        int mid;
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid]== target)
                return mid;
            if(nums[l] <= nums[mid]){ //left half is sorted
               if(target>= nums[l] && target<= nums[mid]){
                   r = mid-1;
               } 
                else{
                    l= mid+1;
                }
            }
            else{  // right half is sorted
                if(target>= nums[mid] && target<=nums[r]){
                    l= mid+1;
                }
                else{
                    r=mid-1;
                }
                
            }
            
        }
        return -1;
        
    }
}
