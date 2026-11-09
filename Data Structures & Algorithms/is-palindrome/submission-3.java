class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^0-9a-z]","");
        String rev=new StringBuilder(s).reverse().toString();
        return s.equals(rev);
           }
}
