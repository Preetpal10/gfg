// User function Template for Java
class Solution {
    public static LinkedList<Integer> insertion(int arr[]) {
        // Your code here
         LinkedList<Integer> list = new  LinkedList<>();
         for(int i =  0; i < arr.length; i++){
             list.add(arr[i]);
         }
         return list;
    }
}