// User function Template for Java

class Solution {
    public int findMin(int a, int b) {
        // Your code here
        int mul = a * b;
        int div = 1;
        int add = a + b;
        int sub = a - b;
        if( b > 0){
             div = a / b;
        }else{Exception exception;
            
        }
        
        if( add <= sub && add<= mul&& add <= div){
            return add;
        }else if(sub <= add && sub<= mul&& sub <= div){
            return sub;
        }else if(mul <= add && mul <= sub && mul <= div){
            return mul;
        }else return div;
    }
}