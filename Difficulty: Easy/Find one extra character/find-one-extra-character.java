// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code 
        char[] chars1=s1.toCharArray();
        Arrays.sort(chars1);
        char[] chars2=s2.toCharArray();
        Arrays.sort(chars2);
        
        for(int i=0;i<chars1.length;i++){
            if(chars1[i]!=chars2[i]){
                return chars2[i];
            }
        }
        return chars2[chars2.length-1];
    }
}