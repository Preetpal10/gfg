class Solution {
    public static int gcd(int a, int b) {
        int remainder = 0;
        while( b != 0){
             remainder = b;
            b = a % b;
            a = remainder;
        }
        
        return remainder;
        
    
        
    }
}
