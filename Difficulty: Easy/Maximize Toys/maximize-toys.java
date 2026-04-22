// User function Template for Java

class Solution {
    static int toyCount(int N, int K, int arr[]) {
        // code here
        Arrays.sort(arr);
        int count=0;
        int i =0;
        while(K>0 && i<N){
            if(arr[i]<=K){
                count++;
                K -=arr[i];
            }
            i++;
        }
        return count++;
    }
}