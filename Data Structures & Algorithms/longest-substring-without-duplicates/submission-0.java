class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        String temp = "";
        for(int i=0; i<s.length(); i++){
            if(temp.contains(s.charAt(i)+"")){
                ans = Math.max(ans,temp.length());
                int idx = temp.indexOf(s.charAt(i));
                temp = temp.substring(idx+1);
            }
            temp = temp + s.charAt(i) + "";
        }
        ans = Math.max(ans,temp.length());
        return ans;
    }
}
