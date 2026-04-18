// User function Template for Java

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        // code here
        
         
         switch(choice){
             
             case 1:
                 Double R = arr.get(0);
                 return Math.PI*R*R;
                 
                 case 2:
                      Double L = arr.get(0);
                       Double B = arr.get(1);
                     return L*B;
         }
         return 0;
    }
}