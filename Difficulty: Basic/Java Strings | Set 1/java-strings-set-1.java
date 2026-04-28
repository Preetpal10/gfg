// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        String a = S1+S2;
       StringBuilder sb = new StringBuilder(a);
       sb.reverse();
       
        return sb.toString();
        
    }
}