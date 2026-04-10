// User function Template for Java

class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] arr) {
        // code here
        int count=0;
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>idx){
                idx=arr[i];
                count++;
            }
        }
        return count;
    }
}