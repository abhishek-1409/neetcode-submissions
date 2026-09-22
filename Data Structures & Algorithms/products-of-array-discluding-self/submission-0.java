class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int pre = 1;
        for(int i=0; i<n; i++){
            ans[i] = pre;
            pre *= nums[i];
        } // ans = {1, 1, 2, 8}

        int suf = 1;
        for(int i=n-1; i>=0; i--){
            ans[i] *= suf;
            suf *= nums[i];
        } // suf = {48, 24, 12, 8}

        return ans;
    }
}  
