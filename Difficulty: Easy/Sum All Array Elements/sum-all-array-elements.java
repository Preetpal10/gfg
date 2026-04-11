class Solution {
    public static int arraySum(int[] arr) {
        int sum = 0;
        
        for(int num : arr){
             
              sum = sum + num ;
        }
        return sum;
    }
}