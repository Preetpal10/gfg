import java.math.BigInteger;
class Solution {
    public static BigInteger factorial(int n) {
        // code here
           BigInteger a = BigInteger.ONE;
        for(int i = 2; i<=n;i++){
       a= a.multiply(BigInteger.valueOf(i));
        }
        return a;
    }
}
