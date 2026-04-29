// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        String a= " ";

        for(int i = 0; i < S.length(); i+=2){
            a+=S.charAt(i);
            
        }
        return a;
    }
}