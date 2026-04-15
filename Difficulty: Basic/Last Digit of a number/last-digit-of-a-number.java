class Solution {
    public int lastDigit(int n) {
        int digit = 0;
        if(n >=0){
            
        
        digit = n % 10;
        return digit;
            
        }else{ 
         digit = - n% 10;
         return digit;
        }
    }
}