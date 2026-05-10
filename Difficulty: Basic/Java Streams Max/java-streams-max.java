// User function Template for Java
class Solution {

    public static int maxUsingStreams(int[] arr) {
        // Your code here
      int a=  Arrays.stream(arr).max().getAsInt();

        // Use stream().max().getAsInt()
        return a;
    }
}