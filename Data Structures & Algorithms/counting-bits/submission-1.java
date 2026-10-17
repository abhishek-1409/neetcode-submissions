class Solution {
    public int[] countBits(int n) {
        int [] ans = new int [n+1];
        for(int i=1; i<=n; i++){
            int count = 0;
            int t = i;
            while(t!=0){
                t = t & (t-1);
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}
