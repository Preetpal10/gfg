class Solution {
    public static double posAverage(int[] arr) {
        double sum = 0;
        int a = 0;
        double b = 0;
        for (int i = 0 ; i < arr.length; i++){
            if(arr[i] >= 0){
                
                 sum += arr[i];
                 a++;
            }

        }
        b = sum / a;
        return b;
    }
}
