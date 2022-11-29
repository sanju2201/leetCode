class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deq = new ArrayDeque<Integer>();
        int n=nums.length;
        int m = n-k+1;
        int ans[] = new int[m];
        

        // Handel first k element or 1st Window
        for(int i=0;i<k;i++){
            // only add the useful Element
            while(!deq.isEmpty() && nums[i] >= nums[deq.peekLast()] ){
                deq.removeLast();
            }
            deq.addLast(i);
        }
         int j=0;
        for(int i=k;i<n;i++){
            //System.out.print(nums[deq.peek()]+" ");
            ans[j] = nums[deq.peek()];
            j++;

            while(!deq.isEmpty() && deq.peek()<=i-k){
                deq.removeFirst();
            }

            while(!deq.isEmpty() && nums[i] >= nums[deq.peekLast()]){
                deq.removeLast();
            }

            deq.addLast(i);
        }

        ans[j] = nums[deq.peek()];

        return ans;

    }
}
