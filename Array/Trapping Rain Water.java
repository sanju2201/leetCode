class Solution {
    public int trap(int[] height) {
        int n= height.length;
        
        // left And right Array
        int left[] = new int [n];
        int right[] = new int [n];
        
        // fill these array
        left[0] = height[0];
        for(int i=1;i<n;i++){
            left[i]= Math.max(left[i-1],height[i]);
        }
        
        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]= Math.max(right[i+1], height[i]);
        }
        
        //Calculate Answer
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += (Math.min(left[i], right[i])-height[i]);
        }
        return ans;

        }
    }



// Efficient Solution with O(n) and O(1)
class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int left =0;
        int right = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;
         // check the conditions
        while(left <= right){
            if(height[left]<= height[right]){
                if(height[left]>= leftMax)
                    leftMax = height[left];
                else
                    ans += leftMax-height[left];
                    left++;                
            }
            else{
                if(height[right]>= rightMax)
                    rightMax = height[right];
                else
                    ans += rightMax-height[right];
                 right--;  
            }
        }
        return ans;
    }
}
