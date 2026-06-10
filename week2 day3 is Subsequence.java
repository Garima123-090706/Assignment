class Solution {
    public boolean isSubsequence(String s, String t) {
       if(s.length()==0){
        return true;
       } 
       int len = 0;
       for(char c: t.toCharArray()){
        if(s.charAt(len)==c){
            len++;
            if(len == s.length()){
                return true;
            }

        }
       }
       return false;
    }
}
