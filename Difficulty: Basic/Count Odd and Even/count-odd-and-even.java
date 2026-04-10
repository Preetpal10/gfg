class Solution {
    public int[] countOddEven(int[] arr) {
        int even = 0;
        int odd = 0;
        
        for (int n :arr){
            if(n % 2 == 0){
                
                even = even + 1;
            }else{
                
                odd = odd + 1;
            }
        }
    
    return new int [] {odd,even};
        
    }
}