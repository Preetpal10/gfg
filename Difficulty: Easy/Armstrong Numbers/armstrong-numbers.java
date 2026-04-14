
class Solution {
    static boolean armstrongNumber(int n) {
        int sum = 0;
        int a = n;
        while ( n != 0){
            
            int digit = n % 10;
            
            sum += digit*digit*digit;
            n /= 10;
        }
        if( a == sum){
            return true;
        }else{
            return false;
        }
        
    }
}