// User function Template for Java
class Solution {
    
    
    public static int gcd(int a , int b){
        int rem = b;
    while(b != 0){
        rem = b;
        b = a % b;
        a = rem;
    }
    return rem;
    }
    public static int LCM(int a, int b) {
     int LCM = 0;
    return a * b / (gcd(a,b)) ;
    
    }
    
}