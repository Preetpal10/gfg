class Solution {
    public int nthFibonacci(int n) {
        int a = 0; int b = 1;
        int nextterm = 0;
        if( n == 0 ){
            return 0;
        }
        if( n == 1){
            return 1;
        }
        for (int i = 2; i <= n; i++){
            
            nextterm = a + b;
            a = b;
            b = nextterm;
        }
        return nextterm;
    }
}