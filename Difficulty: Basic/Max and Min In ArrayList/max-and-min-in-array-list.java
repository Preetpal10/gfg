class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        // Your code here
        int max= Integer.MIN_VALUE;
        for(int i: arr){
            if( i> max){
                max  = i;
            }
        }
        return max;
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        
        // Your code here
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if( i < min){
                min = i;
            }
        }
        return min;
    }
}
