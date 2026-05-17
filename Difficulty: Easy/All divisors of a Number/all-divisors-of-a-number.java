class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> div = new ArrayList<>();
        for(int i = 1; i*i<= n; i++){
            if(n % i == 0){
                div.add(i);
                
                if(i != n/i) {
                    div.add(n/i);
                }  
            }
        }
        Collections.sort(div);

       
        
        return div;
    }
}