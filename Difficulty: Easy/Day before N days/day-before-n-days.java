// User function Template for Java
class Solution {
    public static int nthDay(int d, int n) {
        // write your code here
        int rem = n % 7;
        int ans = d - rem;
        if(ans<0){
            ans+=7;
        }
        return ans;
    }
}