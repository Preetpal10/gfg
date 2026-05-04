class Solution {
    public int nthFibonacci(int n) {
        // code here
        int first = 0;
        int second = 1;
        int nextterm = 0;
        if( n ==0){
            return 0;
        }
        if( n== 1){
            return 1;
        }
        
        for (int i = 2; i<=n; i++){
            
            nextterm = first + second;
            first = second;
            second = nextterm;
        }
        return nextterm;
    }
}