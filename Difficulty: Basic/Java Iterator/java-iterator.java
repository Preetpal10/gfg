

class Solution {
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        // code here
        ArrayList<Integer> array = new ArrayList<>();
        for(int i= 0;i < n;i++){
        if(arr[i] >= k){
                
                array.add(arr[i]);
            }
        }
            Collections.sort(array);
            return array;
        
    }
}