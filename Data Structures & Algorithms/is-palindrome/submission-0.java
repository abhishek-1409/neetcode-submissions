class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", ""); 
        str = str.toLowerCase();
        int i=0;
        int j=str.length()-1;

        while(i<=j){
            char a = str.charAt(i);
            char b = str.charAt(j);
            if(a == b){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
