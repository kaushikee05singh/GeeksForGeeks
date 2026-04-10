// User function Template for Java

class Solution {
    int KthMissingElement(int arr[], int k) {
        // Complete the function
        int count=0;
        HashSet<Integer> set = new HashSet<>();
        int n =arr.length;
        for(int i =0;i<n;i++){
            set.add(arr[i]);
        }
        for(int i =arr[0];i<= arr[n-1];i++){
            if(!set.contains(i)){
                count++;
                if(count==k){
                    return i;
                }
            }
        }
        return -1;
    }
}
