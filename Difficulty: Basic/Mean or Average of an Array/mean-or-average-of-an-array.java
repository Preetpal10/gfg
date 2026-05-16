class Solution {
    public static int findMean(int[] arr) {
        // code here
        int sum = 0; 
        int n = 0;
        
        for(int i = 0; i < arr.length ; i++){
            n++;
            sum += arr[i];
        }
        
        int mean = sum/ n;
        return mean;
    }
}