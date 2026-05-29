// User function Template for Java

class Solution {
    static int map(int n, String keys[], int arr[], String s) {
        // code here
        int i = 0;
        for(String str : keys){
            if( str.equals(s))return arr[i];
            i++;
        }
        return -1;
    }
}