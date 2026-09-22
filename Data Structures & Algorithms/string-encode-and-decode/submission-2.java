class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for (String str : strs) {
            ans += str.length() + "#" + str;
        }
        return ans;
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        
        int i=0; 
        while(i<str.length()){
            int j = str.indexOf('#',i); // find '#'
            int len = Integer.parseInt(str.substring(i,j)); // get the length of string
            String temp = str.substring(j+1, j+1+len); // get the string
            ans.add(temp); // append the list of strings
            i = j+1+len; // move the i pointer to next '#'
        }

        return ans;
    }
}
