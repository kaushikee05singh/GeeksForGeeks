class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int n =arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i =1; i<=n;i++){
            if(map.containsKey(i)){
                res.add(map.get(i));
            }
            else{
                res.add(0);
            }
        }
        return res;
    }
}
