// User function Template for Java
class Solution {
    public static int countOnce(int arr[]) {
        
if (arr == null) {
        return 0; 
    }

    HashSet<Integer> hs = new HashSet<>
    (Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
    return hs.size();
    }
}
