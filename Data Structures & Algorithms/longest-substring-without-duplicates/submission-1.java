class Solution {
    public int lengthOfLongestSubstring(String str) {
        Set<Character> set = new HashSet<>();

        int s = 0;
        int ans = 0;

        for(int e=0; e<str.length(); e++){
            while(set.contains(str.charAt(e))){
                set.remove(str.charAt(s));
                s++;
            }
            set.add(str.charAt(e));
            ans = Math.max(ans, e-s+1);
        }

        return ans;
    }
}
