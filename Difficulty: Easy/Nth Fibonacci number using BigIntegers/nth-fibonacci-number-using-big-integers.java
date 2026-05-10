import java.math.BigInteger;

class Solution {
    public static BigInteger fib(int n) {
        // code here
     BigInteger a = BigInteger.valueOf(1);
      BigInteger b = BigInteger.valueOf(1);
      BigInteger c = BigInteger.valueOf(0);
      
       if( n == 1||n==2){
           return a;
       }
        for(int i = 3; i<=n; i++){
             c = a.add(b);
            a = b;
            b= c;
            
        }
        return c;
    }
}