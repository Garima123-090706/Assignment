class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();

        String rev = new StringBuilder(s).reverse().toString() ;
        if(s.equals(rev)){
            return true;
        }
        return false;    
    }
}
