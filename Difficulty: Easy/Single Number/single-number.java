// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int num:arr){
            if(map.get(num) %2 !=0){
                return num ;
            }
        }
        return 0;
    }
}